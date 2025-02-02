package listaHeranca.zoo;


public class Mamal extends Animal {
    private String feeding;

    public Mamal(String name, int size, int paws, String color, String habitat, float speed, String feeding) {
        super(name, size, paws, color, habitat, speed);
        this.feeding = feeding;
    }

    public String getFeeding() {
        return feeding;
    }
    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }
    
}
