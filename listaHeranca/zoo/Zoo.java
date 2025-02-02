package listaHeranca.zoo;


public class Zoo {
    public static void showMamal(Animal animal){
        System.out.println("Animal: " + animal.getName());
        System.out.println("Comprimento: " + animal.getSize());
        System.out.println("Patas: " + animal.getPaws());
        System.out.println("Cor: " + animal.getColor());
        System.out.println("Ambiente: " + animal.getHabitat());
        System.out.println("Velocidade: " + animal.getSpeed());
        
        if (animal instanceof Fish) {
            Fish fish = (Fish) animal; // Cast para Fish
            System.out.println("Característica: " + fish.getCharacteristic());
        } else if (animal instanceof Mamal) {
            Mamal mamal = (Mamal) animal; // Cast para Mamal
            System.out.println("Alimento: " + mamal.getFeeding());
        }
    }

    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        Fish tubarao = new Fish("Tubarão", 300, 0, "Cinzento", "Mar", (float) 1.5, "Barbatanas e cauda");
        Mamal urso_do_canada = new Mamal("Urso-do-canadá", 180, 4, "Vermelho", "Terra", (float) 0.5, "Mel");
        
        System.out.println("Zoo:");
        Animal[] animais = {camelo, tubarao, urso_do_canada};
        for (Animal animal : animais){
            System.out.println("-".repeat(35));
            showMamal(animal);
        }
        System.out.println("-".repeat(35));
    }
}
