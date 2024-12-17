package calculadora;


import java.util.ArrayList;


public class Calculator implements CalculatorInterface {
    private ArrayList<Double> memory = new ArrayList<Double>();
    private Double n1;
    private Double n2;
    private Double n3;
    private double result;
    @Override
    public void setForSingularOperation(double a){
        this.n1 = a;
    }
    
    @Override
    public void setForDoubleOperation(double a, double b){
        this.n1 = a;
        this.n2 = b;
    }

    @Override
    public void setForTripleOperation(double a, double b, double c){
        this.n1 = a;
        this.n2 = b;
        this.n3 = c;
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
        result = n1 + n2;
        memory.add(result);
    }
    
    @Override
    public void difference(){
        result = n1 - n2;
        memory.add(result);
    }
    
    @Override
    public void product(){
        result = n1 * n2;
        memory.add(result);
    }

    @Override
    public void quotient(){
        result = n1 / n2;
        memory.add(result);
    }
    
    @Override
    public void floor(){
        result = 0;
        memory.add(result);
    }
    
    @Override
    public void intQuotient(){
        double rest = n1 % n2;
        result = (n1 + rest)/n2;
        memory.add(result);
    }

    @Override
    public void rest(){
        result = n1 % n2;
        memory.add(result);
    }

    @Override
    public void exponential(){
        result = Math.pow(n1, n2);
        memory.add(result);
    }

    @Override
    public void factorial(){
        result = 1;
        for(int i = n1.intValue(); i >= 2; i--){
            result *= i;
        }
        memory.add(result);
    }

    @Override
    public void root(){
        result = Math.pow(n1, n3/n2);
        memory.add(result);
    }

    @Override
    public void ceiling(){
        result = Math.ceil(n1);
        memory.add(result);
    }



}
