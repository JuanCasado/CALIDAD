
##########################################
# RUNS THE TESTS CREATED FOR THE PROJECT #
##########################################

## SETUP CLASSPATH
CLASSPATH=""
# DOWNLOADED DEPENDENCIES
CLASSPATH=".:/Users/mrblissfulgrin/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:$CLASSPATH"
CLASSPATH=".:/Users/mrblissfulgrin/.m2/repository/junit/junit/4.12/junit-4.12.jar:$CLASSPATH"
# EVOSUITE DEPENDENCIES
CLASSPATH=".:/Users/mrblissfulgrin/Documents/UAH_2019_2020/CALIDAD/LAB/P1/evosuite/evosuite-1.0.6.jar:$CLASSPATH"
CLASSPATH=".:/Users/mrblissfulgrin/Documents/UAH_2019_2020/CALIDAD/LAB/P1/evosuite/evosuite-standalone-runtime-1.0.6.jar:$CLASSPATH"
# OUR CLASSES FOLDER
CLASSPATH=".:/Users/mrblissfulgrin/Documents/UAH_2019_2020/CALIDAD/LAB/P1/integrals-java:$CLASSPATH"
## END SETUP

# TESTS MUST BE RUN FROM THE TESTS FOLDER
user_dir=$(pwd)
cd /Users/mrblissfulgrin/Documents/UAH_2019_2020/CALIDAD/LAB/P1/evosuite/evosuite-tests

# LOAD TESTS RUNNERS
if [ -z $1 ];
then
  tests_to_run=$(find . ! -name "*_scaffolding*" -type f | grep .class | cut -d"." -f2 | cut -d"/" -f2)
else
  tests_to_run=$1
fi
java org.junit.runner.JUnitCore $tests_to_run

# GO TO THE CALLER FOLDER
cd $user_dir
