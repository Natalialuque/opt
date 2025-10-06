package tema5

/*lee dos numeros y me devuelve verdadero si el primero es mayor que el segundo */

fun main(){
    var numero1: Int
    var numero2 : Int
    var cadena : String

    println("Introduce numero 1")
    numero1 = readLine()?.toInt() ?: 0

    println("Introduce numero 2")
    numero2 = readLine()?.toInt() ?: 0

    if(numero1>=numero2){
        println("Verdadero")
    }else{
        println("falso")
    }

    cadena =  if(numero1>=numero2){
                 println("Introduzca Texto")
                readln().toString()}
               else
                 "falso"
    println(cadena)

    println(if(numero1>=numero2) "Primero es mayor" else "Segundo es mayor")
    println("El resultado de la comparacion es: ${if (numero1>=numero2) "Primero mayor" else "Segundo es mayor"}")

}