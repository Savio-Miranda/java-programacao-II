package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Calculator calculator;
    private Scanner scan = new Scanner(System.in);
    
    public Menu(Calculator calculator) {
        this.calculator = calculator;
    }

    private void singleOperation(){
        double number;

        if (calculator.memoryIsEmpty()) {
            System.out.print("n1: ");
            number = scan.nextDouble();
        } else {
            System.out.print("Carregar da memória? (S/s)");
            String decision = scan.next();
            if(decision.matches("[Ss]")){
                showMemory();
                System.out.print("Insira o index [0, n]: ");
                int index = scan.nextInt();
                number = validateMemoryIndex(calculator.getMemory(), index);
            } else {
                System.out.print("n1: ");
                number = scan.nextDouble();
            }
        }

        calculator.setForSingularOperation(number);
    }

    private void doubleOperation(){
        double n1, n2;

        if (calculator.memoryIsEmpty()) {
            System.out.print("n1: ");
            n1 = scan.nextDouble();
            System.out.print("n2: ");
            n2 = scan.nextDouble();
        } else {
            System.out.print("Carregar da memória? (S/s)");
            String decision = scan.next();
            if(decision.matches("[Ss]")){
                showMemory();
                System.out.print("Insira o index [0, n]: ");
                int index = scan.nextInt();
                n1 = validateMemoryIndex(calculator.getMemory(), index);
                System.out.print("n2: ");
                n2 = scan.nextDouble();
            } else {
                System.out.print("n1: ");
                n1 = scan.nextDouble();
                System.out.print("n2: ");
                n2 = scan.nextDouble();
            }
        }

        calculator.setForDoubleOperation(n1, n2);
    }

    private void tripleOperation(){
        double n1, n2, n3;

        if (calculator.memoryIsEmpty()) {
            System.out.print("n1: ");
            n1 = scan.nextDouble();
            System.out.print("n2: ");
            n2 = scan.nextDouble();
            System.out.print("n2: ");
            n3 = scan.nextDouble();
        } else {
            System.out.print("Carregar da memória? (S/s)");
            String decision = scan.next();
            if(decision.matches("[Ss]")){
                showMemory();
                System.out.print("Insira o index [0, n]: ");
                int index = scan.nextInt();
                n1 = validateMemoryIndex(calculator.getMemory(), index);
                System.out.print("n2: ");
                n2 = scan.nextDouble();
                System.out.print("n3: ");
                n3 = scan.nextDouble();
            } else {
                System.out.print("n1: ");
                n1 = scan.nextDouble();
                System.out.print("n2: ");
                n2 = scan.nextDouble();
                System.out.print("n2: ");
                n3 = scan.nextDouble();
            }
        }

        calculator.setForTripleOperation(n1, n2, n3);
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
                    doubleOperation();
                    calculator.sum();
                    break;
                
                case "-":
                    doubleOperation();
                    calculator.difference();
                    break;
                
                case "*":
                    doubleOperation();
                    calculator.product();
                    break;
                
                case "/":
                    doubleOperation();
                    calculator.quotient();
                    break;
                
                case "//":
                    doubleOperation();
                    calculator.intQuotient();
                    break;
                
                case "%":
                    doubleOperation();
                    calculator.rest();
                    break;
        
                case "^":
                    doubleOperation();
                    calculator.exponential();
                    break;
                
                case "!":
                    singleOperation();
                    calculator.factorial();
                    break;
                
                // case "A":
                //     calculator.arrangement();
                //     break;
                
                // case "P":
                //     calculator.permutation();
                //     break;
                
                case "f":
                    doubleOperation();
                    calculator.floor();
                    break;
                
                case "c":
                    singleOperation();
                    calculator.ceiling();
                    break;
                
                case "r":
                    tripleOperation();
                    calculator.root();
                    break;
                
                // case "Prime":
                //     calculator.checkIfPrime();
                //     break;
                
                // case "SQP":
                //     calculator.checkIfPerfectSquare();
                //     break;

                default:
                    showMenu();
                    break;
            }
            //showMenu(calculator);
        }
    }

}
