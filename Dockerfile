FROM openjdk:21

COPY ./target/Calculator_SPE_MiniProject-1.0-SNAPSHOT.jar ./

WORKDIR ./

CMD ["java", "-jar", "Calculator_SPE_MiniProject-1.0-SNAPSHOT.jar"]