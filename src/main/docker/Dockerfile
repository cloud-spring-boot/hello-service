FROM gcr.io/distroless/java
MAINTAINER Maksym Stepanenko <stepanenkomaksi@gmail.com>

ADD @project.build.finalName@.jar /usr/local/hello-service/

ENTRYPOINT [ \
"java", \
"-Deureka.client.serviceUrl.defaultZone=$EUREKASERVER_URI", \
"-Djava.security.egd=file:/dev/./urandom", \
"-jar", \
"/usr/local/hello-service/hello-service-1.0.0-SNAPSHOT.jar" \
]
