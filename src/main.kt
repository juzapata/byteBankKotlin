fun main() {
    println("Bem vindo ao Bytebank")


}



// Ver o codifo copia comentado abaixo para entender o que ta acontecendo SEMPRE


// segundo
//fun main() {
//    println("Bem vindo ao Bytebank")
//    /*
//    * Essa parte das contas correntes e poupança nós fizemos mais um exercicio de como funciona o polimorfismo e dos seus benefícios. Tipo as classes Conta Corrente e
//    * contaPoupanca quer herdaram os metodos e variaveis da classe mãe Conta. E também utilizamos o override no metodo saca, dentro da classe contaCorrente, para
//    * adicionarmos funcionalidades a mais que a classe mae tem
//    * */
//    val contaCorrente = contaCorrente(
//        titular = "Alex",
//        numero = 1000
//    )
//    val contaPoupanca = contaPoupanca(
//        titular = "Fran",
//        numero = 1001
//    )
//    contaCorrente.deposita(1000.0)
//    contaPoupanca.deposita(1000.0)
//    println("saldo conta corrente ${contaCorrente.saldo}")
//    println("saldo conta poupança ${contaPoupanca.saldo}")
//    contaCorrente.saca(100.0)
//    contaPoupanca.saca(100.0)
//    println("saldo conta corrente apos saque${contaCorrente.saldo}")
//    println("saldo conta poupança apos saque${contaPoupanca.saldo}")
//    contaCorrente.transfere(100.0, contaPoupanca)
//    println("saldo conta corrente apos transferir para poupanca ${contaCorrente.saldo}")
//    println("saldo conta poupança apos receber da conta corrente  ${contaPoupanca.saldo}")
//    contaPoupanca.transfere(500.0, contaCorrente)
//    println("saldo conta corrente apos receber da poupanca ${contaCorrente.saldo}")
//    println("saldo conta poupança apos transferir para conta corrente  ${contaPoupanca.saldo}")
//}



// primeiro
//fun main() {
//    println("Bem vindo ao Bytebank")
//
//    val alex : Funcionario = Funcionario(
//        nome = "Alex",
//        cpf = "111.111.111-11",
//        salario = 1000.0
//    )
////    println("Alex Funcionario")
////    println("nome ${alex.nome}")
////    println("cpf ${alex.cpf}")
////    println("salario ${alex.salario}")
////    println("bonificação ${alex.bonificacao()}")
//    val fran : Funcionario = Gerente(
//        nome = "Fran",
//        cpf = "222.222.222-22",
//        salario = 2000.0,
//        senha = 1234
//    )
////    println("Fran Gerente")
////    println("nome ${fran.nome}")
////    println("cpf ${fran.cpf}")
////    println("salario ${fran.salario}")
////    println("bonificação ${fran.bonificacao()}")
////
////    if(fran.autentica(1234)){
////        println("autenticou com sucesso")
////    } else {
////        println("falha na autentição")
////    }
//    val gui : Funcionario = Diretor(nome = "Gui", cpf = "333.333.333-33", salario = 1000.0, senha = 4321, plr = 5000.0)
////    println("Gui Diretor")
////    println("nome main ${gui.nome}")
////    println("cpf main${gui.cpf}")
////    println("salario main ${gui.salario}")
////    println("bonificação main${gui.bonificacao()}")
////    println("plr main ${gui.plr}")
//    val maria : Funcionario = Analista(
//        nome = "Maria",
//        cpf = "444.444.444-44",
//        salario = 5000.0
//    )
//    val calculadora = Calculadora()
//    calculadora.registra(alex)
//    calculadora.registra(fran)
//    calculadora.registra(gui)
//    calculadora.registra(maria)
//    println("Total: ${calculadora.total}")
//}









