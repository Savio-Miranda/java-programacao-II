package listaHeranca.zoo;

public class Animal {
    private String name;
    private int size;
    private int paws;
    private String color;
    private String habitat;
    private float speed;
    
    public Animal(String name, int size, int paws, String color, String habitat, float speed) {
        this.name = name;
        this.size = size;
        this.paws = paws;
        this.color = color;
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getPaws() {
        return paws;
    }
    public void setPaws(int paws) {
        this.paws = paws;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
}
