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
  
 <hr>


- ###### [SpringBoot Inter Container Communication](https://github.com/rahulvaish/Docker-Java/tree/SpringBootContainerIO) 
   ###### This example illustrates how SpringBoot Docker containers communicate. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootContainerIO)
   - Create a private network </br>
     <img width="1433" alt="image" src="https://user-images.githubusercontent.com/689226/210277696-4ec888be-dac0-4627-9800-2d3a6c2e57b4.png">
   - Build then Start first container under private network:
     ![image](https://user-images.githubusercontent.com/689226/210277246-9f70aa87-d0a9-4396-936f-5078c00f7167.png)
     ![image](https://user-images.githubusercontent.com/689226/210277296-74e6a58f-012e-4f64-86d8-b236077ed4ab.png)
   - Build then Start second container under same private network:  
     <img width="1706" alt="image" src="https://user-images.githubusercontent.com/689226/210277582-4cea0c1c-3873-4f40-92a5-9c4ef8d27594.png">
     <img width="1723" alt="image" src="https://user-images.githubusercontent.com/689226/210277524-2dd0664b-b656-44db-9cd2-7582f7cafaff.png">   
   - Test - Making hit to second container which internally hits first container:
     <img width="742" alt="image" src="https://user-images.githubusercontent.com/689226/210277405-3d2aaaf9-7621-490b-8165-f2b778f280c5.png">


  

 <hr>
 
- ###### [SpringBoot-MySQL Container Communication](https://github.com/rahulvaish/Docker-Java/tree/SpringBootMySQL) 
   ###### This example illustrates how SpringBoot Docker container communicates with MySQL container. [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/SpringBootMySQL)
   - Create a private network
     ![image](https://user-images.githubusercontent.com/689226/210200502-13125f24-77f8-4597-88cb-1215c4e16e76.png)
   - Start the MySQL container: </br>
     ```
     docker container run --network springbootmysqlntw --name mysqlcontainer  -d -p 3306:3306 -e MYSQL_DATABASE=mysqldb -e MYSQL_ROOT_PASSWORD=root mysql
     ```
   - Create Table & Insert some Data:  </br>
     <img width="1160" alt="image" src="https://user-images.githubusercontent.com/689226/210198420-c762e7af-7bda-4621-8ee8-0bc7a6fafc6a.png">
   - Build & Start SpringBoot Application (on same private network)
     <b>NOTE:</b> We are not hardcoding DB's IP. Instead using container's name.
     ![image](https://user-images.githubusercontent.com/689226/210200459-d2bba194-d5f3-496b-a0cb-0bb4616e8559.png)
     <img width="1691" alt="image" src="https://user-images.githubusercontent.com/689226/210200719-fccf68c6-0388-4ddc-929d-cea1a80b2987.png">
     <img width="750" alt="image" src="https://user-images.githubusercontent.com/689226/210200787-e50b31c0-a789-4983-9f6d-231c956b8f3d.png">

  <hr>



    
- ###### [SpringBoot-DockerCompose](https://github.com/rahulvaish/Docker-Java/tree/DockerCompose) 
   ###### This example illustrates how Docker Compose works with two springBoot Projects.Here, CalculatorService is *Producer* and CalculatorServiceClient is *Consumer* [[Source Code]](https://github.com/rahulvaish/Docker-Java/tree/DockerCompose)
   - First prepare the docker images of both **CalculatorService** and **CalculatorServiceClient**
   - Navigate till the client folder, and execute **docker-compose up** command. </br>
     ![image](https://user-images.githubusercontent.com/689226/66038857-e7b37700-e530-11e9-9bc1-b8bb6c8515dc.png)
   - Test the service: **CalculatorServiceClient** container inteacts with **CalculatorService** container.  </br>
     ![image](https://user-images.githubusercontent.com/689226/66038816-cce10280-e530-11e9-9253-08ed215ce8f5.png)


- ###### [SpringBoot-DockerVolume](https://github.com/rahulvaish/Docker-Java/tree/SpringBootDockerVolume) 
   ###### This example illustrates how Docker Volumes works with SpringBoot Project.
     ![image](https://user-images.githubusercontent.com/689226/210479721-87f0c8d9-147b-4bc8-a5e0-60fc1a6bc30a.png)
     ![image](https://user-images.githubusercontent.com/689226/210479748-5a18d375-9e26-4021-a56e-bccd517a2d0f.png)
     ![image](https://user-images.githubusercontent.com/689226/210479768-990335f0-2277-47a6-81ac-afe9736ef465.png)


   
  


