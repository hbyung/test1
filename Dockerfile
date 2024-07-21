FROM tomcat:9.0
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]