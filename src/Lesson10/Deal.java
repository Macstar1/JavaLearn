package Lesson10;

public class Deal {
    private final String comment;
    private final int creditChange;
    private final int debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public int getCreditChange() {
        return creditChange;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public String getComment() {
        return comment;
    }
}
