#FROM openjdk:11.0.12
#VOLUME /tmp
#EXPOSE 8080
#ADD build/libs/java-template-api-0.0.1-SNAPSHOT.jar java-template-api.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/java-template-api.jar"]
FROM openjdk:11.0.12
VOLUME /tmp
EXPOSE 8080
#RUN mkdir -p /app/logs/
ADD target/java-template-api-0.0.1-SNAPSHOT.jar java-template-api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "java-template-api.jar"]