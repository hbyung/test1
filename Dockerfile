FROM tomcat:9.0

LABEL org.opencontainers.image.authors="edowon0623@gmail.com"

COPY ./target/*.jar /usr/local/tomcat/webapps/