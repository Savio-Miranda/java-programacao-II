package animalia;

public class Tatu implements Animal{
    @Override
    public void eating(){
        System.out.println("Chomp chomp");
    }
    @Override
    public void makeNoise(){
        System.out.println("Oi, meu nome é Fuleco!");
    }
}