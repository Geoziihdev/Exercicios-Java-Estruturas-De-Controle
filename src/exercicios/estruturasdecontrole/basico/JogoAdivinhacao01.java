package exercicios.estruturasdecontrole.basico;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1; 
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Adivinhe o número entre 1 e 100:");

        // Loop para permitir tentativas
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
            }
        }

        scanner.close(); // Fecha o scanner
    }
}



/*
 * Explicação do Código Importação de Classes: As classes Random e Scanner são
 * importadas para gerar números aleatórios e ler a entrada do usuário.
 * 
 * Geração do Número Secreto: Um número aleatório entre 1 e 100 é gerado e
 * armazenado na variável numeroSecreto.
 * 
 * Loop de Tentativas: Um loop while continua pedindo palpites ao usuário até
 * que o número secreto seja adivinhado:
 * 
 * O usuário é solicitado a inserir um palpite. O programa verifica se o palpite
 * é menor, maior ou igual ao número secreto, e fornece feedback apropriado. O
 * contador de tentativas é incrementado a cada palpite. Encerramento: Quando o
 * usuário adivinha o número, o programa exibe a quantidade de tentativas e
 * encerra.
 */
