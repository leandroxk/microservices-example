FROM openjdk:11

ENV APP_FILE java-codes-1.0-SNAPSHOT-spring-boot.jar
ENV APP_HOME /usr/apps

EXPOSE 8080
COPY target/$APP_FILE $APP_HOME/

WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]