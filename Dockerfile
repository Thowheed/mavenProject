FROM openjdk:21
EXPOSE 8088
COPY target/demo1.jar /demo1.jar
ENTRYPOINT ["java", "-jar", "/demo1.jar"]