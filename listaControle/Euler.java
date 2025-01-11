package listaControle;

import java.util.Scanner;

/*
 * Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a
 * seguir. Permita ao usuário inserir o número de termos a calcular.
 */

public class Euler {
    public static void getEuler(){
        Scanner scan = new Scanner(System.in);
        double euler = 1;
        int terms;
        System.out.print("Digite o número de termos: ");
        terms = scan.nextInt();
        for (int i = 1; i < terms; i++) {
            
            // fatorial
            double factorial = 1;
            for (int j = i; j >= 1; j--) {
                factorial *= j;
            }
            euler += 1/factorial;
            // System.out.println("Euler -> " + euler);
        }
        System.out.println("Euler: " + euler);
    }
}
