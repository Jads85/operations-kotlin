package collections.api.kotlin

fun main() {
    val joao = Funcionario("João",2000.00,"CLT")
    val pedro = Funcionario("Pedro",1500.00,"PJ")
    val maria = Funcionario("Maria", 4000.00,"CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach { println (it) }
    println("________________________")

    println(funcionarios.find{it.nome=="Maria"})

    println("___________Sort______________")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("____________Group_____________")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }
}




