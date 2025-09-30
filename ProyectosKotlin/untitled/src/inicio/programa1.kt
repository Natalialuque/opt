package inicio

fun main(){
    //el val para declarar constantes a las que se le puede asignar un valor
    val nombre : String;
    println("Nombre: ");
    nombre = readln();

    for(i in 1..8){
        println("$nombre $i")
    }
}