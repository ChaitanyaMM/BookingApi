FROM openjdk:8-jdk-alpine
MAINTAINER chaitanya
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/BookingAPI-0.0.1-SNAPSHOT.jar"]