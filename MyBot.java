import java.util.Scanner;

public class MyBot {
    public static void main(String[] args) {
        System.out.println("Wonderhoy! Welcome to my test!");
        System.out.println("Choose an item (candy, taiyaki, star): ");
        Scanner scanner = new Scanner(System.in);
        String itemType = scanner.nextLine();

        System.out.print("Choose the number of items you would like to receive (1, 2, 3): ");
        int inventory = scanner.nextInt();

        displayInventory(itemType, inventory);
    }

    public static void displayInventory(String itemType, int inventory) {
        String message = "";

        switch (itemType.toLowerCase()) {
            case "candy":
                message += "You've chosen the item: candy!";
                break;
            case "taiyaki":
                message += "You've chosen the item: taiyaki!";
                break;
            case "star":
                message += "You've chosen the item: star!";
            default:
                System.out.println("Invalid item choice.");
                return;
        }

        switch (inventory) {
            case 1:
                message += "+1 added to your inventory!";
            case 2:
                message += "+2 added to your inventory!";
            case 3:
                message += "+3 added to your inventory!";
                break;
            default:
                System.out.println("Invalid number of items added to your inventory.");
                return;
        }

        System.out.println(message);
    }
        }