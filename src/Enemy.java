public class Enemy {
    String name;
    int health;
    int attackDamage;
    Attack[] attacks;

    public Enemy(String name, int health, int attackDamage, Attack[] attacks) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.attacks = attacks;
    }

    public String getName() {
        return name;
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

    public Attack[] getAttacks() {
        return attacks;
    }
}
