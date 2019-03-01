FROM openjdk:8-jre
VOLUME /usr/test
ADD service-two-1.0.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
