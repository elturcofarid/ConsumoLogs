FROM openjdk:14.0-jdk-slim
EXPOSE 80
#COPY $path /
ADD ./target/consumidorLogs-0.0.1-SNAPSHOT.jar servicio-eureka.jar 
ENTRYPOINT ["java", "-jar", "/servicio-eureka.jar"]
