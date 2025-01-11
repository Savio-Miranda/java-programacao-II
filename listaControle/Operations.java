package listaControle;

import java.util.Scanner;

/*
 * Escreva um programa em Java para:
 * 1. Ler um valor inteiro (a) do teclado;
 * 2. Ler um caractere (op) de uma das quatro operações aritméticas (+, -, * ou /) do teclado;
 * 3. Ler um * valor inteiro (b) do teclado; Imprimir o resultado da expressão digitada.
 */

public class Operations {
    public static void operate(){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        String op;
        System.out.print("a: ");
        a = scan.nextInt();
        scan.nextLine();
        int result = a;
        System.out.print("op: ");
        op = scan.next();
        scan.nextLine();
        
        if(!op.matches("[+\\-*/]+")){
            System.out.println("Operação inválida...");
            return;
        }
        
        b = scan.nextInt();
        
        switch (op) {
            case "+":
                result += b;
                break;
            case "-":
                result -= b;
                break;
            case "*":
                result *= b;
                break;
            case "/":
                result /= b;
                break;
            default:
                System.out.println("Operação inválida...");
            break;
        }
        System.out.println(a + " " + op + " " + b + " = " + result);
    }
}
