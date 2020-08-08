fun testaFuncionarios() {

    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )


    // aqui porque nós colocamos a classe Funcionarios como abstrata, nós não podemos instancia ela, ou seja, criar um obejto a partir dela, podemos
    // somente herdar as propriedades e metodos dela
//    val alex = Funcionario(
//        nome = "Alex",
//        cpf = "111.111.111-11",
//        salario = 1000.0
//    )
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 1000.0,
        senha = 4321,
        plr = 5000.0
    )
    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 5000.0
    )

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    val calculadora = Calculadora()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    println("Total: ${calculadora.total}")

}