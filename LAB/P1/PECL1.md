---
title: 'PECL 1'
author:
  - 'Juan Casado Ballesteros'
  - 'Jose Luis Gonzalez Fernandez-Cid'
---

## PARTE 1

Hemos descargado el proyecto jMetal desde github.
Había varias opciones para hacerlos pues en github mantienen tanto versiones anteriores de la aplicación como versiones que actualmente están en desarrollo.
Hemos realizado los test sobre las siguientes versiones:

* jMetal 6.0 disponible en: https://github.com/jMetal/jMetal
* jMetal 5.7 disponible en: https://github.com/jMetal/jMetal/blob/gh-pages/jMetal-jmetal-5.6.zip (En la url pone 5.6 pero realmente se descarga la versión 5.7)
* jMetal 5.0 disponible en: https://github.com/jMetal/jMetal/blob/gh-pages/jMetal-jmetal-5.0.zip

Para descargar las versiones tan solo es necesario clonar el repositorio jMetal.

```bash
git clone https://github.com/jMetal/jMetal.git
```

### Ejecución de los tests

El primer paso ha sido descargar de github el código junto con los tests.
Posteriormente hemos ejecutado las siguientes instrucciones sobre cada uno de las versiones descargadas.

```bash
mvn compile
mvn test
```

### Cálculo de la covetura



### Ejecución de un ejemplo

Adicionalmente hemos probado algunos de los ejemplos incluidos con la aplicación para comprobar que se ejecutaban adecuadamente.
Incluimos los comandos ejecutados para probar el algoritmo de optimización multi objetivo NSGAII.

```bash
mvn package
export CLASSPATH=jmetal-core/target/jmetal-exec-5.7-SNAPSHOT-jar-with-dependencies.jar:jmetal-problem/target/jmetal-exec-5.7-SNAPSHOT-jar-with-dependencies.jar:jmetal-exec/target/jmetal-exec-5.7-SNAPSHOT-jar-with-dependencies.jar:jmetal-problem/target/jmetal-exec-5.7-SNAPSHOT-jar-with-dependencies.jar
java org.uma.jmetal.runner.multiobjective.NSGAIIRunner
```

## PARTE 2

Crearemos el mismo código de ejemplo con dos lenguajes de programación distintos, Java y JavaScript.

El código creado consiste en un método aproximado de calcular integrales.
Dicho código se compone de dos partes, una encargada del cálculo de la integral y otra encargada de construir la función sobre la que la integral se va a calcular.

Para construir la función tendremos múltiples clases que forman un árbol de ejecución que al evaluarse proporcionando valores a la función que describe para el punto concreto que se le haya indicado. Podremos realizar pruebas sobre dichas funciones de modo que comprobemos que para valores conocidos de ciertas funciones obtenemos el resultado adecuado.

Para el cálculo de las integrales utilizamos un método aproximado que calcula iterativamente pequeños trozos del área bajo la función en varios puntos de esta y los acumula. Podremos de este modo calcular integrales finitas acotadas entre dos valores reales con una precisión mayor cuanto mayor sea la cantidad de áreas que calculemos. Para una mejor explicación de esto ver la figura.

### Diagrama de clases

### Diagrama de actividad

### Diagrama de casos de uso

### Pruebas realizadas con travis

### Pruebas realizadas con M
