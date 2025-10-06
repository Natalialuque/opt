package tema9

fun main(args: Array<String>) {
    var numero : Int
    var contador = 1
    var resultado : Int =1

    println("Dime el nunm1")
    numero = readLine()?.toInt() ?: 0 /*BUSCAR DIFERENCIA CON EL readln.toInt()*/


    do {
        resultado *= contador
        contador+=1
    }while (contador <= numero)
    println("resultado: $resultado")


}