public class Room {
    String description;
    String variation;
    Item[] loot;
    Enemy[] enemies;

    public Room(String description, String variation, Item[] loot, Enemy[] enemies) {
        this.description = description;
        this.variation = variation;
        this.loot = loot;
        this.enemies = enemies;
    }

    public String getDescription() {
        return description;
    }

    public String getVariation() {
        return variation;
    }

    public Item[] getLoot() {
        return loot;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }
}
