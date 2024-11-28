import java.util.ArrayList;

import animalia.Animal;
import animalia.Cat;
import animalia.Tatu;

public class main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Tatu tatu = new Tatu();
        
        ArrayList<Animal> lotsOfAnimals = new ArrayList<Animal>();
        lotsOfAnimals.add(cat);
        lotsOfAnimals.add(tatu);

        for (Animal animal : lotsOfAnimals){
            animal.eating();
            animal.makeNoise();
        }
    }
}
