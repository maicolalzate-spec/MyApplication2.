// EJERCICIO 4:

// Variable nulable (String?)
val contactoEmergencia: String? = null

// Llamada segura ?. -> si es null devuelve null, no da error
val longitud = contactoEmergencia?.length
println("Cantidad de caracteres: $longitud")

// Operador Elvis ?: -> valor por defecto si es null
val contactoFinal = contactoEmergencia ?: "Sin contacto registrado"
println("Contacto de emergencia: $contactoFinal")