FROM openjdk:17-jdk-alpine
EXPOSE 9000
ADD target/eureka-0.0.1-SNAPSHOT.jar app.jar
RUN apk --no-cache add curl
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]