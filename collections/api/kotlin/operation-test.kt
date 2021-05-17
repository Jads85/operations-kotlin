package collections.api.kotlin

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios) {
        print(salarios)
    }
    println("-----------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salárial: ${salarios.average()}")

    val salariosFiltrados = salarios.filter{it>2500.00}

    println("-----------------------------")
    salariosFiltrados.forEach { println(it) }

    println("-----------------------------")
    println(salarios.count { it in 2000.00..5000.00 })

    println("-----------------------------")
    println(salarios.find { it == 2250.0 })
    println("-----------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}
