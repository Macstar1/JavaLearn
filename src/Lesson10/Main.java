package Lesson10;

import Lesson10.taxes.TaxDebit;
import Lesson10.taxes.TaxDebitMinusCredit;
import Lesson10.taxes.TaxSystem;

import java.util.Scanner;

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


        Sale deal = new Sale("Продаём сепульки", 0, 0, "Сепульки", 2000);
        deal.printComment();
//
//        Deal[] deals = {
//                new Sale("Продаём сепульки", 0, 2000, "Сепульки", 2000),
//                new Sale("Продаём сепульки", 0, 2000, "Сепульки", 2000),
//                new Expenditure("Покупаем сепульки", 2000, 0, "Сепульки", 2000)
//        };

    }
}

