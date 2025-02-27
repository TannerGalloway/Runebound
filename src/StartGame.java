 import java.util.ArrayList;
 import java.util.Objects;
import java.util.Scanner;

public class StartGame {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
//      Names for the rooms
        String[] rooms = {"Forsaken Outpost", "Whispering Catacombs", "Blighted Forest", "Crystalline Cavern", "Throne of the Abyss"};
        ArrayList<Room> roomList = new ArrayList<>();

        // Generate new rooms
        for (int i = 0; i < rooms.length; i++) {
        // Add newly gen rooms to the roomList array
            roomList.add(RandomGen.genRoom(rooms[i]));

        }
        System.out.println("You find yourself in a mysterious place: ");
        System.out.println("Look Around");
        System.out.println("Check Inventory");
        System.out.println("Enter your choice: ");

        String selection = scanner.next();


        if(Objects.equals(selection.toLowerCase(), "look") || Objects.equals(selection.toLowerCase(), "look around")) {
            System.out.println("You see a door");
//            get an item in the current room
        }
        else if(Objects.equals(selection.toLowerCase(), "check") || Objects.equals(selection.toLowerCase(), "check inventory")) {
            System.out.println("You have a sword");
//            openInventory
        }
        else {
            System.out.println("Invalid Choice. Game Over!");
        }
        scanner.close();
    }
}
