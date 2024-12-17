package calculadora;

import java.util.ArrayList;

public interface CalculatorInterface {
    public void setNumbers(double a, double b);
    public boolean memoryIsEmpty();
    public ArrayList<Double> getMemory();
    public void sum();
    public void difference();
    public void product();
    public void quotient();
    public void intQuotient();
    public void rest();
    public void exponential();
    public void factorial();
    public void floor();
    
}