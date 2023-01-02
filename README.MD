This repository contains methods to Dockerize Java Projects.

###### [[Docker Reference Documents]](https://github.com/rahulvaish/ReferenceDocuments/tree/master/UnderstandingDocker)

### Table of Contents
  - <a href='#Dockerizing-helloworld-java-application'>Dockerizing HelloWorld Java Application</a> 
  - <a href='#dockerizing-springboot-application'>Dockerizing SpringBoot Application</a> 
  - <a href='#springboot-inter-container-communication'>SpringBoot Inter Container Communication</a> 
  - <a href='#springboot-mysql-container-communication'>SpringBoot-MySQL Container Communication</a> 
  - <a href='#springboot-dockercompose'>SpringBoot-DockerCompose</a> 
  - <a href='#springboot-dockervolume'>SpringBoot-DockerVolume</a> 
  
<hr>

- ###### [Dockerizing HelloWorld Java Application](https://github.com/rahulvaish/Docker-Java/tree/HelloDocker/HelloWorldJavaDocker) 
   ###### This example illustrates how to Dockerize a simple Java Project. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/HelloDocker)
    <img width="1287" alt="image" src="https://user-images.githubusercontent.com/689226/210193168-aadb4d2f-add4-46ee-8bd3-379b545b0737.png">
    <img width="1076" alt="image" src="https://user-images.githubusercontent.com/689226/210193296-677a4a81-61fd-4c81-9a38-2c04fabb340a.png">
    <img width="1435" alt="image" src="https://user-images.githubusercontent.com/689226/210193357-b993c27b-8d4d-4e5b-a33a-83823b2b83d2.png">
  
  - Now, **tag** your image and **push** on Docker Hub. Execute the below commands:
  - docker login --username=rahulvaish
  - Enter your password (on prompt)
  - docker tag helloworldjavadocker rahulvaish/helloworldjavadocker
  - docker push rahulvaish/helloworldjavadocker
    <img width="806" alt="image" src="https://user-images.githubusercontent.com/689226/210193600-5899fc6c-0506-4d02-bcae-7ac8104556e7.png">
   
 <hr>

- ###### [Dockerizing SpringBoot Application](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDocker) 
   ###### This example illustrates how to Dockerize a SpringBoot Project. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDocker)
    <img width="1728" alt="image" src="https://user-images.githubusercontent.com/689226/210188180-34499ca2-d80b-44fb-be59-0432138fcbd9.png">
    <img width="1642" alt="image" src="https://user-images.githubusercontent.com/689226/210188193-406cc1f0-67b8-424a-9627-060e0881d267.png">
    <img width="1723" alt="image" src="https://user-images.githubusercontent.com/689226/210188233-129c85a8-36c9-4400-9cdb-d2da767b1970.png">
    <img width="382" alt="image" src="https://user-images.githubusercontent.com/689226/210188343-e0cd9f17-af3f-4c96-9d98-6aea5be05087.png">

  - Now, **tag** your image and **push** on Docker Hub. Execute the below commands:
  - docker login --username=rahulvaish
  - Enter your password (on prompt)
  - docker tag springbootdocker rahulvaish/springbootdocker
  - docker push rahulvaish/springbootdocker
    <img width="810" alt="image" src="https://user-images.githubusercontent.com/689226/210193571-6b418088-5b9c-44ca-962d-369d2b3adf85.png">
  



- ###### [SpringBoot Inter Container Communication](https://github.com/rahulvaish/Docker-Java/tree/SpringBootContainerIO) 
   ###### This example illustrates how SpringBoot Docker containers communicate. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootContainerIO)
   - Start the docker containers: </br>
     ![image](https://user-images.githubusercontent.com/689226/66031134-69e76f80-e520-11e9-8900-63de8c17228a.png) </br>
   - Test the service: **CalculatorServiceClient** container inteacts with **CalculatorService** container.  </br>
     ![image](https://user-images.githubusercontent.com/689226/66031356-d82c3200-e520-11e9-9892-3e5cb5456b11.png)


- ###### [SpringBoot-MySQL Container Communication](https://github.com/rahulvaish/Docker-Java/tree/SpringBootMySQL) 
   ###### This example illustrates how SpringBoot Docker container communicates with MySQL container. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootMySQL)
   - Start the MySQL container: </br>
   ```
   docker run --name mysqlcontainer -d -p 3306:3306 -e MYSQL_DATABASE=dev -e MYSQL_ROOT_PASSWORD=root mysql
   ```
   - Create Table & Insert some Data:  </br>
   ![image](https://user-images.githubusercontent.com/689226/66045139-b8a50180-e540-11e9-964a-08e07d555c77.png)

   - **Build** & **Run** SpringBoot Image: </br>
   ```
   docker build -f Dockerfile -t springbootdockermysqldocker .
   
   docker run -p 9070:9070 springbootdockermysqldocker
   
   FYI: On MAC, docker run -p 9070:9070 --link mysqlcontainer:mysqlcontainer springbootdockermysqldocker 
   ```
   - Test the service: </br>
   ![image](https://user-images.githubusercontent.com/689226/66045691-daeb4f00-e541-11e9-8d6d-c797604fa387.png)



    
- ###### [SpringBoot-DockerCompose](https://github.com/rahulvaish/Docker-Java/tree/DockerCompose) 
   ###### This example illustrates how Docker Compose works with two springBoot Projects.Here, CalculatorService is *Producer* and CalculatorServiceClient is *Consumer* [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/DockerCompose)
   - First prepare the docker images of both **CalculatorService** and **CalculatorServiceClient**
   - Navigate till the client folder, and execute **docker-compose up** command. </br>
     ![image](https://user-images.githubusercontent.com/689226/66038857-e7b37700-e530-11e9-9bc1-b8bb6c8515dc.png)
   - Test the service: **CalculatorServiceClient** container inteacts with **CalculatorService** container.  </br>
     ![image](https://user-images.githubusercontent.com/689226/66038816-cce10280-e530-11e9-9253-08ed215ce8f5.png)


- ###### [SpringBoot-DockerVolume](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDockerVolume) 
   ###### This example illustrates how Docker Volumes works with SpringBoot Project.The experiment was carried on *MAC* and not on *Docker Quickstart Terminal* (which could not allow local mounting) Besides, *Docker For Windows* could only run on *WIN-10-PRO*. The command to execute Docker Volumes for this project is *docker run -p 8080:8080 -v /Users/rvaish/SBDV/LocalMountForLogs:/app/logs springbootdockervolume*
   
  


