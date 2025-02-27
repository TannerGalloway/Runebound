import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(String location, ArrayList<Room> roomList, String[] rooms, int currentRoomID, Player player) {
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        String selection = "explore";
        String previousSelection = "explore";
        while (!gameOver) {
            if (player.getHealth() < 1) {
                gameOver = true;
                System.out.println("You've been defeated. Game Over!");
            }
            selection = selection.toLowerCase();
            switch (selection) {
                case "look":
                    Enemy[] enemies = Actions.look(roomList.get(currentRoomID));
                    System.out.printf("%nYou spot some enemies");
                    for (Enemy enemy : enemies) {
                        System.out.printf("%n%s: Health: %s", enemy.getName(), enemy.getHealth());
                    }
                    previousSelection = selection;
                    System.out.printf("%n");
                    System.out.println();
                    System.out.println("Attack");
                    System.out.println("Flee");
                    System.out.println("Inv (Check Inventory)");
                    System.out.println("Enter your choice:");
                    selection = scanner.next();
                    break;

                case "inv":
                    ArrayList<Item> inventory = Actions.inventory(player);
                    System.out.printf("%nInventory:%n");
                    for (Item item : inventory) {
                        System.out.printf("%s: Attack: %s, Defence: %s Type: %s%n", item.getName(), item.getAttack(), item.getDefense(), item.getType());
                    }
                    if (inventory.isEmpty()) {
                        System.out.println("No Items Found");
                    }

                    System.out.println("Exit");
                    System.out.println("Enter your choice:");
                    selection = scanner.next();
                    if (selection.equalsIgnoreCase("exit")) {
                        selection = previousSelection;
                    }
                    break;

                case "locate":
                    String locationDescription = Actions.locate(roomList.get(currentRoomID));
                    System.out.println();
                    System.out.println("Location:");
                    System.out.println(rooms[currentRoomID]);
                    System.out.println(roomList.get(currentRoomID).getVariation());
                    System.out.println(locationDescription);
                    selection = "explore";
                    break;

                case "explore":
                    System.out.println();
                    System.out.printf("You find yourself in the %s%n", location);
                    System.out.println("Look (Look Around)");
                    System.out.println("Locate (Get Location Details)");
                    System.out.println("Inv (Check Inventory)");
                    System.out.println("Enter your choice:");
                    previousSelection = "explore";
                    selection = scanner.next();

                    break;

                case "flee":
                    System.out.println();
                    System.out.println("You have fled, preparing to return for the fight.");
                    selection = "explore";
                    break;

                default:
                    System.out.printf("%nInvalid Choice. Try Again!%n");
                    selection = "explore";
                    break;
            }
        }
            scanner.close();
    }
}
