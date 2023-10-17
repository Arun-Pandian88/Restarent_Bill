import java.util.HashMap;
import java.util.Scanner;

public class FoodOrder {

    // Define the menu items and their prices
    private static final HashMap<String, Integer> menu = new HashMap<>();
    static {
        menu.put("ChickenBriyani", 130);
        menu.put("MuttonBriyani", 150);
        menu.put("BeefBriyani", 160);
        menu.put("GrillChicken", 250);
        menu.put("ChickenSixtyfy", 100);
        menu.put("Pepsi", 35);
        menu.put("Cock", 35);
    }

    private HashMap<String, Integer> orderDetails = new HashMap<>();
    private double total = 0;

    public void displayMenu() {
        System.out.println("----------Food Menu-----------");
        System.out.println("======================================");
        System.out.println("    Food               price");
        System.out.println("======================================");
        for (String item : menu.keySet()) {
            System.out.println("    " + item + "     Rs" + menu.get(item) + ".00");
        }
        System.out.println("======================================");
    }

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        char orderAgain;

        do {
            System.out.println("Enter the item number you want to order: ");
            int itemNumber = scanner.nextInt();
            if (itemNumber >= 1 && itemNumber <= menu.size()) {
                String item = (String) menu.keySet().toArray()[itemNumber - 1];
                System.out.println("Enter the quantity: ");
                int quantity = scanner.nextInt();
                if (orderDetails.containsKey(item)) {
                    orderDetails.put(item, orderDetails.get(item) + quantity);
                } else {
                    orderDetails.put(item, quantity);
                }
                total += menu.get(item) * quantity;
            } else {
                System.out.println("Invalid item number. Please try again.");
            }

            System.out.println("Do you want to order again? (Y/N): ");
            orderAgain = scanner.next().charAt(0);
        } while (orderAgain == 'Y' || orderAgain == 'y');
    }

    public void printBill() {
        System.out.println("---------- Your Bill -----------");
        for (String item : orderDetails.keySet()) {
            int quantity = orderDetails.get(item);
            int price = menu.get(item);
            System.out.println(item + " x" + quantity + " = Rs" + (price * quantity) + ".00");
        }
        System.out.println("Total: Rs" + total + ".00");
        System.out.println("Enter Payment: ");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        if (payment >= total) {
            System.out.println("Payment successful! Thank you.");
        } else {
            System.out.println("Payment is not sufficient. Please pay the remaining amount.");
        }
    }

    public static void main(String[] args) {
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.displayMenu();
        foodOrder.takeOrder();
        foodOrder.printBill();
    }
}
