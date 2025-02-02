package listaHeranca.zoo;


public class Fish extends Animal {
    private String characteristic;

    public Fish(String name, int size, int paws, String color, String habitat, float speed, String characteristic) {
        super(name, size, paws, color, habitat, speed);
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
    
}
