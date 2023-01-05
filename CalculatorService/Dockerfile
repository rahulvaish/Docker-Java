FROM openjdk:17
EXPOSE 8080  
ADD /target/CalculatorService.jar CalculatorService.jar
ENTRYPOINT ["java", "-jar", "CalculatorService.jar"]