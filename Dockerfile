FROM openjdk:11
EXPOSE 8080
ADD target/TfgSoftAlba.jar TfgSoftAlba.jar 
ENTRYPOINT ["java","-jar","TfgSoftAlba.jar"]

