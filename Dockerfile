FROM amazoncorretto:17-alpine-jdk
MAINTAINER achrefhk
COPY target/pagination-0.0.1-SNAPSHOT.jar pagination.jar
ENTRYPOINT ["java","-jar","/pagination.jar"]