FROM java:8
ADD target/rh-1-customer-service-0.0.1-SNAPSHOT.jar rh-1-customer-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","rh-1-customer-service-0.0.1-SNAPSHOT.jar" ]