package exercicios.estruturasdecontrole.basico;

import java.util.Scanner;

public class CalculadoraSimples02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            // Exibir opções de operação
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            
            int operacao = scanner.nextInt();
            double resultado;

            switch (operacao) {
                case 1: // Adição
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 2: // Subtração
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 3: // Multiplicação
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 4: // Divisão
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                    
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            // Perguntar se o usuário deseja fazer outra operação
            System.out.println("Deseja fazer outra operação? (s/n)");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false; // Sair do loop
            }
        }

        scanner.close();
        System.out.println("Calculadora encerrada.");
    }
}


/*
 * Explicação da Lógica
 *  Importação: Você precisa importar a classe Scanner para
 * ler a entrada do usuário.
 * 
 * Entrada do Usuário: O programa solicita que o usuário digite dois números e
 * escolha uma operação. O Scanner é usado para capturar esses valores.
 * 
 * Estrutura de Controle: Usamos um switch para decidir qual operação realizar
 * com base na entrada do usuário.
 * 
 * Cálculo: Dependendo da operação escolhida, o programa calcula o resultado e o
 * exibe. Se a operação for divisão, há uma verificação para evitar a divisão
 * por zero.
 * 
 * Fechamento do Scanner: Por fim, o scanner é fechado para liberar recursos.
 */