package Lesson10;

public class Expenditure extends Deal {
    String name;
    int price;

    public Expenditure(String comment, int creditChange, int debitChange, String name, int price) {
        super(comment, creditChange, debitChange);
        this.name = name;
        this.price = price;
    }

    String comment = "Покупка " + name + " на " + price + " руб.";
}
