# ProyectoBuses
proyecto final asignatura programación 2 año 2023
  
Vicente Andres Hernandez Guerraty
Luis Castro

En nuestro caso nos tocó el "problema de los buses" el cual consta de crear una aplicación para el uso de personal de una empresa de buses, en la cual se pueda básicamente, completar una orden de compra de un viaje en bus.
en nuestro caso, podrás escoger entre 3 orígenes y 3 destinos, 5 fechas de ida y 3 fechas de vuelta (nos complicamos un poco con el sistema de buses), además puedes escoger si quieres un asiento tipo cama o uno semi cama, los cuales se encuentran en
el segundo y primer piso de un imaginario bus respectivamente.

Patrones de diseño a utilizar:
  Memento. para guardar el estado de los asientos y selecciones al momento de querer volver atras en algun paso
  Command. En general bueno para trabajar con interfaces gráficas, en este caso la idea es manejar todos los botones con el sistema de comandos
  Singleton. En un principio pensamos que podía ser buena idea que los buses fueran generados al azar cada vez que uno quisiese hacer una compra pero nos dimos cuenta que es mejor y más realista que haya un solo 
              deposito de buses, así podemos mostrar en una segunda iteración como se inhabilitan los asientos ya comprados.

Pequeña bitácora:
  
22/11/23
  LLevaremos ya una semana mas o menos trabajando en el proyecto y no hemos tenido mayor inconveniente la verdad, lo unico que cambiaria seria haber empezado antes a programar con los patrones en mente,
  La única forma de mejorar esto es planificar mejor el método de trabajo a llevar a cabo, además de conocer muy bien cómo funcionan y cómo se implementan cada uno de los patrones.

23/11/23 
  Hoy hubo retroalimentación con el cliente, en resumen vamos en buen camino, nos resaltó también el hecho de empezar luego con algun patron de diseño, antes de que se complique más el código, con respecto a eso
  Singleton será un nuevo patrón de diseño que siento que será útil.

01/12/23
  Después de una semana ocupada con certámenes, hoy volvimos a trabajar en el proyecto, a estas alturas ya tenemos nuestro singleton implementado para la lista de buses la cual ya no es aleatoria al 100%, se sigue creando aleatoriamente pero esta vez al iniciar el
  programa, así la lista de buses es constante con cada iteración del proyecto, aún no implementamos memento ni command y estamos dudando su viabilidad, debido a la mala decisión de empezar el proyecto sin esto en mente, además hoy creamos una ventana donde podemos
  seleccionar los buses y se muestra su información. Hablando con el cliente llegamos a la conclusión, en base a como habíamos hecho el código, de que podíamos usar simplemente un par de fechas y un par de destinos así que hicimos eso.

10/12/23
  Nuevamente una semana sin avanzar grandes cantidades, simplemente cambiando algunos aspectos del programa para que se vea mas bonito gráficamente, sin embargo, ayer y hoy fueron días pesados teníamos pensado terminar ayer pero por distintas situaciones no se pudo
  en general todo fue bastante bien, hubo que hacer cambios en el cómo escogemos que busca mostrar al momento de seleccionar un origen y un destino, hasta el momento no hemos sido capaces de lograr bloquear los asientos después de seleccionarlos, si demostrarlo de
  forma gráfica pero no de boton.setEnabled(false). Además añadimos 2 nuevas ventanas que servirán para: primero, mostrar un resumen de la "compra" y entregar datos personales necesarios y segundo una ventana bastante liviana en código, ya que, su unica funcion es 
  reiniciar el programa y mostrar un mensaje de compra exitosa.


Informe formal post proyecto.

número grupo: 18
Integrantes: Vicente hernández , Luis Castro

(el diagrama UML, el diagrama de casos de uso y las imágenes de la interfaz se adjuntan en el git)

