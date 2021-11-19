FROM openjdk:11
ADD ./build/libs/*.jar gateway-server-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /gateway-server-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/gateway-server-0.0.1-SNAPSHOT.jar"]