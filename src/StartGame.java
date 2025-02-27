 import java.util.ArrayList;

public class StartGame {
    public static void startGame() {
//      Names for the rooms
        String[] rooms = {"Forsaken Outpost", "Whispering Catacombs", "Blighted Forest", "Crystalline Cavern", "Throne of the Abyss"};
        ArrayList<Room> roomList = new ArrayList<>();
        int currentRoomID = 0;
        Player player = new Player();

        // Generate new rooms
        for (String room : rooms) {
            // Add newly gen rooms to the roomList array
            roomList.add(RandomGen.genRoom(room));
        }

        // Add Starter Item to Inventory
        Item starterWeapon = new Item("Iron Shortsword", "Weapon", 5, 0);
        Actions.addToInventory(player, starterWeapon);

        //Update the player damage
        Actions.setAttack(player, 5);

        // Call Menu with required data
        Menu.menu(rooms[currentRoomID], roomList, rooms, currentRoomID, player);
    }
}
