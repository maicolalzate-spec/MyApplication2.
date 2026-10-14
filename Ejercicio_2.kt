// EJERCICIO 2

val edad: Int = 9
val esUrgencia: Boolean = false

// WHEN para clasificar la categoria

val categoria = when (edad) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..Int.MAX_VALUE -> "Senior"
    else -> "Edad no valida"
}

kotlin.io.println("Categoria: $categoria")

// IF con operador OR ||
if (esUrgencia || categoria == "Senior") {
    kotlin.io.println("Prioridad Alta")
} else {
    kotlin.io.println("Atencion Regular")
}