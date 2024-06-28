package Lesson10.taxes;

public class TaxDebitMinusCredit extends TaxSystem{

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (Math.max((debit - credit) * 15 / 100, 0));
    }
}
