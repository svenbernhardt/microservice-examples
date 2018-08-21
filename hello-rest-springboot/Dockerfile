FROM java:8
VOLUME /tmp
ADD ./target/hello-rest-springboot-1.0.0.0.jar hello.jar
EXPOSE 8080
RUN bash -c 'touch /hello.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello.jar"]
