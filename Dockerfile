FROM openjdk:8-jdk-alpine
COPY target/deployment-demo-0.0.1-SNAPSHOT.jar deployment-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/deployment-demo-0.0.1-SNAPSHOT.jar"]