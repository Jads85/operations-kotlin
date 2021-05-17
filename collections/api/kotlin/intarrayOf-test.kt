package collections.api.kotlin

fun main(){
    val values = intArrayOf(2,7,4,1,45,13)

    values.forEach {
        println(it)
    }
    println("_________________________")
    values.sort()
    values.forEach {
        println(it)
    }

}