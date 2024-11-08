package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;  // Importando a classe Scanner para ler os dados do usuário / Importing the Scanner class to read user input

public class JogoPerguntasRespostas08 {
    public static void main(String[] args) {
        // Criando o scanner para ler as respostas do usuário / Creating the scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Inicializando a pontuação / Initializing the score
        int pontuacao = 0;

        // Pergunta 1 / Question 1
        System.out.println("Pergunta 1: Qual a capital do Brasil?");  // Portuguese
        System.out.println("Question 1: What is the capital of Brazil?");  // English
        String resposta1 = scanner.nextLine();  // Lê a resposta do usuário / Read the user's answer
        if (resposta1.equalsIgnoreCase("Brasília")) {  // Verifica se a resposta está correta / Check if the answer is correct
            pontuacao++;  // Se a resposta for correta, aumenta a pontuação / If the answer is correct, increase the score
            System.out.println("Resposta correta! / Correct answer!");  // Portuguese / English
        } else {
            System.out.println("Resposta errada. A resposta correta é Brasília. / Wrong answer. The correct answer is Brasília.");  // Portuguese / English
        }

        // Pergunta 2 / Question 2
        System.out.println("Pergunta 2: Quanto é 5 + 3?");  // Portuguese
        System.out.println("Question 2: What is 5 + 3?");  // English
        int resposta2 = scanner.nextInt();  // Lê a resposta do usuário / Read the user's answer
        if (resposta2 == 8) {  // Verifica se a resposta está correta / Check if the answer is correct
            pontuacao++;  // Se a resposta for correta, aumenta a pontuação / If the answer is correct, increase the score
            System.out.println("Resposta correta! / Correct answer!");  // Portuguese / English
        } else {
            System.out.println("Resposta errada. A resposta correta é 8. / Wrong answer. The correct answer is 8.");  // Portuguese / English
        }

        // Pergunta 3 / Question 3
        scanner.nextLine();  // Consumir o "enter" que ficou no buffer do scanner / Consume the leftover "enter" from the previous input
        System.out.println("Pergunta 3: Qual é o maior planeta do sistema solar?");  // Portuguese
        System.out.println("Question 3: What is the largest planet in the solar system?");  // English
        String resposta3 = scanner.nextLine();  // Lê a resposta do usuário / Read the user's answer
        if (resposta3.equalsIgnoreCase("Júpiter")) {  // Verifica se a resposta está correta / Check if the answer is correct
            pontuacao++;  // Se a resposta for correta, aumenta a pontuação / If the answer is correct, increase the score
            System.out.println("Resposta correta! / Correct answer!");  // Portuguese / English
        } else {
            System.out.println("Resposta errada. A resposta correta é Júpiter. / Wrong answer. The correct answer is Jupiter.");  // Portuguese / English
        }

        // Exibe a pontuação final / Display the final score
        System.out.println("Sua pontuação final é: " + pontuacao + "/3");  // Portuguese
        System.out.println("Your final score is: " + pontuacao + "/3");  // English

        // Fecha o scanner / Close the scanner
        scanner.close();
    }
}
/* Explicação Simples:
Perguntas e Respostas: O programa tem 3 perguntas, e o usuário deve responder a cada uma delas. A cada resposta certa, ele ganha 1 ponto.

Comparação de Respostas: O programa verifica se a resposta fornecida pelo usuário é a mesma que a resposta correta:

Primeira pergunta: Qual a capital do Brasil? A resposta correta é Brasília.
Segunda pergunta: Quanto é 5 + 3? A resposta correta é 8.
Terceira pergunta: Qual é o maior planeta do sistema solar? A resposta correta é Júpiter.
Pontuação: O programa acumula uma pontuação dependendo de quantas respostas corretas o usuário der. No final, o programa mostra a pontuação do usuário (de 0 a 3).

Mensagens de Feedback: Para cada resposta, o programa informa se a resposta foi correta ou errada e, se errada, qual era a resposta correta.

Saída Final: O programa exibe a pontuação final do usuário no final do jogo, mostrando quantas respostas ele acertou. */