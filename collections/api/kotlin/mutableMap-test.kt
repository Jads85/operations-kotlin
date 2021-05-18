package collections.api.kotlin

fun main() {
    val joao = Funcionario("João",2000.00,"CLT")
    val pedro = Funcionario("Pedro",1500.00,"PJ")
    val maria = Funcionario("Maria",4000.00,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.findById(maria.nome))
    println("_____________________________")
    repositorio.findAll().forEach { println(it) }

    println("_____________________________")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}