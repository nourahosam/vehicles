FROM openjdk:17-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ./target/vehicles-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8881

ENTRYPOINT ["java", "-jar", "app.jar"]