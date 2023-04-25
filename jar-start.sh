mvn clean install -DskipTests
pwd
cd target
nohup java -Xms512m -Xmx1024m -jar $PROJ_PATH/target/jenkinsTest-0.0.1-SNAPSHOT.jar
echo "------------------ end ---------------------"