package tema5

/*Vamos a pedir dos numeros enteros que suponemos positivos
si num1 > num2 vamos a devolver una formula num1 elevado a num2 es...
en caso negativo devolvemos  no se puede hacer
 */
fun main(args: Array<String>) {
    val num1: Int
    val num2: Int

    println("Introduzca un numero1")
    num1 = readLine()?.toInt() ?: 0

    println("Introduzca un numero2")
    num2 = readLine()?.toInt() ?: 0

    var cadena = if(num1>0 && num2>0) {
        var resultado : Int =1
        for(i in 1 .. num2)
            resultado *= num1
            "Num1 elevado a num2 es $resultado"

    } else "no se puede realizar las operaciones"
    println(cadena)







}
