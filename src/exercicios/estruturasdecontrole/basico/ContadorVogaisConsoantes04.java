package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;

public class ContadorVogaisConsoantes04 {
    
    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que digite uma frase
        // Prompt the user to enter a string
        System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();
        
        // Inicializa os contadores de vogais e consoantes
        // Initialize counters for vowels and consonants
        int countVowels = 0;
        int countConsonants = 0;
        
        // Converte a entrada para minúsculas para tratar insensibilidade a maiúsculas/minúsculas
        // Convert the input to lowercase to handle case insensitivity
        input = input.toLowerCase();
        
        // Laço para percorrer cada caractere da string
        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Verifica se o caractere é uma letra
            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {
                // Verifica se o caractere é uma vogal
                // Check if the character is a vowel
                if (isVowel(currentChar)) {
                    countVowels++; // Incrementa o contador de vogais
                    // Increment the vowel counter
                } else {
                    countConsonants++; // Incrementa o contador de consoantes
                    // Increment the consonant counter
                }
            }
        }
        
        // Exibe o resultado
        // Output the result
        System.out.println("Número de vogais: " + countVowels);
        System.out.println("Número de consoantes: " + countConsonants);
        
        // Fecha o scanner
        // Close the scanner
        scanner.close();
    }
    
    // Método auxiliar para verificar se um caractere é uma vogal
    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1; // Verifica se o caractere é uma vogal
        // Check if the character is a vowel
    }
}

/*Explicação do código com comentários:
Entrada do usuário:

O código pede ao usuário para digitar uma frase, que é lida usando o Scanner.
O texto é convertido para minúsculas para facilitar a verificação das vogais, já que a comparação será feita de forma insensível ao caso (maiúsculas/minúsculas).
Contagem de Vogais e Consoantes:

O laço for percorre cada caractere da string e verifica se é uma letra utilizando Character.isLetter().
Se for uma letra, o método isVowel() é chamado para verificar se o caractere é uma vogal. Caso contrário, considera-se que é uma consoante.
O contador countVowels é incrementado para as vogais, e countConsonants para as consoantes.
Exibição dos Resultados:

Após percorrer a string, o número de vogais e consoantes é impresso no console. 
*/