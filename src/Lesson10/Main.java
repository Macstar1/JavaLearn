package Lesson10;

import Lesson10.taxes.TaxDebit;
import Lesson10.taxes.TaxDebitMinusCredit;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company(new TaxDebitMinusCredit(), "WorldTravelWithLowCost");
        System.out.println("Проверка метода payTaxes Debit:");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-1000);
        myCompany.shiftMoney(-100);
        System.out.println(myCompany.getDebit());
        System.out.println(myCompany.getCredit());

        myCompany.setTaxSystem(new TaxDebit());
        myCompany.payTaxes();
        System.out.println();

        myCompany = new Company(new TaxDebit(), "WorldTravelWithLowCost");
        System.out.println("Проверка метода payTaxes Debit-Credit:");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-1000);
        myCompany.shiftMoney(-100);
        System.out.println(myCompany.getDebit());
        System.out.println(myCompany.getCredit());

        myCompany.setTaxSystem(new TaxDebitMinusCredit());
        myCompany.payTaxes();
        System.out.println();

        System.out.println("Проверка метода payTaxes Credit>Debit:");
        myCompany = new Company(new TaxDebit(), "WorldTravelWithLowCost");
        myCompany.shiftMoney(1100);
        myCompany.shiftMoney(200);
        myCompany.shiftMoney(-300);
        myCompany.shiftMoney(-1300);
        System.out.println(myCompany.getDebit());
        System.out.println(myCompany.getCredit());

        myCompany.setTaxSystem(new TaxDebitMinusCredit());
        myCompany.payTaxes();

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
        myCompany.setTaxSystem(new TaxDebit());
        System.out.println(myCompany.applyDeals(deals1));

        System.out.println();
        Deal[] deals2 = {
                new Sale("Сепульки", 2000),
                new Expenditure("Муркви", 1000),
                new Sale("Сепульки", 1000),
                new Expenditure("Муркви", 2500),
        };
        for (Deal deal : deals2) {
            System.out.println(deal.comment);
        }
        myCompany.setTaxSystem(new TaxDebitMinusCredit());
        System.out.println(myCompany.applyDeals(deals2));

    }
}

