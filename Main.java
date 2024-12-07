// import java.util.ArrayList;

// import animalia.Animal;
// import animalia.Cat;
// import animalia.Tatu;
import lista01.Questao05;
import lista01.Questao06;

public class Main {
    public static void main(String[] args){
        // Cat cat = new Cat();
        // Tatu tatu = new Tatu();
        
        // ArrayList<Animal> lotsOfAnimals = new ArrayList<Animal>();
        // lotsOfAnimals.add(cat);
        // lotsOfAnimals.add(tatu);

        // for (Animal animal : lotsOfAnimals){
        //     animal.eating();
        //     animal.makeNoise();
        // }
        Questao05.somarNumerosUmATrinta();
        Questao05.multiplicacaoNumerosUmATrinta();

        Questao06 questao = new Questao06(10, 20, "abc", "cba");
        questao.trocarValorPrimitivasSemTemp();
        questao.trocarStringSemTemp();

    }
}
