package listaHeranca.pokemon;

public class Attack {
    private String name;
    private int damage;

    public Attack(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int dealsDamage(){
        return damage;
    }
    
    public int pass(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }
}