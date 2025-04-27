import java.util.Scanner;

public class App {
    private final static int NEEDED_WATER = 200;
    private final static int NEEDED_MILK = 50;
    private final static int NEEDED_BEANS = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int availableWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int availableMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int availableBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int requiredBeans = NEEDED_BEANS * cups;
        int requiredMilk = NEEDED_MILK * cups;
        int requiredWater = NEEDED_WATER * cups;

        int maxCupsByBeans = availableBeans / NEEDED_BEANS;
        int maxCupsByMilk = availableMilk / NEEDED_MILK;
        int maxCupsByWater = availableWater / NEEDED_WATER;

        int maxCups = Math.min(maxCupsByBeans, Math.min(maxCupsByMilk, maxCupsByWater));

        if (requiredWater <= availableWater && requiredMilk <= availableMilk && requiredBeans <= availableBeans) {
            if (maxCups > cups) {
                System.out.print("Yes, I can make that amount of coffee ");
                System.out.printf("(and even %d more than that)\n", maxCups - cups);
            } else {
                System.out.println("Yes, I can make that amount of coffee\n");
            }
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee\n", maxCups);
        }

        scanner.close();
    }
}
