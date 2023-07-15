import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "Seja bem-vindo ao Banco PagaMais!");
        System.out.println("Vamos começar seu cadastro");

        System.out.print("Informe qual seu nome: ");
        String nome = sc.next();
        Conta conta1 = new Conta(nome);
        System.out.println("Conta criada, o número da sua conta é " + conta1.numeroConta);
        System.out.print("Informe qual seu nome: ");
        String nome2 = sc.next();
        Conta conta2 = new Conta(nome2);
        System.out.println("Conta criada, o número da sua conta é " + conta2.numeroConta);
        System.out.print("Informe qual seu nome: ");
        String nome3 = sc.next();
        Conta conta3 = new Conta(nome3);
        System.out.println("Conta criada, o número da sua conta é " + conta3.numeroConta);


        while (true) {
            System.out.println("---Opções disponíveis---");
            System.out.println("1 - Visualizar Saldo");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.print("Digite qual conta quer consultar(conta1,conta2 ou conta3: ");
                String nomeConta = sc.next();
                if (nomeConta.equals("conta1")) {
                    System.out.println("Seu saldo atual é " + conta1.saldo+"\n");
                } else if (nomeConta.equals("conta2")) {
                    System.out.println("Seu saldo atual é " + conta2.saldo+"\n");
                } else if (nomeConta.equals("conta3")) {
                    System.out.println("Seu saldo atual é " + conta3.saldo+"\n");
                } else {
                    System.out.println("Conta não encontrada!");
                }

            } else if (opcao == 2) {
                System.out.print("Digite qual conta quer realizar o saque(conta1,conta2 ou conta3: ");
                String nomeConta = sc.next();
                if (nomeConta.equals("conta1")) {
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    conta1.saque(valorSaque);
                } else if (nomeConta.equals("conta2")) {
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    conta2.saque(valorSaque);
                } else if (nomeConta.equals("conta3")) {
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    conta3.saque(valorSaque);
                } else {
                    System.out.println("Conta não encontrada!"+"\n");
                }

            } else if (opcao == 3) {
                System.out.print("Digite qual conta quer realizar o depósito(conta1,conta2 ou conta3: ");
                String nomeConta = sc.next();
                if (nomeConta.equals("conta1")) {
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    conta1.deposito(valorDeposito);
                    System.out.println("Depósito realizado com sucesso! Seu saldo atual é " + conta1.saldo+"\n");
                } else if (nomeConta.equals("conta2")) {
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    conta2.deposito(valorDeposito);
                    System.out.println("Depósito realizado com sucesso! Seu saldo atual é " + conta2.saldo+"\n");
                } else if (nomeConta.equals("conta3")) {
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    conta3.deposito(valorDeposito);
                    System.out.println("Depósito realizado com sucesso! Seu saldo atual é " + conta3.saldo+"\n");
                } else {
                    System.out.println("Conta não encontrada!"+"\n");
                }

            } else if (opcao == 4) {
                System.out.print("Digite o valor a ser transferido: ");
                double valorTransferir = sc.nextDouble();
                System.out.print("Digite a conta de origem (conta1, conta2 ou conta3): ");
                String origem = sc.next();
                System.out.print("Digite a conta de destino (conta1, conta2 ou conta3): ");
                String destino = sc.next();


                if (origem.equals("conta1")&&destino.equals("conta2")) {
                    conta1.transferir(valorTransferir, conta2);
                    System.out.println("Transferência realizada com sucesso!" + "\n");
                } else if (origem.equals("conta1")&&destino.equals("conta3")) {
                    conta1.transferir(valorTransferir, conta3);
                    System.out.println("Transferência realizada com sucesso!" + "\n");
                } else if (origem.equals("conta2")&&destino.equals("conta1")) {
                    conta2.transferir(valorTransferir, conta1);
                    System.out.println("Transferência realizada com sucesso!" + "\n");
                } else if (origem.equals("conta2")&&destino.equals("conta3")) {
                    conta2.transferir(valorTransferir, conta3);
                    System.out.println("Transferência realizada com sucesso!" + "\n");
                } else if (origem.equals("conta2")&&destino.equals("conta1")) {
                    conta3.transferir(valorTransferir, conta1);
                    System.out.println("Transferência realizada com sucesso!" + "\n");
                } else if (origem.equals("conta2")&&destino.equals("conta1")) {
                    conta3.transferir(valorTransferir, conta2);
                    System.out.println("Transferência realizada com sucesso!" + "\n");
                } else {
                    System.out.println("Conta(s) não encontrada(s) ou contas de origem e destino iguais!" + "\n");
                }
            } else if (opcao == 5) {
                break;
        } else {
                System.out.println("Opção inválida!"+"\n");
            }
        }
    }

}