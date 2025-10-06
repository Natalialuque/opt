package tema9

fun main(args: Array<String>) {
    var numero : Int
    var contador = 1
    var resultado : Int =1

    println("Dime el nunm1")
    numero = readLine()?.toInt() ?: 0 /*BUSCAR DIFERENCIA CON EL readln.toInt()*/
    while (contador <= numero){
        resultado *= contador

        contador+=1
    }
    println("resultado: $resultado")


}