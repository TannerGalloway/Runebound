import java.util.ArrayList;

public class Actions {

    public static String locate(Room currentRoom) {
        return currentRoom.getDescription();
    }

    public static ArrayList<Item> inventory(Player activePlayer){
        return activePlayer.getInventory();
    }

    public static void addToInventory(Player activePlayer, Item item) {
        activePlayer.addToInventory(item);
    }

    public static Enemy[] look(Room currentRoom){
        return currentRoom.getEnemies();
    }
}
