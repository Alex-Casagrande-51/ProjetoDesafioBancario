import java.util.Scanner;

public class Banco  {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String tipoDeconta1 = "Conta Corrente";
        double saldoCleinte = 0.0;
        int numeroDaConta = 431334;
        System.out.println("DIGITE SEU NOME  COMPLETO: ");
        String nomeCliente1 = leitura.nextLine();
        System.out.println("Digite data de nascimento: ");
        String dataDeNacimento = leitura.nextLine();
        System.out.println("NUMERO DA CONTA " + numeroDaConta);
        String mensagem = "\n\nSeus Dados:\nnome: %s\ndata de nascimento: %s\ntipo de conta: %s\nsaldo inicial: %.3f\nnumero da conta: %d\n".formatted(nomeCliente1, dataDeNacimento, tipoDeconta1, saldoCleinte, numeroDaConta);
        System.out.println(mensagem);


            while (true) {
                String mensagem2 = "Operações\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n";
                System.out.println(mensagem2);
                System.out.println("Digite a opção desejada: ");
                int opcaoOperacao = leitura.nextInt();
                if (opcaoOperacao == 1) {
                    System.out.println("SALDO: " + saldoCleinte);
                    System.out.println("Execução realizado com sucesso");
                } else {
                    double valorTranferir;
                    if (opcaoOperacao == 2) {
                        System.out.println("Digite valor a receber: ");
                        valorTranferir = leitura.nextDouble();
                        saldoCleinte += valorTranferir;
                        System.out.println("REALIZADO COM SUCESSO!");
                    } else if (opcaoOperacao == 3) {
                        System.out.println("Digite valor a transferir: ");
                        valorTranferir = leitura.nextDouble();
                        if (valorTranferir > saldoCleinte) {
                            System.out.println("NÃO HÁ SALDO O INSUFICIENTE PARA FAZER A TRANSFERENCIA");
                            System.out.println("SALDO DISPONÍVEL NO MOMENTO: " + saldoCleinte);
                        } else {
                            double total = saldoCleinte - valorTranferir;
                            saldoCleinte = total;
                            System.out.println("REALIZADO COM SUCESSO");
                        }
                    } else if (opcaoOperacao == 4) {
                        System.out.println("OBRIGADO POR UTILIZAR NOSSO SISTEMA, VOLTE SEMPRE!!");
                        return;
                    }
                }
            }
        }
    }
