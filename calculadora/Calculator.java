package calculadora;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Calculator implements CalculatorInterface {
    private ArrayList<Double> memory = new ArrayList<Double>();
    private double result;

    @Override
    public boolean memoryIsEmpty(){
        return (memory.size() == 0) ? true : false;
    }

    @Override
    public ArrayList<Double> getMemory(){
        return memory;
    }
    
    @Override
    public void sum(double termA, double termB){
        result = termA + termB;
        memory.add(result);
    }
    
    @Override
    public void difference(double termA, double termB){
        result = termA - termB;
        memory.add(result);
    }
    
    @Override
    public void product(double factorA, double factorB){
        result = factorA * factorB;
        memory.add(result);
    }

    @Override
    public void quotient(double numerator, double divisor){
        // result = n1 / n2;
        // memory.add(result);
        // Verifica se n2 é zero antes de tudo
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        // Realiza a divisão e converte para BigDecimal
        BigDecimal resultDecimal = BigDecimal.valueOf(numerator).divide(BigDecimal.valueOf(divisor), 3, RoundingMode.HALF_UP);

        // Converte de volta para double para armazenar
        result = resultDecimal.doubleValue();

        // Armazena o resultado na memória
        memory.add(result);
    }
    
    @Override
    public void intQuotient(double numerator, double divisor){
        double rest = numerator % divisor;
        result = (numerator - rest)/divisor;
        memory.add(result);
    }

    @Override
    public void rest(double numerator, double divisor){
        result = numerator % divisor;
        memory.add(result);
    }

    @Override
    public void exponential(double base, double exp){
        result = Math.pow(base, exp);
        memory.add(result);
    }

    public double internFactorial(int toFactor){
        result = 1;
        for(int i = toFactor; i >= 2; i--){
            result *= i;
        }
        return result;
    }

    @Override
    public void factorial(int toFactor){
        result = internFactorial(toFactor);
        memory.add(result);
    }

    @Override
    public void root(int radicand, int index){
        result = Math.pow(radicand, 1/index);
        memory.add(result);
    }

    @Override
    public void ceiling(double toCeil){
        result = Math.ceil(toCeil);
        memory.add(result);
    }

    @Override
    public void floor(double toFloor){
        result = Math.floor(toFloor);
        memory.add(result);
    }

    @Override
    public void arrangement(int n, int k){
        result = internFactorial(n)/internFactorial(n-k);
        memory.add(result);
    }

    @Override
    public void permutation(int n, int[] repetitions){
        double denominator = 1;
        for (int i = 0; i < repetitions.length; i++) {
            System.out.println("denominador? " + repetitions[i]);
            denominator *= internFactorial(repetitions[i]);
        }
        double result = internFactorial(n)/denominator;
        memory.add(result);
    }

    @Override
    public boolean checkIfPrime(int n){
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public boolean checkIfPerfectSquare(int n){
        if (n < 0) {
            return false;
        }
        result = Math.sqrt(n);
        return result == Math.floor(result);
    }




}
