package listaHeranca.pokemon;

public class Main {
    public static void main(String[] args) {
        // Criando um Pokémon
        Attack[] attacks = {
            new Attack("Tackle", 40),
            new Attack("Ember", 60),
            new Attack("Water Gun", 50) };
        
        Type type1 = new Type();
        type1.setType1Poison();
        Type type2 = new Type();
        type2.setType2None();

        
        Pokemon nidorino = new Pokemon("Nidorino", type1, type2, 84, 78, 100, 85, attacks);

        System.out.println("Pokémon: " + nidorino.getName());
        System.out.println("Type1: " + nidorino.getType1());
        System.out.println("Type2: " + nidorino.getType2());
        System.out.println("Attack: " + nidorino.getAttack());
        System.out.println("Defense: " + nidorino.getDefense());
        System.out.println("Speed: " + nidorino.getSpeed());
        System.out.println("Special: " + nidorino.getSpecial());
        System.out.println("Perform first attack: " + nidorino.attack(0));
        System.out.println("Perform second attack: " + nidorino.attack(1));
        System.out.println("Perform third attack: " + nidorino.attack(2));
        System.out.println("Perform pass: " + nidorino.attack(-1));
        System.out.println("Initial status: " + nidorino.getStatus());

        nidorino.setStatusBurned();
        System.out.println("Gets burned: " + nidorino.getStatus());

        nidorino.setStatusParalyzed();
        System.out.println("Gets paralyzed: " + nidorino.getStatus());
    }
}
