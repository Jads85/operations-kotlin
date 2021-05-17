package collections.api.kotlin

fun main(){
    val salario = doubleArrayOf(2500.00,1000.00,1100.00,3000.90,3000.10)
    salario.forEach { println(it) }

    println("----------------------------------")
    salario.sort()
    salario.forEach { println(it) }
    println("----------------------------------")
    salario.forEachIndexed {
        index, salarios -> salario[index] = salarios * 1.1
        }
    salario.forEach { println(it) }

}