package eu.rudiment.shoppinglist

data class Vase(val colour: String, val design: String)

fun main(){
    val blueColorVase = Vase(colour = "Blue", design = "Rose")
    val redColorVase = blueColorVase.copy(colour = "Red")
    println(blueColorVase)
    println(redColorVase)
}