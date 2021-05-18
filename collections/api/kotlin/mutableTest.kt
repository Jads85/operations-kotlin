package collections.api.kotlin

fun main() {
    val joao = Funcionario("João",2000.00,"CLT")
    val pedro = Funcionario("Pedro",1500.00,"PJ")
    val maria = Funcionario("Maria", 4000.00,"CLT")

    println("____________LIST__________________")
    val funcionarios =  mutableListOf(joao,maria)
    funcionarios.forEach{println(it)}
    println("______________________________")

    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("______________________________")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("___________SET_______________")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{println(it)}

    println("______________________________")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{println(it)}

    println("______________________________")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}