package Lesson10;

import Lesson10.taxes.TaxDebit;
import Lesson10.taxes.TaxDebitMinusCredit;
import Lesson10.taxes.TaxSystem;

public class Company {
    private TaxSystem taxSystem;
    private String title;
    private int debit = 0;
    private int credit = 0;

    public Company(TaxSystem taxSystem, String title) {
        this.taxSystem = taxSystem;
        this.title = title;
    }

    public int applyDeals(Deal[] deals){
        debit = 0;
        credit = 0;
        for (Deal deal : deals) {
            credit += deal.creditChange;
            debit += deal.debitChange;
        }
        payTaxes();
        return debit - credit;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        int output = 0;
        if (getTaxSystem() == 1) {
            TaxSystem tax = new TaxDebit();
            output = tax.calcTaxFor(debit);
        } else if (getTaxSystem() == 2) {
            TaxSystem tax = new TaxDebitMinusCredit();
            output = tax.calcTaxFor(debit, credit);
        }
        System.out.printf("Компания %s уплатила налог в размере: %d руб. \n", title, output);
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        if (taxSystem == 1 || taxSystem == 2) {
            this.taxSystem = taxSystem;
        }
    }

    public TaxSystem getTaxSystem() {
        return taxSystem;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }


}
