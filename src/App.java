import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine(400, 540, 120, 9, 550);

        while (true) {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):");
            String action = scanner.next();

            if (action.equals("exit")) {
                break;
            }

            System.out.println();
            switch (action) {
                case "buy" -> {
                    if (machine.needsCleaning()) {
                        System.out.println("I need cleaning!");
                        continue;
                    }
                    System.out.println(
                            "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.next();
                    if (choice.equals("back")) {
                        continue;
                    }
                    Coffee coffee = switch (choice) {
                        case "1" -> new Coffee(250, 0, 16, 4);
                        case "2" -> new Coffee(350, 75, 20, 7);
                        case "3" -> new Coffee(200, 100, 12, 6);
                        default -> null;
                    };
                    if (coffee != null) {
                        machine.buy(coffee);
                    } else {
                        System.out.println("Unknown coffee type. Please try again.");
                    }
                }
                case "fill" -> {
                    System.out.println("Write how many ml of water you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int beans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int cups = scanner.nextInt();
                    machine.fill(water, milk, beans, cups);
                }
                case "take" -> machine.take();
                case "remaining" -> machine.printState();
                case "clean" -> machine.clean();
                default -> System.out.println("Unknown action. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
