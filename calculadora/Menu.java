package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Calculator calculator;
    private Scanner scan = new Scanner(System.in);
    int impossibleNumber = -1000000;
    
    public Menu(Calculator calculator) {
        this.calculator = calculator;
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

    private int loadFromMemory(){
        if (calculator.memoryIsEmpty()){
            return impossibleNumber;
        }
        System.out.print("Carregar da memória? (S/s)");
        String load = scan.next();
        if (load.matches("[Ss]")) {
            showMemory();
            System.out.print("Insira o index da lista de 0 a n: ");
            int index = scan.nextInt();
            return index;
        }
        return impossibleNumber;
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
        System.out.println("| (Per)mutação            |");
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
            double a, b;
            int toFactorial, radicand, index, memoryIndex;
            switch (userInput) {
                case "0":
                    end = true;
                    break;
                
                case "+":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber) {
                        System.out.print("Primeiro termo: ");
                        a = scan.nextDouble();
                        System.out.print("Segundo termo: ");
                        b = scan.nextDouble();
                        calculator.sum(a, b);
                    } else {
                        System.out.print("Segundo termo: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.sum(a, b);
                    }
                    break;
                
                case "-":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber) {
                        System.out.print("Primeiro termo: ");
                        a = scan.nextDouble();
                        System.out.print("Segundo termo: ");
                        b = scan.nextDouble();
                        calculator.difference(a, b);
                    } else {
                        System.out.print("Segundo termo: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.difference(a, b);
                    }
                    break;
                
                case "*":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber){
                        System.out.print("Primeiro fator: ");
                        a = scan.nextDouble();
                        System.out.print("Segundo fator: ");
                        b = scan.nextDouble();
                        calculator.product(a, b);
                    } else {
                        System.out.print("Segundo fator: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.product(a, b);
                    }
                    break;
                
                case "/":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber) {
                        System.out.print("Numerador: ");
                        a = scan.nextDouble();
                        System.out.print("Divisor: ");
                        b = scan.nextDouble();
                        calculator.quotient(a, b);
                    } else {
                        System.out.print("Divisor: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.quotient(a, b);
                    }
                    break;
                
                case "//":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber){
                        System.out.print("Numerador: ");
                        a = scan.nextDouble();
                        System.out.print("Divisor: ");
                        b = scan.nextDouble();
                        calculator.intQuotient(a, b);
                    } else {
                        System.out.print("Divisor: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.intQuotient(a, b);
                    }
                    break;
                
                case "%":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber) {
                        System.out.print("Numerador: ");
                        a = scan.nextDouble();
                        System.out.print("Divisor: ");
                        b = scan.nextDouble();
                        calculator.rest(a, b);
                    } else {
                        System.out.print("Divisor: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.rest(a, b);
                    }
                    break;
        
                case "^":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber) {
                        System.out.print("Base: ");
                        a = scan.nextDouble();
                        System.out.print("Expoente: ");
                        b = scan.nextDouble();
                        calculator.exponential(a, b);
                    } else {
                        System.out.print("Expoente: ");
                        b = scan.nextDouble();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.exponential(a, b);
                    }
                    break;
                
                case "R":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber){
                        System.out.print("Radicando: ");
                        radicand = scan.nextInt();
                        System.out.print("Índice: ");
                        index = scan.nextInt();
                        calculator.root(radicand, index);
                    } else {
                        System.out.print("Índice: ");
                        index = scan.nextInt();
                        radicand = calculator.getMemory().get(memoryIndex).intValue();
                        calculator.root(radicand, index);
                    }
                    break;
                
                case "!":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber){
                        System.out.print("Fatorial de: ");
                        toFactorial = scan.nextInt();
                        System.out.println("MEU FATORIAL: " + toFactorial);
                        calculator.factorial(toFactorial);
                    } else {
                        System.out.print("Índice: ");
                        index = scan.nextInt();
                        toFactorial = calculator.getMemory().get(memoryIndex).intValue();
                        calculator.factorial(toFactorial);
                    }
                    break;
                
                case "A":
                    System.out.print("Digite o fatorial no numerador: ");
                    toFactorial = scan.nextInt();
                    System.out.print("Digite o número de objetos selecionados: ");
                    index = scan.nextInt();
                    calculator.arrangement(toFactorial, index);
                    break;
                
                case "Per":
                    System.out.print("Digite o fatorial no numerador: ");
                    toFactorial = scan.nextInt();
                    System.out.println("Digite a quantidade de elementos repetidos");
                    System.out.print("Ex. BANANA = 6!/(2!*3!)\nElementos repetidos: ");
                    index = scan.nextInt();
                    int[] repetitions = new int[index];
                    for (int i = 0; i < repetitions.length; i++) {
                        System.out.println("Agora digite o valor da repetição: ");
                        repetitions[i] = scan.nextInt();
                    }
                    calculator.permutation(toFactorial, repetitions);
                    break;

                case "f":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber) {
                        System.out.print("Piso: ");
                        a = scan.nextDouble();
                        calculator.floor(a);
                    } else {
                        System.out.print("Piso: ");
                        index = scan.nextInt();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.floor(a);
                    }
                    break;
                
                case "c":
                    memoryIndex = loadFromMemory();
                    if (memoryIndex == impossibleNumber){
                        System.out.print("Teto: ");
                        a = scan.nextDouble();
                        calculator.ceiling(a);
                    } else {
                        System.out.print("Teto: ");
                        index = scan.nextInt();
                        a = calculator.getMemory().get(memoryIndex);
                        calculator.floor(a);
                    }
                    break;
                
                case "P":
                    System.out.print("Digite um número para verificar sua primalidade: ");
                    index = scan.nextInt();
                    if(calculator.checkIfPrime(index)){
                        System.out.println("O número " + index + " é primo");
                    } else {
                        System.out.println("O número " + index + " não é primo");
                    }
                    break;
                
                case "SQP":
                    System.out.print("Digite um número para verificar se é um quadrado perfeito: ");
                    index = scan.nextInt();
                    if(calculator.checkIfPerfectSquare(index)){
                        System.out.println("O número " + index + " é quadrado perfeito");
                    } else {
                        System.out.println("O número " + index + " NÃO é quadrado perfeito");
                    }
                    break;

                default:
                    showMenu();
                    break;
            }
        }
    }

}
