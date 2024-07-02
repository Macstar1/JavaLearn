package Lesson10.taxes;

public class TaxDebit extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max(debit * 6 / 100, 0);
    }

    @Override
    public int calcTaxFor(int debit) {
        return Math.max(debit * 6 / 100, 0);
    }


}