Patrones utilizados:
  Pese a haber estudiado el uso de 3 patrones distintos, por complicaciones varias sumado a la mala práctica de empezar el codigo sin estos patrones en mente, se utilizo solo uno:
  Singleton: Singleton te permite crear una instancia de algún objeto que será constante durante todo el proyecto.
              En este caso usamos singleton para la creación del ArrayList de buses, nuestro código genera alrededor de 200 buses al iniciarse, los cuales se distribuyen y clasifican por hora de salida, origen, destino, fecha y número de pisos (uno o dos)
              Haciendo autocrítica quizás fue complicarse de más pero me parece una forma interesante de afrontar el proyecto ya que sería un poco más cercano a la realidad, a diferencia de por ejemplo crear un bus cada vez que se necesita.

Decisiones importantes:
  Recurriendo un poco a la bitácora expuesta más arriba, el proyecto en general terminó de forma bastante similar a la que lo teníamos planeada, no fueron necesarios grandes cambios en la lógica del código, sin embargo, hubieron algunos momentos de refactoring
  que nos hicieron la vida más fácil, por ejemplo la creación de una clase ventana que no estaba en nuestros planes y que sirve de "canvas" para el resto.
  Nombrando una serie de pequeños cambios de diseño:
    - Hubo un punto en el código en el que necesitábamos acceso más rápido a la información que recibimos del usuario, en ese momento se creó la clase de Cliente para almacenar sus datos.
    - Con respecto a la clase Cliente, además, se le otorgó su propio depósito de asientos, para luego de forma más fácil poder determinar cuáles asientos estaban ocupados.
    - En un principio el programa creaba una cantidad semi aleatoria de buses, después de varias iteraciones llegamos a la conclusión de que era mejor fijar esa cantidad.

A modo de autocrítica.
De forma muy resumida podemos decir que nos faltó organización, haber estudiado más los patrones de diseño a utilizar y personalmente (vicente) a no apresurarme tanto para empezar el código y planearlo mejor.

Trabajando en este proyecto aprendimos infinidad de cosas y mirando hacia atrás hacia cosas muy diferentes, con el fin de evitar algunos de los problemas que nos encontramos.

Si bien la mayoría los solucionamos, algunos de estos problemas fueron:
(No resuelto) 
  Problema: En nuestro programa los asientos se representan con botones, método que resultó bastante eficaz hasta el momento de querer desactivarlos para representar que un asiento ya está usado.
  Solución Parcial: Pasamos a representar los asientos usados con el color rojo, el problema de esto es que nada le impide a otro cliente seleccionarlos igualmente.
  Aprendizaje: Quizás hubiera sido más fácil usar el método paint o instanciar de forma distinta los botones, con un poco más de tiempo hubiésemos probado esto último.
(Resuelto)
  Problema: Los buses no “sabían” si eran de ida o vuelta, si bien, el programa hacia el chequeo de estos 2 parámetros de la forma en que estaba estructurado era imposible diferenciarlos.
  Solución: Sencillo, la creación de 2 arraylist distintas para los buses, además de 2 clases de menuitem para la selección de buses, esto nos permite trabajarlos por separado y tener mayor control de estos.
  Aprendizaje: Si bien esta perfecto querer reducir el código lo más posible hay instancias en las que simplemente no se puede y es mejor tomar el camino un poco mas enredado pero que logicamente es mas sencillo.
(Resuelto)
  Problema: “La mala memoria del programa” no éramos capaces de lograr que el programa “recordará” cuáles asientos estaban usados y cuales no.
  Solución: Para esto simplemente guardamos en una nueva variable del cliente del tipo arraylist todos los asientos para después chequear su estado (true/false) y así otorgarles su color correspondiente
  Aprendizaje: En este estilo de programas nos fue muy útil (y lo aprendimos aquí) ir guardando toda la información relevante en, en este caso, un cliente.

Como ultimo detalle me da un poco de impotencia el estado del codigo, se que podria ser mejor pero no tengo tiempo de hacer refactoring a todo, me hubiese gustado ademas ir haciendo el javadoc de a poco a medida de agregabamos cosas al codigo pero se me olvidó en el momento.
  



  
  

  
