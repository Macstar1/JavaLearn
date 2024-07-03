package Lesson10;

import Lesson10.taxes.TaxSystem;

public class Company {
    private TaxSystem taxSystem;
    private final String title;
    private int debit = 0;
    private int credit = 0;

    public Company(TaxSystem taxSystem, String title) {
        this.taxSystem = taxSystem;
        this.title = title;
    }

    public int applyDeals(Deal[] deals) {
        debit = 0;
        credit = 0;
        for (Deal deal : deals) {
            credit += deal.getCreditChange();
            debit += deal.getDebitChange();
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
        int output = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб. \n", title, output);
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }
}
