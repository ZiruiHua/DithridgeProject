FROM openjdk:8
VOLUME /tmp
ADD target/coreservice-0.0.1-SNAPSHOT.jar coreservice-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","coreservice-0.0.1-SNAPSHOT.jar"]