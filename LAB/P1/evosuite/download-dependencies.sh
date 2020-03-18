
# JUNIT
mvn dependency:get -DremoteRepositories=http://repo1.maven.org/maven2/ \
                   -DgroupId=junit -DartifactId=junit -Dversion=4.12 \
                   -Dtransitive=false

# Hamcrest
mvn dependency:get -DremoteRepositories=http://repo1.maven.org/maven2/ \
                   -DgroupId=org.hamcrest -DartifactId=hamcrest-core -Dversion=1.3 \
                   -Dtransitive=false

