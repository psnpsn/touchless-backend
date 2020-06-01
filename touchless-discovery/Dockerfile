FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/touchless-discovery-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ms-discovery.jar
ENTRYPOINT ["java","-jar","/ms-discovery.jar"]
