FROM openjdk:8-jdk-alpine

LABEL maintainer="rogeriotakashi@hotmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/TogglzExample-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} togglz-example.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/togglz-example.jar"]