package Lesson10;

import Lesson10.taxes.TaxDebit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company myCompany = new Company(1, "WorldTravelWithLowCost");
        myCompany.shiftMoney(1200);
        myCompany.shiftMoney(-300);
        System.out.println(myCompany.debit);
        System.out.println(myCompany.credit);
        myCompany.setTaxSystem(2);
      //  myCompany.payTaxes();
    }
}

