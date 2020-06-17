FROM openjdk:latest
ADD target/productservice.jar productservice.jar
EXPOSE 8108
ENTRYPOINT ["java", "-jar", "productservice.jar"]