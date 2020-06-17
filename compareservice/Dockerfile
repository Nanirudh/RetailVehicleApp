FROM openjdk:latest
ADD target/compareservice.jar compareservice.jar
EXPOSE 8101
ENTRYPOINT ["java", "-jar", "compareservice.jar"]