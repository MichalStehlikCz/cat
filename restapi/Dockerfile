FROM jboss/wildfly
ADD ./target/catalogue.war /opt/jboss/wildfly/standalone/deployments/
ENV PROVYSDB_USER EALOADER
ENV PROVYSDB_PWD heslo
ENV PROVYSDB_MINPOOLSIZE 1
ENV PROVYSDB_MAXPOOLSIZE 3
