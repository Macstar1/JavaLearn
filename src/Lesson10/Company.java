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


    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }


    public void payTaxes(TaxSystem tax, int debit, int credit) {
        // TODO change this variables

        int out = tax.calcTaxFor(debit, credit);

        System.out.printf("Компания %s уплатила налог в размере: %d руб.", title, out);
        debit = 0;
        credit = 0;

    }

    public void setTaxSystem(int taxSystem) {
        if (taxSystem == 1 || taxSystem == 2) {
            this.taxSystem = taxSystem;
        }
    }
    public int getTaxSystem(){
        return taxSystem;
    }
}
