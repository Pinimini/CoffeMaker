package machine;

import java.util.Scanner;

public class CoffeeMaker {
    static Scanner sc = new Scanner(System.in);
    int money = 550;
    int water = 400;
    int milk = 540;
    int coffee = 120;
    int cups = 9;


    public void action() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String order = sc.next();
            if (order.equals(currentState.BUY.name().toLowerCase())) {
                actionBuy();
            } else if (order.equals(currentState.FILL.name().toLowerCase())) {
                actionFill();
            } else if (order.equals(currentState.TAKE.name().toLowerCase())) {
                actionTake();
            } else if (order.equals(currentState.REMAINING.name().toLowerCase())) {
                actionRemainig();
            } else if (order.equals("exit")) {
                break;
            }
        }
    }

    public void actionBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String orderBuy = sc.next();
        switch (orderBuy) {
            case "1":
                if (water < kindOfCoffee.ESPRESSO.water) {
                    System.out.println("Sorry, not enough water!");
                }
                if (coffee < kindOfCoffee.ESPRESSO.coffee) {
                    System.out.println("Sorry, not enough coffee!");
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                if (water >= kindOfCoffee.ESPRESSO.water && coffee >= kindOfCoffee.ESPRESSO.coffee && cups >= 1) {
                    water -= kindOfCoffee.ESPRESSO.water;
                    coffee -= kindOfCoffee.ESPRESSO.coffee;
                    money += kindOfCoffee.ESPRESSO.money;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (water < kindOfCoffee.LATTE.water) {
                    System.out.println("Sorry, not enough water!");
                }
                if (coffee < kindOfCoffee.LATTE.coffee) {
                    System.out.println("Sorry, not enough coffee!");
                }
                if (milk < kindOfCoffee.LATTE.milk) {
                    System.out.println("Sorry, not enough coffee!");
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                if (water >= kindOfCoffee.LATTE.water && coffee >= kindOfCoffee.LATTE.coffee && cups >= 1 && milk >= 75) {
                    water -= kindOfCoffee.LATTE.water;
                    milk -= kindOfCoffee.LATTE.milk;
                    coffee -= kindOfCoffee.LATTE.coffee;
                    money += kindOfCoffee.LATTE.money;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (water < kindOfCoffee.CAPPUCCINO.water) {
                    System.out.println("Sorry, not enough water!");
                }
                if (coffee < kindOfCoffee.CAPPUCCINO.coffee) {
                    System.out.println("Sorry, not enough coffee!");
                }
                if (milk < kindOfCoffee.CAPPUCCINO.milk) {
                    System.out.println("Sorry, not enough coffee!");
                }
                if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                if (water >= kindOfCoffee.CAPPUCCINO.water && coffee >= kindOfCoffee.CAPPUCCINO.coffee && cups >= 1 && milk >= kindOfCoffee.CAPPUCCINO.milk) {
                    water -= kindOfCoffee.CAPPUCCINO.water;
                    milk -= kindOfCoffee.CAPPUCCINO.milk;
                    coffee -= kindOfCoffee.CAPPUCCINO.coffee;
                    money += kindOfCoffee.CAPPUCCINO.money;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                break;
        }
        System.out.print("\n");
    }

    public void actionFill() {
        System.out.println("\nWrite how many ml of water do you want to add: ");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffee += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += sc.nextInt();
    }

    public void actionRemainig() {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "$%d of money\n" +
                "\n", water, milk, coffee, cups, money);
    }

    public void actionTake() {
        System.out.printf("\nI gave you $%d\n", money);
        money = 0;
        System.out.print("\n");
    }
}

