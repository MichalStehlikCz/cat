FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
COPY ./target/catalogue-hollow-thorntail.jar /opt/app
COPY ./target/catalogue.war /opt/app/
EXPOSE 8080
ENTRYPOINT exec java -Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses=true $JAVA_OPTS -jar /opt/app/catalogue-hollow-thorntail.jar /opt/app/catalogue.war

