package exercicios.estruturasdecontrole.basico;

public class ContagemRegressiva09 {
    public static void main(String[] args) {
        // Número inicial para a contagem regressiva / Initial number for countdown
        int numero = 10;

        // Laço de repetição que faz a contagem regressiva / Loop to do the countdown
        while (numero >= 0) {
            System.out.println(numero);  // Imprime o número da contagem / Print the countdown number

            // Pausa de 1 segundo / Pause for 1 second
            try {
                Thread.sleep(1000);  // Espera 1000 milissegundos (1 segundo) / Wait for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();  // Caso ocorra algum erro / If an error occurs
            }

            // Decrementa o número / Decrease the number
            numero--;
        }

        // Mensagem final após a contagem regressiva / Final message after countdown
        System.out.println("Feliz Ano Novo!");  // Portuguese
        System.out.println("Happy New Year!");  // English
    }
}
/* Explicação Simples:
Número Inicial:

O programa começa a contagem a partir do número 10. Você pode mudar esse número para começar de qualquer outro número que desejar.
Laço de Repetição:

O programa usa um laço while para repetir a contagem, desde que o número seja maior ou igual a 0.
A cada iteração, o número é impresso na tela e o programa aguarda 1 segundo (1000 milissegundos) antes de mostrar o próximo número.
Pausa de 1 Segundo:

A pausa de 1 segundo é feita com o método Thread.sleep(1000), que faz o programa "dormir" por 1000 milissegundos entre as iterações.
Mensagem Final:

Quando o número chega a 0, o programa exibe uma mensagem final: "Feliz Ano Novo!" em português e "Happy New Year!" em inglês.
*/