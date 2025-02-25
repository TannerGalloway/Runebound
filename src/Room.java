import java.util.ArrayList;

public class Room {
    String description;
    ArrayList<Item> loot;
    ArrayList<Enemy> enemies;

    public Room(String description, ArrayList<Item> loot, ArrayList<Enemy> enemies) {
        this.description = description;
        this.loot = loot;
        this.enemies = enemies;
    }
}
