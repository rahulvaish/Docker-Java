### To Dockerize a SpringBoot Project. Follow the below steps:
  - Introduce a Dockerfile in your Project's 'root':
  ![image](https://user-images.githubusercontent.com/689226/50369586-0eb24500-05be-11e9-9e95-d5f328f136aa.png)
  - Dockerfile for this project would look like:
   ![image](https://user-images.githubusercontent.com/689226/50369597-44572e00-05be-11e9-8770-753592e37ca4.png)
  - Notice the plugin introduced in pom.xml 
   ![image](https://user-images.githubusercontent.com/689226/50370570-2a721700-05cf-11e9-80b1-98e85560114d.png)
 - Initiate Docker Quick Start Terminal
  - Navigate till inside your Project's 'root'. Exeute the below commands:
   ![image](https://user-images.githubusercontent.com/689226/50369643-145c5a80-05bf-11e9-9ce1-9ce8e4b809f9.png)
  - Now, the application is Up and Running.
  - To know your IP:</br>
   ![image](https://user-images.githubusercontent.com/689226/50369691-8af95800-05bf-11e9-9763-489b66899c94.png)
  - Test your Application:</br>
   ![image](https://user-images.githubusercontent.com/689226/50369706-ae240780-05bf-11e9-91ff-0c4716ecacf8.png)
  - Now, **tag** your image and **push** on Docker Hub. Execute the below commands:
  - docker login
  - docker tag springbootdocker rahulvaish/springbootdocker
  - docker push rahulvaish/springbootdocker
  - Check Docker Hub:[[Docker Hub URL]](https://cloud.docker.com/u/rahulvaish/repository/docker/rahulvaish/springbootdocker)
  ![image](https://user-images.githubusercontent.com/689226/50370495-c00ca700-05cd-11e9-97a3-1f33262301b7.png)
  - To execute **any** SpringBoot project from Docker Hub:
   ![image](https://user-images.githubusercontent.com/689226/50369766-9731e500-05c0-11e9-935e-b345b93ad8d4.png)

<hr>

##### Document: [StepsToDockerizeSpringBootProject](https://github.com/rahulvaish/ReferenceDocuments/blob/master/UnderstandingDocker/StepsToDockerizeSpringBootProject.docx)
##### Document: [StepsToDeploySpringBootDockerImageOnOpenShift](https://github.com/rahulvaish/ReferenceDocuments/blob/master/UnderstandingDocker/StepsToDeploySpringBootDockerImageOnOpenShift.docx)
##### Document: [StepsToDeploySpringBootDockerImageOnKubernetes[Minikube]](https://github.com/rahulvaish/ReferenceDocuments/tree/master/Understanding%20Kubernetes)

<hr>

##### [Docker Hub URL](https://hub.docker.com/r/rahulvaish/springbootdocker/)



