FROM openjdk:8-jdk-alpine
LABEL maintainer="1976730661@qq.com"c
ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"
WORKDIR /build
ARG JAR_FILE=target/k8s-demo-1.0.jar
COPY ${JAR_FILE} k8s-demo.jar

EXPOSE 8888

CMD java ${JAVA_OPTS} -jar /build/k8s-demo.jar