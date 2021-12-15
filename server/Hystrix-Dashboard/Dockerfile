FROM openjdk:11
ADD server/hystrix-dashboard/target/*.jar hystrix-dashboard-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /hystrix-dashboard-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar", "/hystrix-dashboard-0.0.1-SNAPSHOT.jar"]