package listaControle;
/*
 * Implemente um programa que, dado um número de 1 a 7, imprima o dia da semana 
 * correspondente (1 = “Domingo”, 2 = “Segunda-feira”, etc.). Utilize a estrutura switch.
 */
import java.util.Scanner;

public class Week {
    public static void returnsWeekDay(){
        Scanner scan = new Scanner(System.in);
        int day;
        System.out.print("Digite o dia da semana: ");
        day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia da semana inválido...");
                break;
        }
    }
}
