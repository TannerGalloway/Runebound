import java.util.ArrayList;

public class Player {
    int health = 100;
    int attack = 5;
    int score = 0;
    ArrayList<ArrayList<Item>> inventory = new ArrayList<>();
    ArrayList<ArrayList<Attack>> attacks = new ArrayList<>();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<ArrayList<Item>> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> item) {
        this.inventory.add(item);
    }

    public void removeItemFromInventory(ArrayList<Item> item) {
        this.inventory.remove(item);
    }
}
