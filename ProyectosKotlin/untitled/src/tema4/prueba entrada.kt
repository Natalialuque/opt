package tema4

fun main (args: Array<String>) {
    var entero : Int
    var cadenaNula : String?
    var cadena : String

    println("Introduzca una cadena")
    cadenaNula = readln()

    println("Introduzca una cadena")
    cadena = readln()!!

    println("Introduzca una cadena")
    cadena = readln() ?:""

    println("Introduzca un numero")
    //la interrogacion se encarga de que si alguno de los metodos es nulo deja de funcionar
    entero = readLine()?.toString()?.toInt() ?: 10


}
