FROM maven:3.8.5-openjdk-17-slim AS builder

# 构建的工作目录设置为/app
WORKDIR /app

# 首先只复制 pom.xml 并下载依赖
COPY pom.xml .
RUN mvn dependency:go-offline

# 然后复制整个项目并构建应用
COPY src ./src
RUN mvn package

# 在这里添加查看文件列表的命令
RUN ls -al /app/target

# 使用 Jetty 镜像
FROM jetty:12.0-jre17-alpine

# 复制构建后的 WAR 文件到 Jetty 的 webapps 目录中
COPY --from=builder /app/target/blog_server.war /var/lib/jetty/webapps/root.war

# 暴露 Jetty 的默认端口
EXPOSE 8080

# 定义启动命令，不需要CMD ["ls","-al","|","echo"]
