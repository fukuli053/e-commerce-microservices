FROM openjdk:11
ADD ./build/libs/*.jar auth-server-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /auth-server-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/auth-server-0.0.1-SNAPSHOT.jar"]