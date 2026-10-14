// EJERCICIO 2:

val edad: Int = 9
val esUrgencia: Boolean = false

// WHEN para clasificar la categoria
val categoria = when (edad) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..Int.MAX_VALUE -> "Senior"
    else -> "Edad no valida"
}

println("Categoria: $categoria")

// IF con operador OR ||
if (esUrgencia || categoria == "Senior") {
    println("Prioridad Alta")
} else {
    println("Atencion Regular")
}