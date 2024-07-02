package Lesson10;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company(1, "WorldTravelWithLowCost");

        System.out.println("Проверка метода payTaxes:");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-300);
        myCompany.shiftMoney(-100);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);

        myCompany.setTaxSystem(1);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);

        myCompany.setTaxSystem(2);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);

        System.out.println("Проверка метода payTaxes при :");
        System.out.println();
        myCompany.setTaxSystem(1);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-300);
        myCompany.shiftMoney(-1300);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);

        myCompany.setTaxSystem(1);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);

        myCompany.setTaxSystem(2);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);

        Deal[] deals = {
                new Sale("Сепульки", 2000),
                new Expenditure("Муркви", 1000),
                new Sale("Сепульки", 1000),
                new Expenditure("Муркви", 500),
        };

        System.out.println();
        myCompany.setTaxSystem(1);
        System.out.println(myCompany.applyDeals(deals));

        myCompany.setTaxSystem(2);
        System.out.println(myCompany.applyDeals(deals));

    }
}

