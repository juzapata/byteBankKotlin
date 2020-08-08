fun testaContasDiferentes() {
    val contaCorrente = contaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = contaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("saldo conta corrente ${contaCorrente.saldo}")
    println("saldo conta poupança ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("saldo conta corrente apos saque${contaCorrente.saldo}")
    println("saldo conta poupança apos saque${contaPoupanca.saldo}")
    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo conta corrente apos transferir para poupanca ${contaCorrente.saldo}")
    println("saldo conta poupança apos receber da conta corrente  ${contaPoupanca.saldo}")
    contaPoupanca.transfere(500.0, contaCorrente)
    println("saldo conta corrente apos receber da poupanca ${contaCorrente.saldo}")
    println("saldo conta poupança apos transferir para conta corrente  ${contaPoupanca.saldo}")
}
