import java.util.Scanner;

public class App {
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            System.out.println();

            if (action.equals("exit")) {
                break;
            }

            switch (action) {
                case "buy" -> buy(scanner);
                case "fill" -> fill(scanner);
                case "take" -> take();
                case "remaining" -> printState();
                default -> System.out.println("Unknown action. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    private static void buy(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();

        if (choice.equals("back")) {
            return;
        }

        int waterNeeded = 0, milkNeeded = 0, beansNeeded = 0, cost = 0;

        switch (choice) {
            // espresso
            case "1" -> {
                waterNeeded = 250;
                beansNeeded = 16;
                cost = 4;
            }
            // latte
            case "2" -> {
                waterNeeded = 350;
                milkNeeded = 75;
                beansNeeded = 20;
                cost = 7;
            }
            // cappuccino
            case "3" -> {
                waterNeeded = 200;
                milkNeeded = 100;
                beansNeeded = 12;
                cost = 6;
            }
            default -> {
                System.out.println("Unknown coffee type. Please try again.");
                return;
            }
        }

        if (water >= waterNeeded && milk >= milkNeeded && beans >= beansNeeded && cups > 0) {
            water -= waterNeeded;
            milk -= milkNeeded;
            beans -= beansNeeded;
            cups--;
            money += cost;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (water < waterNeeded) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk < milkNeeded) {
                System.out.println("Sorry, not enough milk!");
            }
            if (beans < beansNeeded) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            if (cups <= 0) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    private static void fill(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        cups += scanner.nextInt();
    }

    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
