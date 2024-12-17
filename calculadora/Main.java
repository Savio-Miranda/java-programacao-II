package calculadora;

public class Main {    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Menu menu = new Menu(calculator);
        menu.operation();
    }
}
