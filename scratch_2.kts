// EJERCICIO 3:

// Lista inmutable de mascotas en espera
val mascotas = listOf("Max", "Luna", "Rocky", "Mia")

// CICLO FOR con turno consecutivo
var turno = 1
for (mascota in mascotas) {
    println("Turno $turno: $mascota")
    turno = turno + 1
}

// Cuenta regresiva con downTo
println("La clinica abre en:")
for (minutos in 5 downTo 1) {
    println("$minutos minutos")
}
println("La clinica esta abierta!")

// Ejemplo extra con until y step
for (numero in 1 until 10 step 2) {
    println("Rango con step: $numero") // 1,3,5,7,9
}