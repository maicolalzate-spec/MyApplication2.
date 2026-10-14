// EJERCICIO 5:

// Lista de precios base: consulta, bano, desparasitacion
val precios = listOf(50000.0, 35000.0, 28000.0)

// Lambda: recibe un Double y retorna el precio con 10% de recargo nocturno
val recargoNocturno: (Double) -> Double = { precio -> precio * 1.10 }

// forEach con it
precios.forEach {
    println("Precio original: $it | Precio nocturno: ${recargoNocturno(it)}")
}