package Lesson10;

public class Expenditure extends Deal {
    String name;
    int price;

    public Expenditure(String name, int price) {
        super("Покупка " + name + " на " + price + " руб.", price, 0);
        this.name = name;
        this.price = price;

    }

    @Override
    public void printComment() {
        String commentSale = comment;
        System.out.println(commentSale);
    }

}
