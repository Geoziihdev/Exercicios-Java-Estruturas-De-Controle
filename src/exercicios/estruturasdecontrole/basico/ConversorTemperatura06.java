package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;  // Importando a classe Scanner para leitura de dados / Importing the Scanner class for reading user input

public class ConversorTemperatura06 {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário / Creating the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Exibe um menu para o usuário escolher o tipo de conversão / Display a menu for the user to choose the conversion type
        System.out.println("Escolha o tipo de conversão de temperatura:");  // Portuguese
        System.out.println("1. Celsius para Fahrenheit");  // Portuguese
        System.out.println("2. Fahrenheit para Celsius");  // Portuguese
        System.out.println("Choose the type of temperature conversion:");  // English
        System.out.println("1. Celsius to Fahrenheit");  // English
        System.out.println("2. Fahrenheit to Celsius");  // English

        // Lê a escolha do usuário / Read the user's choice
        int escolha = scanner.nextInt();

        // Solicita ao usuário que insira a temperatura / Ask the user to input the temperature
        System.out.print("Digite a temperatura: ");  // Portuguese
        System.out.print("Enter the temperature: ");  // English
        double temperatura = scanner.nextDouble();

        // Executa a conversão de acordo com a escolha do usuário / Perform the conversion based on the user's choice
        if (escolha == 1) {
            // Converte de Celsius para Fahrenheit / Convert from Celsius to Fahrenheit
            double fahrenheit = (temperatura * 9/5) + 32;
            System.out.println(temperatura + "°C é igual a " + fahrenheit + "°F");  // Portuguese
            System.out.println(temperatura + "°C is equal to " + fahrenheit + "°F");  // English
        } else if (escolha == 2) {
            // Converte de Fahrenheit para Celsius / Convert from Fahrenheit to Celsius
            double celsius = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "°F é igual a " + celsius + "°C");  // Portuguese
            System.out.println(temperatura + "°F is equal to " + celsius + "°C");  // English
        } else {
            // Caso a escolha seja inválida / If the choice is invalid
            System.out.println("Opção inválida!");  // Portuguese
            System.out.println("Invalid option!");  // English
        }

        // Fecha o scanner / Close the scanner
        scanner.close();
    }
}


