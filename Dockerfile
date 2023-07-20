FROM openjdk:17
ADD target/springboot-k8s-demo.jar springboot-k8s-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/springboot-k8s-demo.jar"]
