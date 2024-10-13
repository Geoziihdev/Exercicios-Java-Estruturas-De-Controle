package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;

public class VerificadorParOuImpar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Declara a variável continuar

        while (continuar) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
            }

            // Perguntar se o usuário deseja fazer outra operação
            System.out.println("Deseja fazer outra operação? (s/n)");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false; // Sair do loop
            }
        }

        System.out.println("Calculadora encerrada.");
        scanner.close();
    }
}




/*
 * Explicação do Código: Importação da Classe Scanner: Usamos import
 * java.util.Scanner; para poder ler a entrada do usuário.
 * 
 * Criação do Objeto Scanner: Scanner scanner = new Scanner(System.in); cria um
 * objeto Scanner para ler dados da entrada padrão (teclado).
 * 
 * Entrada do Usuário: O programa pede ao usuário para digitar um número.
 * 
 * Verificação: Usamos if (numero % 2 == 0) para verificar se o número é par. Se
 * o resto da divisão por 2 for igual a zero, o número é par; caso contrário, é
 * ímpar.
 * 
 * Exibição do Resultado: O resultado é impresso na tela.
 * 
 * Fechamento do Scanner: scanner.close(); é usado para fechar o objeto Scanner
 * e liberar recursos.
 */