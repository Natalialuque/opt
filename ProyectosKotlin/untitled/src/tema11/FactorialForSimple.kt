package tema11
fun main(args: Array<String>) {
    var numero : Int
    var resultado : Int =1

    println("Dime el nunm1")
    numero = readLine()?.toInt() ?: 0

    //Bucle for simple
    for(cont in 1..numero){
        resultado *= cont
    }
    println("Resultado: $resultado")

    //Bucle for usando una variable de tipo range
    var rango : IntRange = 1..numero
    resultado = 1

    for(cont in rango){
        resultado *= cont
    }
    println("Resultado: $resultado")


}