FROM openjdk:17-jdk-alpine
VOLUME /tmp
EXPOSE 9002
ADD target/apiGateway-0.0.1-SNAPSHOT.jar app.jar
RUN apk --no-cache add curl
ENTRYPOINT ["java","-jar","/app.jar"]