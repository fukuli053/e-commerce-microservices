FROM openjdk:11
ADD server/suggestion-search-service/target/*.jar suggestion-search-service-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /suggestion-search-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/suggestion-search-service-0.0.1-SNAPSHOT.jar"]