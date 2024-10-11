# Simulador de Carrera de Autos

## Objetivo:
- Implementar un simulador de carreras de autos por equipos usando **conceptos de POO**.
- Aplicar **Herencia** para los diferentes tipos de autos.

## Reglas de Juego:
- Cada grupo definirá un “Juez” que se encargará de validar si el otro equipo cumple con todas las condiciones planteadas en la Etapa 1. (Sorteo del Juez de cada equipo).
- Cada grupo deberá crear el código para cumplir con las condiciones del juego.
- Una vez finalizada la Etapa 1, se habilita la Etapa 2.
- Una vez finalizada la Etapa 2, el “Juez” volverá a validar que se cumpla con las condiciones de la Etapa 2.

## Etapa 1

### Condiciones del Juego:

- Cada equipo implementara la clase `Vehículo Custom` que sera una subclase de la clase _abstracta Vehículo_.
- `Vehículo Custom` debe ofrecer la posibilidad de **acelerar**, **frenar** y **avanzar** donde:
  - **Acelerar**: debe validar si el vehículo aún tiene combustible:
    - Si es **afirmativo**, debe sumar a la velocidad actual la aceleración del vehículo, hasta la velocidad maxima y decrementar el combustible en una unidad.
    - Si es **negativo**, debe imprimir un mensaje notificando el problema.
  - **Frenar**: debe decrementar el valor de frenado a la velocidad actual. Además debe imprimir un mensaje notificando la nueva velocidad. _**IMPORTANTE**: Tener en cuenta que la velocidad no puede ser negativa._
  - **Avanzar**: debe incrementar la distancia recorrida según la velocidad actual. _**IMPORTANTE**: Simular que la velocidad es la cantidad de Km recorrido, ejemplo: Si la velocidad es de 120 Km/H, aumenta la distancia en 120 Km._
  - **toString()**:  Debe imprimir todos los datos del vehículo.
- Cada `equipo` debe desarrollar un simulador de carrera con diferentes vehículos (**AutoDeportivo**, **Camión**, **Moto**), que serán subclases de una clase base `Vehículo Custom`.
- Cada `Vehículo` tiene atributos como **nombre**, **velocidadMáxima**, **combustible**, **aceleración** y **frenado**.
- Cada `Vehículo` tiene valores seteados por defecto a excepción del nombre que lo deben recibir al momento de crear la instancia.
  - `Moto`:
    - Velocidad Máxima: 180
    - Combustible: 60
    - Aceleración: 20
    - Frenado: 15
  - `AutoDeportivo`:
    - Velocidad Máxima: 220
    - Combustible: 80
    - Aceleración: 15
    - Frenado: 10
  - `Camión`:
    - Velocidad Máxima: 90
    - Combustible: 150
    - Aceleración: 5
    - Frenado: 8