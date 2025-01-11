package listaControle;

import java.util.Scanner;

/*
 * Implemente um programa que, dado o nome de um mês, imprima se é o primeiro ou o 
 * segundo semestre (“março” = “primeiro semestre”, “outubro” = “segundo semestre”, etc.).
 * Utilize a estrutura switch. Trate meses inválidos.
 */

public class Month {
    public static void monthBelongsToSemester(){
        Scanner scan = new Scanner(System.in);
        String month;
        System.out.print("Digite o nome do mês: ");
        month = scan.nextLine();
        switch (month) {
            case "Janeiro":
                System.out.println("Férias");
                break;
            case "Fevereiro":
                System.out.println("Férias");
                break;
            case "Março":
                System.out.println("Primeiro semestre");
                break;
            case "Abril":
                System.out.println("Primeiro semestre");
                break;
            case "Maio":
                System.out.println("Primeiro semestre");
                break;
            case "Junho":
                System.out.println("Primeiro semestre");
                break;
            case "Julho":
                System.out.println("Férias");
                break;
            case "Agosto":
                System.out.println("Segundo semestre");
                break;
            case "Setembro":
                System.out.println("Segundo semestre");
                break;
            case "Outubro":
                System.out.println("Segundo semestre");
                break;
            case "Novembro":
                System.out.println("Segundo semestre");
                break;
            case "Dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mẽs inválido (aceitos apenas meses com inicial maiúscula)");
                break;
        }
    }
}
