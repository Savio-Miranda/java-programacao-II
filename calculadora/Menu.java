package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Calculator calculator;
    private Scanner scan = new Scanner(System.in);
    
    public Menu(Calculator calculator) {
        this.calculator = calculator;
    }

    private void checkNumbers(){
        double n1 = 0;
        double n2 = 0;
        
        if (!calculator.memoryIsEmpty()) {
            System.out.print("Carregar da memória? (S/s)");
            String decision = scan.next();
            if(decision.matches("[Ss]")){
                showMemory();
                System.out.print("Insira o index de [0, n]: ");
                int index = scan.nextInt();
                scan.nextLine(); // Limpa o buffer após a leitura do index
                n1 = validateMemoryIndex(calculator.getMemory(), index);
                System.out.print("n2: ");
                n2 = scan.nextFloat();
            }
        } else {
            System.out.print("n1: ");
            n1 = scan.nextFloat();
            scan.nextLine(); // Limpa o buffer após a leitura de n1

            System.out.print("n2: ");
            n2 = scan.nextFloat();
            scan.nextLine(); // Limpa o buffer após a leitura de n2

        }
        calculator.setNumbers(n1, n2);
    }

    private ArrayList<String> showMemory(){
        ArrayList<String> memoryToShow = new ArrayList<String>();
        for(double element : calculator.getMemory()){
            String stringFloatElement = String.valueOf(element);
            if(stringFloatElement.endsWith(".0")){
                String stringIntElement = String.valueOf(Math.round(element));
                memoryToShow.add(stringIntElement);
            } else {
                memoryToShow.add(stringFloatElement);
            }
        }
        return memoryToShow;
    }

    private double validateMemoryIndex(ArrayList<Double> memory, int index){
        if(index >= memory.size() || index < 0){
            return memory.get(memory.size() - 1);
        }
        return memory.get(index);
    }

    private void showMenu(){
        System.out.println("*--------- MENU ----------*");
        System.out.println("| Finalizar programa (0)  |");
        System.out.println("| Soma (+)                |");
        System.out.println("| Diferença (-)           |");
        System.out.println("| Multiplicação (*)       |");
        System.out.println("| Divisão (/)             |");
        System.out.println("| Divisão Inteira (//)    |");
        System.out.println("| Resto (%)               |");
        System.out.println("| Exponencial (^)         |");
        System.out.println("| Fatorial(!)             |");
        System.out.println("| (A)rranjo               |");
        System.out.println("| (P)ermutação            |");
        System.out.println("| Piso (F)                |");
        System.out.println("| Teto (C)                |");
        System.out.println("| Raiz (R)                |");
        System.out.println("| (P)rimo                 |");
        System.out.println("| Quadrado Perfeito (SQP) |");
        System.out.println("*-------------------------*");
        System.out.println("MEMÓRIA: " + showMemory());
        System.out.print("*-> ");
    }

    public void operation() {
        boolean end = false;
        
        while (!end) {
            showMenu();
            String userInput = scan.next();

            switch (userInput) {
                case "0":
                    end = true;
                    break;
                
                case "+":
                    checkNumbers();
                    calculator.sum();
                    break;
                
                case "-":
                    checkNumbers();
                    calculator.difference();
                    break;
                
                case "*":
                    checkNumbers();
                    calculator.product();
                    break;
                
                case "/":
                    checkNumbers();
                    calculator.quotient();
                    break;
                
                case "//":
                    checkNumbers();
                    calculator.intQuotient();
                    break;
                
                case "%":
                    checkNumbers();
                    calculator.rest();
                    break;
        
                case "^":
                    checkNumbers();
                    calculator.exponential();
                    break;
                
                case "!":
                    // AINDA FALTA IMPLEMENTAÇÃO
                    checkNumbers();
                    calculator.factorial();
                    break;
                
                // case "A":
                //     calculadora.arrangement();
                //     break;
                
                // case "P":
                //     calculadora.permutation();
                //     break;
                
                case "f":
                    checkNumbers();
                    calculator.floor();
                    break;
                
                // case "c":
                //     calculadora.ceiling();
                //     break;
                
                // case "r":
                //     calculadora.root();
                //     break;
                
                // case "Prime":
                //     calculadora.checkIfPrime();
                //     break;
                
                // case "SQP":
                //     calculadora.checkIfPerfectSquare();
                //     break;

                default:
                    showMenu();
                    break;
            }
            //showMenu(calculadora);
        }
    }

}
