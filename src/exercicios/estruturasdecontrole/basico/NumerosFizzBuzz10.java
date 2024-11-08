package exercicios.estruturasdecontrole.basico;

import java.util.ArrayList;
import java.util.List;

public class NumerosFizzBuzz10 {
    public static void main(String[] args) {
        // Listas para armazenar os números correspondentes a Fizz, Buzz, FizzBuzz e os números que não atendem
        List<Integer> fizzNumbers = new ArrayList<>();
        List<Integer> buzzNumbers = new ArrayList<>();
        List<Integer> fizzBuzzNumbers = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();

        // Loop para iterar de 1 a 100 / Loop to iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Se o número for divisível por 3 e 5, adiciona à lista FizzBuzz / If divisible by both 3 and 5, add to FizzBuzz list
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzNumbers.add(i);
            } 
            // Se o número for divisível apenas por 3, adiciona à lista Fizz / If divisible by 3, add to Fizz list
            else if (i % 3 == 0) {
                fizzNumbers.add(i);
            } 
            // Se o número for divisível apenas por 5, adiciona à lista Buzz / If divisible by 5, add to Buzz list
            else if (i % 5 == 0) {
                buzzNumbers.add(i);
            } 
            // Caso contrário, adiciona à lista de outros / Otherwise, add to Other list
            else {
                otherNumbers.add(i);
            }
        }

        // Exibe a tabela de resultados / Display the result table
        System.out.println("FizzBuzz Tabela:\n");

        // Exibe a lista FizzBuzz / Display FizzBuzz list
        System.out.print("FizzBuzz: ");
        for (int num : fizzBuzzNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Exibe a lista Fizz / Display Fizz list
        System.out.print("Fizz: ");
        for (int num : fizzNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Exibe a lista Buzz / Display Buzz list
        System.out.print("Buzz: ");
        for (int num : buzzNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Exibe os números que não atendem a nenhum dos casos / Display numbers that don't match any of the cases
        System.out.print("Não atende Fizz/Buzz/FizzBuzz: ");
        for (int num : otherNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/* Como está estruturada a saída:
FizzBuzz: Todos os números que são divisíveis por 3 e 5 são agrupados juntos e mostrados na mesma linha.
Fizz: Todos os números divisíveis apenas por 3 são mostrados na mesma linha, depois de "Fizz".
Buzz: Todos os números divisíveis apenas por 5 são mostrados na mesma linha, depois de "Buzz".
Não atende Fizz/Buzz/FizzBuzz: Todos os outros números, que não são divisíveis nem por 3 nem por 5, são agrupados nesta categoria. */