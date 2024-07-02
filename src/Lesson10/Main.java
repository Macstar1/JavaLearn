package Lesson10;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company(1, "WorldTravelWithLowCost");
        System.out.println("Проверка метода payTaxes Debit:");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-1000);
        myCompany.shiftMoney(-100);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);

        myCompany.setTaxSystem(1);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);
        System.out.println();

        myCompany = new Company(1, "WorldTravelWithLowCost");
        System.out.println("Проверка метода payTaxes Debit-Credit:");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-1000);
        myCompany.shiftMoney(-100);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);

        myCompany.setTaxSystem(2);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);
        System.out.println();

        System.out.println("Проверка метода payTaxes Credit>Debit:");
        myCompany = new Company(1, "WorldTravelWithLowCost");
        System.out.println();
        myCompany.shiftMoney(1100);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-300);
        myCompany.shiftMoney(-1300);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);

        myCompany.setTaxSystem(2);
        myCompany.payTaxes(myCompany.debit, myCompany.credit);

        System.out.println();
        Deal[] deals1 = {
                new Sale("Сепульки", 2000),
                new Expenditure("Муркви", 1000),
                new Sale("Сепульки", 1000),
                new Expenditure("Муркви", 1500),
        };
        for (Deal deal : deals1) {
            System.out.println(deal.comment);
        }
        myCompany.setTaxSystem(1);
        System.out.println(myCompany.applyDeals(deals1));

        System.out.println();
        Deal[] deals2 = {
                new Sale("Сепульки", 2000),
                new Expenditure("Муркви", 3000),
                new Sale("Сепульки", 1000),
                new Expenditure("Муркви", 1500),
        };
        for (Deal deal : deals2) {
            System.out.println(deal.comment);
        }
        myCompany.setTaxSystem(2);
        System.out.println(myCompany.applyDeals(deals2));

    }
}

