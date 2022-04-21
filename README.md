# Space Ship Simulator  
###### Código creado para el **Ciclo Formativo Superior - DAM** 

Buen@s dias / tarde / noches querido/a usuario, te quiero dar personalmente la bienvenida al proyecto S3, el cual es un modesto proyecto de simulación del movimiento de una nave espacial de manera vectorial (únicamente horizontalmente, es decir por el eje X) en el que utilizando el menor número de conceptos sobre física posibles, se pretende realizar una recreación temporal-espacial sobre el movimiento de dicha nave en el vacío del espacio.

El proyecto consta de 2 tipos de nave:

- La nave estándar, que posee unas características establecidas por defecto (que son modificables por el usuario)
- La nave de cargamento, que posee una definición y estructura más enfocada al cargamento y menos a la maniobrabilidad (velocidad) y al combate.

Estas dos naves están representadas de una forma visual en Ascii y en un [futuro](docs/Features.md) se representarán también de forma gráfica. Hay que añadir que la diferencia de tamaño entre ambas naves es considerable, siendo normal encontrar naves de cargamento que aun pareciendo pequeñas son excesivamente más grandes que las estándar; debido principalmente a que estas últimas están más orientadas a uno o muy pocos pilotos, mientras que la de cargamento **en su mayoría** están orientadas a el transporte de material (bien comercial, armamentístico u otro).

Ambas naves se representan por dos clases:

- La clase ***[SpaceShip](docs/SpaceShip.md)*** para las naves estándar.
- La clase ***[Cargo](docs/Cargo.md)*** para las naves de carga.
