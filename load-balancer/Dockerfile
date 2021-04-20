# FROM adoptopenjdk:11-jre-hotspot as builder
# ARG JAR_FILE=target/s3training-eurekaserver-0.0.1-SNAPSHOT.jar
# COPY ${JAR_FILE} application.jar
# RUN java -Djarmode=layertools -jar application.jar extract
# EXPOSE 9000
# ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]

# FROM adoptopenjdk:11-jre-hotspot as builder
# EXPOSE 9000
# ADD /target/load-balancer-0.0.1-SNAPSHOT.jar load-balancer-0.0.1-SNAPSHOT.jar
# ENTRYPOINT ["java","-jar","load-balancer-0.0.1-SNAPSHOT.jar"]


FROM adoptopenjdk:11-jre-hotspot as builder
FROM maven:alpine
# image layer
WORKDIR /app/spring-eureka-member
# Image layer: with the application
COPY ./load-balancer /app/load-balancer
RUN mvn -v
RUN mvn clean install -DskipTests
ENTRYPOINT ["java", "-Deureka.client.serviceUrl.defaultZone=http://localhost:9000/eureka","-jar","/app/load-balancer/target/load-balancer-0.0.1-SNAPSHOT.jar"]