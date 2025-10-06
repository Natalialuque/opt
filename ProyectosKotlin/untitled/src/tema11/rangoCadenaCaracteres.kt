package tema11


fun main(args: Array<String>) {
     val c1 : Char
     val c2 : Char

     println("introduzca c1")
    c1 = readLine()!!.toCharArray()[0]

    println("introduzca c2")
    c2 = readLine()!!.toCharArray()[1]

    println("Caracteres entre $c1 y $c2")
    for (c in c1 .. c2 ) {
        println(c)
    }
}
