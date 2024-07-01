package Lesson10;

public class Sale extends Deal {
    String name;
    int price;

    public Sale(String comment, int creditChange, int debitChange, String name, int price) {
        super(comment, creditChange, debitChange);
        this.name = name;
        this.creditChange = 0;
        this.debitChange = price;
    }


    String comment = "Продажа " + name + " на " + price + " руб." + creditChange + "  " + debitChange;

    public void printComment() {
        System.out.println(comment);
    }

}
