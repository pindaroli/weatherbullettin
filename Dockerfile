#FROM openjdk:8-jdk-alpine
FROM corpie/alpine-java
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
WORKDIR /run
ARG  JAR_FILE=target/weatherbulletin-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} cazzo.jar
ENTRYPOINT ["java","-jar","cazzo.jar"]