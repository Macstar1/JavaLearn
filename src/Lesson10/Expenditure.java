package Lesson10;

public class Expenditure extends Deal {

    public Expenditure(String name, int price) {
        super("Покупка " + name + " на " + price + " руб.", price, 0);
    }
}
