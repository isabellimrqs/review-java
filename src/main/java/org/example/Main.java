package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Produto produto3 = new Produto("Prato", 30, 0.10);
        System.out.println(produto3.desconto);
        System.out.println("Geladeira com muitos descontos: " + produto3.calcularPrecoComDesconto(0.10, 0.05));

        Scanner entrada = new Scanner(System.in);
        int numero;

        while (true){
            try {
                System.out.println("Digite um número: ");
                numero = Integer.parseInt(entrada.nextLine());
                if (numero < 20){
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Opa, você digitou algo errado...");
            }

        }

        System.out.println("O número digitado foi " + numero);


        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();


        switch (numero){
            case 1 -> System.out.println("O número digitado foi 1");
            case 2 -> System.out.println("O número digitado foi 2");
            case 3 -> System.out.println("O número digitado foi 3");
            default -> System.out.println("Não tem");
        } */

        System.out.println("\n" +
                "██╗  ░░██╗██████╗░  ░██████╗░██╗░░░██╗██╗██╗░░░░░██╗░░██╗███████╗██████╗░███╗░░░███╗███████╗\n" +
                "██║  ░██╔╝╚════██╗  ██╔════╝░██║░░░██║██║██║░░░░░██║░░██║██╔════╝██╔══██╗████╗░████║██╔════╝\n" +
                "██║  ██╔╝░░█████╔╝  ██║░░██╗░██║░░░██║██║██║░░░░░███████║█████╗░░██████╔╝██╔████╔██║█████╗░░\n" +
                "██║  ╚██╗░░╚═══██╗  ██║░░╚██╗██║░░░██║██║██║░░░░░██╔══██║██╔══╝░░██╔══██╗██║╚██╔╝██║██╔══╝░░\n" +
                "██║  ░╚██╗██████╔╝  ╚██████╔╝╚██████╔╝██║███████╗██║░░██║███████╗██║░░██║██║░╚═╝░██║███████╗\n" +
                "╚═╝  ░░╚═╝╚═════╝░  ░╚═════╝░░╚═════╝░╚═╝╚══════╝╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝");

        String mudandoCor = "\033[0;37;44m";
        System.out.println(mudandoCor + "to mundando a cor errrrrrrrrrrr");




    }

}


