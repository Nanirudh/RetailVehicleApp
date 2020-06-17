FROM openjdk:latest
ADD target/configureservice.jar configureservice.jar
EXPOSE 8900
ENTRYPOINT ["java", "-jar", "configureservice.jar"]