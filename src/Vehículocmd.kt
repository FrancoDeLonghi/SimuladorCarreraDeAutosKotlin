<<<<<<<<< Temporary merge branch 1
class `Vehículo Custom` {
=========
open class VehículoCmd(
    nombre: String,
    velocidadMaxima: Int,
    var velocidadactual: Int = 0,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(
    nombre = nombre,
    velocidadMaxima = velocidadMaxima,
    combustible = combustible,
    aceleracion = aceleracion,
    frenado = frenado){
    override fun acelerar() {
        if(combustible != 0){
            velocidadactual
        }
    }
>>>>>>>>> Temporary merge branch 2
}