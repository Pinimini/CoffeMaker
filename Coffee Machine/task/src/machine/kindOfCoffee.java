package machine;

public enum kindOfCoffee {
    ESPRESSO("1",250,0,16, 4),
    LATTE("2", 350, 75,20,7),
    CAPPUCCINO("3", 200, 100, 12, 6);
    int water;
    int milk;
    int coffee;
    String order;
    int money;
    kindOfCoffee(String order, int water, int milk, int coffee, int money) {
        this.order = order;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.money = money;
    }
}
