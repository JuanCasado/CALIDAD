
#####################################################
# CALCULATES COVERAGE FOR ALL CLASES OF THE PROJECT #
#####################################################

# CALCULATES COVERAGE FOR A SINGLE CLASS
coverage () {
  TARGETCLASS=$1
  TARGETTEST=$1_ESTest

  java -jar evosuite-1.0.6.jar -measureCoverage \
    -class $TARGETCLASS -Djunit=$TARGETTEST \
    -criterion branch -projectCP ../integrals-java:./evosuite-tests
}

# GET THE CLASSES OF THE PROJECT
classes=$(java -jar evosuite-1.0.6.jar -listClasses -target ../integrals-java)

for class in ${classes[@]};
do
  echo "-----------COVERAGE-----------"
  echo $class
  echo "------------------------------"
  coverage $class
done
