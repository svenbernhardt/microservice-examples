FROM java:8

#RUN groupadd -g 10001 appuser && useradd -r -u 10001 -g appuser appuser

#VOLUME /home/appuser
ADD ./target/hello-app-service.jar /tmp/hello-app-service.jar
RUN chmod 666 /tmp/hello-app-service.jar

#USER appuser

EXPOSE 9080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/hello-app-service.jar"]