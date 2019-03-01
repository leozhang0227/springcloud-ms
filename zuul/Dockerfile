FROM openjdk:8-jre
VOLUME /usr/test
ADD gateway-service-1.0.jar app.jar
EXPOSE 8449
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
