FROM openjdk:21

COPY ./target/Calculator-SPE-MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar ./

WORKDIR ./

CMD ["java", "-jar", "Calculator-SPE-MiniProject-1.0-SNAPSHOT-jar-with-dependencies.jar"]