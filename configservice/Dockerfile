FROM openjdk:latest
ADD target/Configservice.jar configservice.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar", "configservice.jar"]