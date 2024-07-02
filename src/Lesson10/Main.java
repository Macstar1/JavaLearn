package Lesson10;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company(1, "WorldTravelWithLowCost");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(-300);
        myCompany.shiftMoney(-300);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);

        myCompany.setTaxSystem(1);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);

        myCompany.setTaxSystem(2);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);


//        Deal deal = new Sale("Продаём сепульки", "Сепульки", 2000);
//        deal.printComment();

        Deal[] deals = {
                new Sale("Сепульки", 2000),
                new Expenditure("Муркви", 1000),
                new Sale("Сепульки", 1000),
                new Expenditure("Муркви", 500),

        };

        //deals[0].printComment();
        //deals[1].printComment();
        System.out.println();
        myCompany.setTaxSystem(1);
        System.out.println(myCompany.applyDeals(deals));

        myCompany.setTaxSystem(2);
        System.out.println(myCompany.applyDeals(deals));

    }
}

