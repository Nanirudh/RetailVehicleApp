FROM openjdk:latest
ADD target/partservice.jar partservice.jar
EXPOSE 8106
ENTRYPOINT ["java", "-jar", "partservice.jar"]