FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
COPY ./target/catalogue.jar /opt/app/
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar /opt/app/catalogue.jar
