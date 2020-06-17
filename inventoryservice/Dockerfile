FROM openjdk:latest
ADD target/inventoryservice.jar inventoryservice.jar
EXPOSE 8104
ENTRYPOINT ["java", "-jar", "inventoryservice.jar"]