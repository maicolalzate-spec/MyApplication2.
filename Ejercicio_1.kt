//EJERCICIO 1

// val -> datos que NO cambian
val nombre: String = "Max"
val sexo: Char = 'M'

// var -> datos que SI pueden cambiar
var edad: Int = 3
var peso: Float = 12.5F

// Estado de vacunacion
val vacunado: Boolean = true

kotlin.io.println("Ficha inicial: $nombre, $edad anos, $peso kg")

// La mascota cumplio un anio y subio de peso
edad = edad + 1
peso = 13.2F

// Resumen de la ficha en una sola linea
kotlin.io.println("Paciente: $nombre | Sexo: $sexo | Edad: $edad anos | Peso: $peso kg | Vacunado: $vacunado")