package calculadora;

import java.util.ArrayList;

public interface CalculatorInterface {
    public void setForSingularOperation(double a);
    public void setForDoubleOperation(double a, double b);
    public void setForTripleOperation(double a, double b, double c);
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
    public void root();
    public void ceiling();
    
}