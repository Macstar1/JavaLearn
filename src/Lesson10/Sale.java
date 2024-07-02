package Lesson10;

public class Sale extends Deal {
    String name;
    int price;

    public Sale(String name, int price) {
        super("Продажа " + name + " на " + price + " руб.", 0, price);
        this.name = name;
        this.price = price;
    }
}
