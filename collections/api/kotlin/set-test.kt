package collections.api.kotlin

fun main() {
    val joao = Funcionario("João",2000.00,"CLT")
    val pedro = Funcionario("Pedro",1500.00,"PJ")
    val maria = Funcionario("Maria",4000.00,"CLT")

    val funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao,pedro,maria)

    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach({ println(it)})

    println("_________________________________")

    val subtracao = funcionarios3.subtract(funcionarios2)
    subtracao.forEach({ println(it)})

    println("________________________________")

    val intercessao = funcionarios3.intersect(funcionarios2)
    intercessao.forEach({ println(it)})
}