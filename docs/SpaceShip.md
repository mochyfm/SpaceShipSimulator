### Clase SpaceShip

La clase SpaceShip es el pilar de todo el proyecto.
Esta clase, se encarga de asignar atributos (además de un
ASCII art super chulo) para todas las naves que se crean; si, TODAS.
Osea que si esta clase dejase de existir, las naves que hayan sido
creadas a partir de esta (como es el caso de [Cargo](../docs/Cargo.md)) dejarían de tener
utilidad o referencia alguna.

Esta clase posee varios métodos, de entre los que se destacan los siguientes:

- El método *estático* **createStandardSpaceShip()**: este método, se encarga
de crear una nave nueva según los parámetros que introduzca el usuario. 
Se solicitará un nombre y una matrícula galáctica.
- El método **speedUp()**: Éste método se encarga de darle velocidad a la nave según pida el usuario.
Por defecto ***la velocidad*** de la nave, además de ***su posición*** 
estarán ***a 0*** por lo que este valor evidentemente dependerá de tanto una velocidad
de aceleración que será otrogada por el usuario, y una velocidad consante previa 
(que al ser 0 por defecto, dependerá de una velocidad previa que se haya dado). La nave puede ir marcha atrás
mediante el uso de valores numéricos **negativos**.
- El método **break()**: Éste método es todo lo contrario al anterior. Aplicando la última aceleración
que ha sido otorgada por el usuario, la nave irá frenando. Este valor es como un interruptor, en caso de activarse
seguirá activo hasta que se diga que se detenga, en caso de mantenerse la nave podría ir en un sentido opuesto.
- El método **emergencyStop()**: Por último, el método que detendrá instantaneamente y desafiando cualquier
ley física que trabaje con velocidades y movimiento, es el método del freno de emergencia. Este método, como su nombre
bien señala, detendrá instantáneamente la nave en el punto en el que se encuentre, asegurate de tener el cinturón y 
el testamento bien escrito.

Para el cálculo de la velocidad se ha utilizado una sencilla fórmula que ignora el rozamiento (debido a que se 
está viajando en el espacio). Es una suma de dos valores:
    
> nuevaVelocidad = aceleracion + aceleracionAnterior