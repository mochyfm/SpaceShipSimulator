### Clase Cargo

La clase Cargo, es una de las clases hija de ***[SpaceShip](../docs/SpaceShip.md)***, esta clase
es una clase orientada principalmente a naves de Carga.
Esta clase no tiene mucha diferencia que aportar sobre su padre SpaceShip, con la excepción de que
 añade ciertas cosas y modifica otras respecto a la ya anteriormente mencionada clase padre.

En primer lugar, la clase Cargo añade 2 nuevos atributos:

1. El atributo ***cargo*** (int) que se encarga de asignar una carga **máxima**
a la nave.
2. El atributo ***loadQuantity*** (int) que se encarga de gestionar la cantidad
actual de la nave, este es el atributo más "cambiante".

A raíz de estos nuevos atributos, esta clase posee 2 métodos nuevos que interactuan
con ellos.

- El método load() que se encarga de añadir una carga en caso de que sea posible
y no se haya superado la carga máxima; en caso de que esto último ocurra avisará de que no
se pueden añadir más carga a la nave.
- El método unload() que de manera opuesta se encarga de descargar la carga de
la nave en cuestión, e igual que en el anterior método, no se podrá superar el valor
mínimo de carga (evitando así valores negativos)

Estos métodos **no devuelven** ningun valor, sencillamente modifican y alteran los atributos
exclusivos de la clase Cargo.