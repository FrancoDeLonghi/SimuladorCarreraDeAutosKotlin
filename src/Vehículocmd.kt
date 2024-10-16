open class VehículoCmd( nombre: String, velocidadMaxima: Int, var velocidadactual: Int = 0,
                                 combustible: Int, aceleracion: Int, frenado: Int,
): Vehiculo(nombre = nombre, velocidadMaxima = velocidadMaxima, combustible = combustible,
    aceleracion = aceleracion, frenado = frenado)
{
    override fun acelerar() {
        if(combustible != 0){
            velocidadactual = velocidadactual + aceleracion
        }
        else{return println("Te quedaste sin nafta bro")}
    }

    override fun frenar(){
        if(velocidadactual != 0){
            velocidadactual=velocidadactual-frenado;
            println("Frenaste bro, ahora vas a $velocidadactual")
        }
    }

    override fun avanzar(){
        if(velocidadactual!=0){
            distanciaRecorrida = distanciaRecorrida + velocidadactual
        }
    }

}