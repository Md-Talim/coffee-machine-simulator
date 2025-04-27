class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;
    private int coffeeCount;
    private static final int CLEANING_THRESHOLD = 10;

    CoffeeMachine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
        this.coffeeCount = 0;
    }

    public boolean needsCleaning() {
        return coffeeCount >= CLEANING_THRESHOLD;
    }

    public void buy(Coffee coffee) {
        if (water >= coffee.waterNeeded && milk >= coffee.milkNeeded && beans >= coffee.beansNeeded && cups > 0) {
            water -= coffee.waterNeeded;
            milk -= coffee.milkNeeded;
            beans -= coffee.beansNeeded;
            cups--;
            money += coffee.cost;
            coffeeCount++;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (water < coffee.waterNeeded) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk < coffee.milkNeeded) {
                System.out.println("Sorry, not enough milk!");
            }
            if (beans < coffee.beansNeeded) {
                System.out.println("Sorry, not enough coffee beans!");
            }
            if (cups <= 0) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void clean() {
        coffeeCount = 0;
        System.out.println("I have been cleaned!");
    }
}
