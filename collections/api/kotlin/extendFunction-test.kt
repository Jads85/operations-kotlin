package collections.api.kotlin

fun main() {
    val salarios = arrayOf("2000".toBigDecimal(),"1500".toBigDecimal(),"3000".toBigDecimal(),"4000".toBigDecimal())

    println(salarios.somatoria())
    println("__________________")
    println(salarios.media())
}