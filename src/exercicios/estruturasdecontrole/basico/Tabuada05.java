package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;  // Importing the Scanner class to read user input

public class Tabuada05 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        // Creating the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        // Ask the user to enter a number
        System.out.println("Digite um número para ver sua tabuada: ");  // Portuguese
        System.out.println("Enter a number to see its multiplication table: ");  // English
        int numero = scanner.nextInt();  // Lê o número inserido pelo usuário / Reads the number entered by the user

        // Exibe a tabuada do número inserido
        // Display the multiplication table of the entered number
        System.out.println("Tabuada de " + numero + ":");  // Portuguese
        System.out.println("Multiplication table of " + numero + ":");  // English

        // Loop para calcular e exibir a tabuada do número
        // Loop to calculate and display the multiplication table of the number
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;  // Calcula o resultado da multiplicação / Calculates the multiplication result
            System.out.println(numero + " x " + i + " = " + resultado);  // Exibe a multiplicação / Display the multiplication
        }

        // Fechar o scanner
        // Close the scanner
        scanner.close();
    }
}


/* Explicação do código:
Entrada do usuário: O programa usa a classe Scanner para ler a entrada do usuário, permitindo que ele insira o número para o qual deseja ver a tabuada.

Laço de repetição: Um for é usado para iterar de 1 a 10 e imprimir a multiplicação do número inserido pelo usuário.

Saída: O programa exibe a tabuada do número fornecido, mostrando as multiplicações de 1 até 10.
*/
