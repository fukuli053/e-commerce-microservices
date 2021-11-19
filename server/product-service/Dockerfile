FROM openjdk:11
ADD ./build/libs/*.jar product-service-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /product-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/product-service-0.0.1-SNAPSHOT.jar"]