package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;  // Importando a classe Scanner para ler dados do usuário / Importing the Scanner class to read user input

public class VerificadorAnoBissexto07 {
    public static void main(String[] args) {
        // Criando o scanner para ler a entrada do usuário / Creating the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário para digitar um ano / Ask the user to input a year
        System.out.println("Digite um ano para verificar se é bissexto: ");  // Portuguese
        System.out.println("Enter a year to check if it is a leap year: ");  // English
        int ano = scanner.nextInt();  // Lê o ano informado / Read the year input

        // Verifica se o ano é bissexto / Check if the year is a leap year
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            // Se for bissexto / If it is a leap year
            System.out.println(ano + " é um ano bissexto!");  // Portuguese
            System.out.println(ano + " is a leap year!");  // English
        } else {
            // Se não for bissexto / If it is not a leap year
            System.out.println(ano + " não é um ano bissexto!");  // Portuguese
            System.out.println(ano + " is not a leap year!");  // English
        }

        // Fecha o scanner / Close the scanner
        scanner.close();
    }
}
/* Explicação Simples:
Entrada do Ano: O programa pede ao usuário para informar o ano que ele quer verificar.

Condição para Ano Bissexto:

O programa verifica se o ano é divisível por 4, mas não divisível por 100, ou divisível por 400. Se uma dessas condições for verdadeira, então o ano é bissexto.
Resultado: O programa informa se o ano informado é bissexto ou não bissexto, tanto em português quanto em inglês. */