FROM openjdk:11
ADD ./build/libs/*.jar eureka-server-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /eureka-server-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/eureka-server-0.0.1-SNAPSHOT.jar"]