FROM openjdk:11
ADD ./build/libs/*.jar user-server-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /user-server-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/user-server-0.0.1-SNAPSHOT.jar"]