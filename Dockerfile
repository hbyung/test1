FROM tomcat:10.1.26-jdk17-temurin-jammy

LABEL org.opencontainers.image.authors="edowon0623@gmail.com"

COPY ./target/*.war /usr/local/tomcat/webapps/

# FROM bellsoft/liberica-openjdk-alpine:17
# # or
# # FROM openjdk:8-jdk-alpine
# # FROM openjdk:11-jdk-alpine
#
# CMD ["./gradlew", "clean", "build"]
# # or Maven
# # CMD ["./mvnw", "clean", "package"]
#
# VOLUME /tmp
#
# ARG JAR_FILE=build/libs/*.jar
# # or Maven
# # ARG JAR_FILE_PATH=target/*.jar
#
# COPY ${JAR_FILE} app.jar
#
# EXPOSE 80
#
# ENTRYPOINT ["java","-jar","/app.jar"]