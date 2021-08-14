FROM openjdk:13
EXPOSE 8888
ADD ./target/app-invoice-0.0.1-SNAPSHOT.jar    app-invoice.jar
ENTRYPOINT ["java","-jar","/app-invoice.jar"]