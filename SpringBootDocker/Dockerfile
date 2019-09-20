FROM java:8
EXPOSE 8080  
ADD /target/SpringBootKubernetesConfigMaps.jar SpringBootKubernetesConfigMaps.jar
ENTRYPOINT ["java", "-jar", "SpringBootKubernetesConfigMaps.jar"]
