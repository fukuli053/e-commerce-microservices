FROM openjdk:11
ADD server/gateway-service/target/*.jar gs-gateway-0.1.0.jar
RUN bash -c 'touch /gs-gateway-0.1.0.jar'
ENTRYPOINT ["java", "-jar", "/gs-gateway-0.1.0.jar"]