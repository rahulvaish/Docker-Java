This repository contains methods to Dockerize Java Projects.

###### [[Docker Reference Documents]](https://github.com/rahulvaish/ReferenceDocuments/tree/master/UnderstandingDocker)

### Table of Contents
  - <a href='#Dockerizing-helloworld-java-application'>Dockerizing HelloWorld Java Application</a> 
  - <a href='#dockerizing-springboot-application'>Dockerizing SpringBoot Application</a> 
  - <a href='#springboot-inter-container-communication'>SpringBoot Inter Container Communication</a> 
  - <a href='#springboot-mysql-container-communication'>SpringBoot MySQL Container Communication</a> 
  - <a href='#springboot-docker-compose'>SpringBoot Docker Compose</a> 
  - <a href='#springboot-docker-volume'>SpringBoot Docker Volume</a> 
  
<hr>

- ###### [Dockerizing HelloWorld Java Application](https://github.com/rahulvaish/Docker-Java/tree/HelloDocker/HelloWorldJavaDocker) 
   ###### This example illustrates how to Dockerize a simple Java Project. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/HelloDocker)
   * Download the HelloWorldJavaDocker project.
   * Navigate inside the HelloWorldJavaDocker project folder from Docker QuickStart Terminal.
   * Execute the below commands-
   ![image](https://user-images.githubusercontent.com/689226/50370746-6195f780-05d2-11e9-90b9-b34824d24a36.png)   
   ![image](https://user-images.githubusercontent.com/689226/50370760-9609b380-05d2-11e9-8beb-73244f00a763.png)
   * Check Docker Hub: [[Docker Hub URL]](https://cloud.docker.com/repository/docker/rahulvaish/helloworldjavadocker)
   ![image](https://user-images.githubusercontent.com/689226/50370779-f0a30f80-05d2-11e9-9421-947f4c90d509.png)
   To run the image on Docker: </br>
   ![image](https://user-images.githubusercontent.com/689226/53510292-a44ce200-3ae3-11e9-95cc-aa1c10bbf99e.png)

 <hr>

- ###### [Dockerizing SpringBoot Application](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDocker) 
   ###### This example illustrates how to Dockerize a SpringBoot Project. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDocker)
   - Introduce a Dockerfile in your Project's 'root':
   ![image](https://user-images.githubusercontent.com/689226/64903001-1aefac80-d6cf-11e9-8283-057bbf17d8d0.png)
   - Notice the plugin introduced in pom.xml 
   ![image](https://user-images.githubusercontent.com/689226/50370570-2a721700-05cf-11e9-80b1-98e85560114d.png)
  - Dockerfile for this project would look like:
   ![image](https://user-images.githubusercontent.com/689226/50369597-44572e00-05be-11e9-8770-753592e37ca4.png)
  - Initiate Docker Quick Start Terminal
  - Navigate till inside your Project's 'root'. Exeute the below commands:
   ![image](https://user-images.githubusercontent.com/689226/50369643-145c5a80-05bf-11e9-9ce1-9ce8e4b809f9.png)
  - Now, the application is Up and Running.
  - To know your IP:</br>
   ![image](https://user-images.githubusercontent.com/689226/50369691-8af95800-05bf-11e9-9763-489b66899c94.png)
  - Test your Application:</br>
   ![image](https://user-images.githubusercontent.com/689226/50369706-ae240780-05bf-11e9-91ff-0c4716ecacf8.png)
  - Now, **tag** your image and **push** on Docker Hub. Execute the below commands:
  - docker login --username=rahulvaish
  - Enter your password (on prompt)
  - docker tag springbootdocker rahulvaish/springbootdocker
  - docker push rahulvaish/springbootdocker
  - Check Docker Hub:[[Docker Hub URL]](https://cloud.docker.com/u/rahulvaish/repository/docker/rahulvaish/springbootdocker)
  ![image](https://user-images.githubusercontent.com/689226/50370495-c00ca700-05cd-11e9-97a3-1f33262301b7.png)
  - **NOTE: Therefore to execute any SpringBoot project from Docker Hub**:
   ![image](https://user-images.githubusercontent.com/689226/50369766-9731e500-05c0-11e9-935e-b345b93ad8d4.png)



- ###### [SpringBoot Inter Container Communication](https://github.com/rahulvaish/Docker-Java/tree/SpringBootContainerIO) 
   ###### This example illustrates how SpringBoot Docker containers communicate. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootContainerIO)
   - Start the docker containers: </br>
     ![image](https://user-images.githubusercontent.com/689226/66031134-69e76f80-e520-11e9-8900-63de8c17228a.png) </br>
   - Test the service: **CalculatorServiceClient** container inteacts with **CalculatorService** container.  </br>
     ![image](https://user-images.githubusercontent.com/689226/66031356-d82c3200-e520-11e9-9892-3e5cb5456b11.png)


- ###### [SpringBoot MySQL Container Communication](https://github.com/rahulvaish/Docker-Java/tree/SpringBootMySQL) 
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



    
- ###### [SpringBoot Docker Compose](https://github.com/rahulvaish/Docker-Java/tree/DockerCompose) 
   ###### This example illustrates how Docker Compose works with two springBoot Projects.Here, CalculatorService is *Producer* and CalculatorServiceClient is *Consumer* [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/DockerCompose)
   - First prepare the docker images of both **CalculatorService** and **CalculatorServiceClient**
   - Navigate till the client folder, and execute **docker-compose up** command. </br>
     ![image](https://user-images.githubusercontent.com/689226/66038857-e7b37700-e530-11e9-9bc1-b8bb6c8515dc.png)
   - Test the service: **CalculatorServiceClient** container inteacts with **CalculatorService** container.  </br>
     ![image](https://user-images.githubusercontent.com/689226/66038816-cce10280-e530-11e9-9253-08ed215ce8f5.png)


- ###### [SpringBoot Docker Volume](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDockerVolume) 
   ###### This example illustrates how Docker Volumes works with SpringBoot Project.The experiment was carried on *MAC* and not on *Docker Quickstart Terminal* (wich could not allow local mounting) Besides, *Docker For Windows* could only run on *WIN-10-PRO*. The command to execute Docker Volumes for this project is *docker run -p 8080:8080 -v /Users/rvaish/SBDV/LocalMountForLogs:/app/logs springbootdockervolume*
   
  


