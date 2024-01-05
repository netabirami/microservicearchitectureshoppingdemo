# Use an official OpenJDK runtime as a parent image
FROM  khipu/openjdk17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/ProductService-0.0.1-SNAPSHOT.jar /app/ProductService-0.0.1-SNAPSHOT.jar

EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "ProductService-0.0.1-SNAPSHOT.jar"]
