import java.util.ArrayList;

public class Enemy {
    String name;
    int health;
    int attackDamage;
    ArrayList<ArrayList<Attack>> attacks = new ArrayList<>();

    public Enemy(int health, int attack) {
        this.health = health;
        this.attackDamage = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attack) {
        this.attackDamage = attack;
    }

    public ArrayList<ArrayList<Attack>> getAttacks() {
        return attacks;
    }

    public void setAttack(ArrayList<Attack> attack) {
        this.attacks.add(attack);
    }
}
