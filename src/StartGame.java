import java.util.Objects;
import java.util.Scanner;

public class StartGame {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
//        generate room
        Player player = new Player();
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
