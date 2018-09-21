FROM openjdk:8-jdk-alpine
MAINTAINER Maksym Stepanenko <stepanenkomaksi@gmail.com>
RUN  apk update && apk upgrade && apk add netcat-openbsd && apk add bash
RUN mkdir -p /usr/local/hello-service
ADD @project.build.finalName@.jar /usr/local/hello-service/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh