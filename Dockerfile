FROM eclipse-temurin:17
COPY target/awst.jar awst.jar 
CMD [ "java","-jar","awst.jar" ]