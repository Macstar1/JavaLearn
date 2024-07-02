package Lesson10;

import Lesson10.taxes.TaxDebit;
import Lesson10.taxes.TaxDebitMinusCredit;
import Lesson10.taxes.TaxSystem;

public class Company {
    private int taxSystem = 1;
    String title;
    int debit = 0;
    int credit = 0;

    public Company(int taxSystem, String title) {
        this.taxSystem = taxSystem;
        this.title = title;
    }

    public int applyDeals(Deal[] deals){
        int dealQuantity = deals.length;
        debit = 0;
        credit = 0;
        for (int i = 0; i < dealQuantity; i++) {
            credit += deals[i].creditChange;
            debit += deals[i].debitChange;
        }
        payTaxes(debit,credit);

        return debit - credit;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes(int debit, int credit) {

        int output = 0;
        if (getTaxSystem() == 1) {
            TaxSystem tax = new TaxDebit();
            output = tax.calcTaxFor(debit);
        } else if (getTaxSystem() == 2) {
            TaxSystem tax = new TaxDebitMinusCredit();
            output = tax.calcTaxFor(debit, credit);
        }

        System.out.printf("Компания %s уплатила налог в размере: %d руб. \n", title, output);
        debit = 0;
        credit = 0;

    }

    public void setTaxSystem(int taxSystem) {
        if (taxSystem == 1 || taxSystem == 2) {
            this.taxSystem = taxSystem;
        }
    }

    public int getTaxSystem() {
        return taxSystem;
    }

}
