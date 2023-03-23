# Conversor
Conversor realizado en java, utilizando las buenas practicas de programación. 
Es escalable ya que puede crear mas opciones de conversor al crear un nuevo objeto del tipo de conversion que se desea, evitando el uso de condicionales if excesivos. 
Solo hace falta poner la nueva opcion que se desea en el arreglo opcion de la clase OpcionConversor, tambien se debe crear un arreglo de opcion a convertir, 
el cual al instanciar OpcionConversor se hace una casteo de String[] a objetc[] el cual permite poner el menu de opciones en el joptionpane.

Se guarda la opcione elegida en el joptionpane y se envia al metodo comparacion el cual por medio de un ciclo for compara las opciones disponibles con la opcion 
seleccionada y se va sumando un contador que permite al programa saber que opcion del menu se eligio. esta opcion se manda a un objeto de la clase de el tipo de 
conversion que se desea, junto con el valor a convertir y este por medio de un switch que evalua el valor del contador nos retornara un String el cual contiene
el valor ya convertido.
