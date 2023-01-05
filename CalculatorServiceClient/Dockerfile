FROM openjdk:17
EXPOSE 8090  
ADD /target/CalculatorClient.jar CalculatorClient.jar
ENTRYPOINT ["java", "-jar", "CalculatorClient.jar"]