package collections.api.kotlin

fun main(){
    val nomes = Array<String>(4){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Barbara"
    nomes[3] = "Alice"

    for (nome in nomes){
        println(nome)
    }
    println("----------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------------------")
    val nomes2 = arrayOf("Euclides","Ariele","Zoraya","Leonice","Ofelia")
    nomes2.sort()
    nomes2.forEach { println(it) }
}