FROM java:8
EXPOSE 8080 28017 28018 28019
ADD /target/proposal-0.0.1-SNAPSHOT.jar proposal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","proposal-0.0.1-SNAPSHOT.jar"]