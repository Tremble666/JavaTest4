FROM registry.saas.hand-china.com/hap-cloud/base
ADD start.sh ./start.sh
COPY target/test4.jar  /test4.jar
CMD ["./start.sh"]

