FROM openjdk:latest
ADD target/leadservice.jar leadservice.jar
EXPOSE 8105
ENTRYPOINT ["java", "-jar", "leadservice.jar"]