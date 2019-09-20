FROM java:8

#Create base app folder
WORKDIR /app
EXPOSE 8080  
ADD /target/SpringBootDockerVolume.jar SpringBootDockerVolume.jar
ENTRYPOINT ["java","-jar","SpringBootDockerVolume.jar"]
