FROM java:8
EXPOSE 8080  
ADD /target/CalculatorClient.jar CalculatorClient.jar
ENTRYPOINT ["java", "-jar", "CalculatorClient.jar"]