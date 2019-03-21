# Examen de Programación

C.F.G.S Desarrollo de Aplicaciones Multiplataforma
Módulo: Programación
20 de marzo de 2018

# Instrucciones para la realización y entrega del examen

*	Haz un fork desde tu cuenta de GitHub del siguiente repositorio:

	https://github.com/examentes/20180320damprog.


*	Ejecuta Eclipse y clona el fork que acabas de realizar.


*	Importa el proyecto si no lo has hecho durante la clonación.


*	Abre el fichero README.md y leelo completamente antes de realizar el examen.


*	Resuelve los ejercicios realizando una confirmación cada vez que completes cada uno de ellos.

*	En el proyecto de Eclipse se ha creado un paquete para cada ejercicio. Por tanto, las clases e interfaces que se definan en cada ejercicio deberán pertenecer al paquete corresponidente.

### Ejercicio 1

Se desea crear en Java las clases necesarias que representen objetos gráficos con el objetivo de que puedan servir, entre otras cosas, para el desarrollo de juegos 2D.

-	Por un lado necesitaremos representar figuras geométricas: inicialmente circulos, rectángulos y cuadrados, pero es posible que en un futuro se desee representar otras figuras geométricas. Los únicos atributos comunes a todas ellas serán su color (`java.awt.Color`), su posición en el plano y la indicación de si estarán rellenas o tendrán únicamente un contorno. Además, todas las figuras geométricas podrán informar de su área, de su perímetro y suministrar información textual en forma de cadena que incuya tanto los detalles particulares como los detalles comunes de su estado.


-	Los circulos quedarán definidos por su radio.


-	Los rectangulos quedarán definidos por la longitud de su base y de su altura.


-	Los cuadrados quedarán definidos por la longitud de su lado.


-	Todos las figuras geometricas proporcionarán los métodos get y set que permitan consultar y modificar su estado.


-	Los objetos se podrán crear con un color por defecto, con opción de relleno por defecto o con ambos por defecto.


-	Además de figuras geométricas, necesitaremos representar los tipicos sprites que se definen mediante un bitmap (`java.awt.image.BufferedImage`) y la posición que ocuparán en el plano. El bitmap no se podrá cambiar, pero si su posición. Estos objetos proporcionarán los métodos get que permitan conocer su estado.


-	Tanto figuras geométricas como sprites podrán moverse por el plano indicando el desplazamiento a realizar en ambos ejes.

### Ejercicio 2

En el método main de una clase llamada `Ejercicio2`, poner a prueba las clases definidas en el ejercicio anterior con sentencias que pongan de manifiesto el uso de polimorfismo en el tratamiento de figuras geométricas y sprites, todos ellos almacenados en un mismo `HashSet`.

Por otro lado, dotar a las figuras geométricas de una ordenación por defecto utilizando como criterio de ordenación el área de menor a mayor.

Crear además un comparador que permita ordenar utilizando como primer criterio de ordenación el relleno (primero las figuras rellenas y luego el resto) y como segundo criterio de ordenación el perímetro de menor a mayor.

Poner a prueba mediante un `ArrayList` todas las formas de ordenación establecidas, incluidas aquellas en las que se ordene en orden inverso.

### Ejercicio 3

Crea la clase Ejercicio3 y resuelve en el método `main` el problema siguiente: 

El usuario introducirá por teclado varios compuestos quimicos. En la primera línea introducirá el número de compuestos químicos que escribirá a continuación, uno por línea. Una vez leidos los compuestos químicos se mostrarán en pantalla, sin repetir, todos los elementos de la tabla periódica que intervienen en dichos compuestos.

Resolver el problema utilizando colecciones.

**Ejemplo**: 

Entrada:

	4
	Ce O
	Mo O Ce
	Ee
	Mo

Salida:

	Ce Ee Mo O

### Ejercicio 4

Crea la clase Ejercicio4 y resuelve en el método `main` el problema siguiente:

El usuario introducira una serie de líneas para agregar entradas a una agenda de teléfonos o para buscar un número según las especificaciones siguientes:

*	No se establecerá ningún límite al número de entradas que se podrán agregar. El único límite será la capacidad de memoria del ordenador.

* Si en una línea se especifica un nombre seguido de un guión seguido de un número de teléfono, se agrega esta información a la agenda. Si el nombre ya estaba en la agenda, simplemente se sustituye el teléfono antiguo por el nuevo.

* Si en una línea se especifica la palabra buscar seguida de dos puntos (:) seguidos de un nombre, se buscará su número de teléfono en la agenda. Si no se encuentra se mostrará el mensaje correspondiente, en caso contrario se mostrará su número de teléfono.

El programa finalizará cuando el usuario introduzca la palabra fin en una línea.

**Ejemplo**: 

Entrada: `María-600000001`
Entrada: `Alberto-600000002`
Entrada: `Elena-600000003`
Entrada: `buscar:María`
Salida:  `María -> 600000001`
Entrada: `buscar:Fernando`
Salida:  `Fernando no se encuentra en la agenda`
Entrada: `Fernando-600000004`
Entrada: `fin`

# Criterios de calificación

La puntuación máxima de cada ejercicio será:

*	Ejercicio 1: 3 puntos.


*	Ejercicio 2: 2 puntos.


*	Ejercicio 3: 2 puntos.


*	Ejercicio 4: 3 puntos.
	

Los ejercicios con errores de sintaxis tendrán una calificación de cero puntos.

Las soluciones parciales obtendrán un porcentaje de la puntuación máxima en función del grado de aproximación a alguna solución completa del problema siempre que no existan errores de sintaxis.

