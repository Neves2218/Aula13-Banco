public class Conta {
    private static int contadorContas = 0;
    String nome;
    int numeroConta;
    double saldo = 0;

    Conta(String nome) {
        this.nome = nome;
        this.numeroConta = ++contadorContas;
        this.saldo = 0;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public boolean saque(double valorSaque) {
        if (valorSaque <= saldo && saldo > 0) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso! Seu saldo atual é " + saldo + "\n");
            return true;
        } else {
            System.out.println("Saldo insuficiente!" + "\n");
            return false;
        }
    }

    public void transferir(double valorTransferir, Conta contaDestino) {
        if (saque(valorTransferir)) {
            contaDestino.deposito(valorTransferir);
            System.out.println("Transferência realizada com sucesso!" + "\n");
        } else {
            System.out.println("Transferência não pode ser realizada devido a saldo insuficiente." + "\n");
        }
    }
}
