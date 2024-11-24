# Use a base image with Java runtime
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/ArgiProducts-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 9898

# Define the entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
