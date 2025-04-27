package eu.rudiment.shoppinglist

fun main(){
    //nullable string
    val name:String? = "Vivek"
    name?.let{
        println(it.toUpperCase())
    }
}