FROM openjdk:17.0.2-jdk-slim
COPY ./build/libs/pet-care-system-0.0.1-SNAPSHOT.jar /usr/local/lib/pet-care-system/pet-care-system-0.0.1-SNAPSHOT.jar
RUN sh -c "touch /usr/local/lib/pet-care-system/pet-care-system-0.0.1-SNAPSHOT.jar"
CMD java -jar /usr/local/lib/pet-care-system/pet-care-system-0.0.1-SNAPSHOT.jar