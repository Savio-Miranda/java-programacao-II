package listaArrays;

import java.util.Scanner;

/*
1) Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos
invertidos. Por exemplo, dado o número 7.631, o método deve retornar 1.367. Incorpore o
método a um aplicativo que lê um valor a partir da entrada fornecida pelo usuário e exibe o
resultado.
 */

public class BackwardNumber {
    
    public static void invertNumber(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número (double): ");
        double number = scan.nextDouble();
        
        char[] parsedNumber = Double.toString(number).toCharArray();
        char[] aux = new char[parsedNumber.length];
        for (int i = aux.length - 1; i >= 0; i--) {
            aux[aux.length - i - 1] = parsedNumber[i];
        }
        String backwardsNumber = "";
        for (char c : aux) {
            backwardsNumber += c;
        }

        System.out.println("Inversão: " + backwardsNumber);
    }
}
