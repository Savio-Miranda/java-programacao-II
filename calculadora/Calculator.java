package calculadora;


import java.util.ArrayList;


public class Calculator implements CalculatorInterface {
    private ArrayList<Double> memory = new ArrayList<Double>();
    private double n1;
    private double n2;

    @Override
    public void setNumbers(double a, double b){
        this.n1 = a;
        this.n2 = b;
    }

    @Override
    public boolean memoryIsEmpty(){
        return (memory.size() == 0) ? true : false;
    }

    @Override
    public ArrayList<Double> getMemory(){
        return memory;
    }
    
    @Override
    public void sum(){
        double result = n1 + n2;
        memory.add(result);
    }
    
    @Override
    public void difference(){
        double result = n1 - n2;
        memory.add(result);
    }
    
    @Override
    public void product(){
        double result = n1 * n2;
        memory.add(result);
    }

    @Override
    public void quotient(){
        double result = n1 / n2;
        memory.add(result);
    }
    
    @Override
    public void floor(){
        double result = 0;
        memory.add(result);
    }
    
    @Override
    public void intQuotient(){
        double rest = n1 % n2;
        double result = n1 - rest;
        memory.add(result);
    }

    @Override
    public void rest(){
        double result = n1 % n2;
        memory.add(result);
    }

    @Override
    public void exponential(){
        double result = Math.pow(n1, n2);
        memory.add(result);
    }

    @Override
    public void factorial(){
        // AINDA FALTA IMPLEMENTAÇÃO
    }

}
