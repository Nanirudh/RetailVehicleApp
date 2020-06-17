FROM openjdk:latest
ADD target/pricingservice.jar pricingservice.jar
EXPOSE 8107
ENTRYPOINT ["java", "-jar", "pricingservice.jar"]