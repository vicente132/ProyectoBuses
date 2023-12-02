# ProyectoBuses
proyecto final asignatura programacion 2 año 2023
  
Vicente Andres Hernandez Guerraty
Luis Castro

Patrones de uso a utilizar:
  Memento. para guardar el estado de los asientos y selecciones al momento de querer volver atras en algun paso
  Command. En general bueno para trabajar con interfaces graficas, en este caso la idea es manejar todos los botones con el sistema de comandos
  Singleton. En un principio pensamos que podia ser buena idea que los buses fueran generados al azar cada vez que uno quisiese hacer una compra pero nos dimos cuenta que es mejor y mas realista que haya un solo 
              deposito de buses, asi podemos mostrar en una segunda iteracion como se inhabilitan los asientos ya comprados.

  
22/11/23
  LLevaremos ya una semana mas o menos trabajando en el proyecto y no hemos tenido mayor inconveniente la verdad, lo unico que cambiaria seria haber empezado antes a programar con los patrones en mente,
  la unica forma de mejorar esto es planificar mejor el metodo de trabajo a llevar a cabo, ademas de conocer muy bien como funcionan y como se implementan cada uno de los patrones.

23/11/23 
  Hoy hubo retroalimentacion con el cliente, en resumen vamos en buen camino, nos resalto tambien el hecho de empezar luego con algun patron de diseño, antes de que se complique mas el codigo, con respecto a eso
  Singleton sera un nuevo patron de diseño que siento que sera util.

01/11/23
  Despues de una semana ocupada con certamenes, hoy volvimos a trabajar en el proyecto, a estas alturas ya tenemos nuestro singleton implementado para la lista de buses la cual ya no es aleatoria al 100%, se sigue creando aleatoriamente pero esta vez al iniciar el
  programa, asi la lista de buses es constante con cada iteracion del proyecto, aun no implementamos memento ni command y estamos dudando su viabilidad, debido a la mala decision de emepzar el proyecto sin esto en mente, ademas hoy creamos una ventana donde podemos
  seleccionar los buses y se muestra su informacion.
