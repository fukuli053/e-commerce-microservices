FROM openjdk:11
ADD server/payment-service/target/*.jar payment-service-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /payment-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/payment-service-0.0.1-SNAPSHOT.jar"]