package listaHeranca.pokemon;


public class Pokemon {
    private String name;
    private Status status;
    private Type type1;
    private Type type2;

    private int attack;
    private int defense;
    private int speed;
    private int special;
    Attack[] attackNames;
    
    public Pokemon(String name, Type type1, Type type2, int attack, int defense, int speed, int special, Attack[] attackNames) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.special = special;
        this.attackNames = attackNames;
        this.type1 = type1;
        this.type2 = type2;
        this.status = new Status(); // Inicializa o status
        this.status.setStatusOk(); // Define o status inicial como "OK"
    }

    public int attack(int attack){
        switch (attack) {
            case 0:
                return attackNames[0].dealsDamage();
            case 1:
                return attackNames[1].dealsDamage();
            case 2:
                return attackNames[2].dealsDamage();
            default:
                return attackNames[0].pass();
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status.getStatus();
    }
    
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpecial() {
        return special;
    }
    public String getType1(){
        return this.type1.getType1();
    }
    public String getType2(){
        return this.type2.getType2();
    }
    public void setSpecial(int special) {
        this.special = special;
    }
    
    public void setStatusOk() {
        this.status.setStatusOk();
    }
    
    public void setStatusSleeping() {
        this.status.setStatusSleeping();
    }
    
    public void setStatusParalyzed() {
        this.status.setStatusParalyzed();
    }
    
    public void setStatusStunned() {
        this.status.setStatusStunned();
    }
    
    public void setStatusBurned() {
        this.status.setStatusBurned();
    }
    
    public void setStatusPoisoned() {
        this.status.setStatusPoisoned();
    }
    
}
