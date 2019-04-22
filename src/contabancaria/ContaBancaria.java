/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import java.util.Scanner;

/**
 *
 * @author claudinei
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        String titular;
        String numero = Integer.toString((int) (1 + (Math.random() * 10000)));
        double valor;

        System.out.println("Primeiramente vamos criar uma conta pra você.");

        System.out.println("Qual o seu nome?");
        titular = input.nextLine();

        System.out.println("Qual o saldo inicial?");
        valor = input.nextDouble();

        Conta conta1 = new Conta(titular, numero, valor);
        System.out.println(conta1);

        do {

            System.out.println("|------------------------------|");
            System.out.println("|***Escolha a opção desejada***|");
            System.out.println("|------------------------------|");
            System.out.println("|1 - Depósito                  |");
            System.out.println("|2 - Saque                     |");
            System.out.println("|3 - Transferência             |");
            System.out.println("|4 - Extrato                   |");
            System.out.println("|------------------------------|");

            System.out.println("O que deseja fazer?");
            opcao = (input.nextInt());

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor.");
                    conta1.deposito(input.nextDouble(), false);

                    break;
                case 2:
                    System.out.println("Informe o valor.");
                    conta1.saque(input.nextDouble(), false);
                    break;
                case 3:
                    System.out.println("Informe o valor.");
                    valor = input.nextDouble();

                    System.out.println("Informe o titular.");
                    titular = input.next();

                    System.out.println("Informe o numero da conta.");
                    numero = input.next();

                    /**
                     * Cria uma nova conta pois não tem mais conta para testar
                     * Em uma aplicação real buscaria pelo numero da conta por
                     * exemplo.
                     */
                    Conta conta2 = new Conta(titular, numero, 0);

                    conta1.transferencia(conta2, valor);
                    break;
                case 4:
                    System.out.println(conta1);
                    break;
                case 0:
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);

    }

}
