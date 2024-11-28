package animalia;

public class Cat implements Animal{
    @Override
    public void eating(){
        System.out.println("Nhoc nhoc...");
    }
    @Override
    public void makeNoise(){
        System.out.println("Miau!");
    }
}