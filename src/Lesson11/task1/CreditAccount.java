package Lesson11.task1;

public class CreditAccount extends Account{
    @Override
    boolean add(long amount) {
        return false;
    }

    @Override
    boolean pay(long amount) {
        return false;
    }

    @Override
    boolean transfer(Account account, long amount) {
        return false;
    }

    @Override
    long getBalance() {
        return 0;
    }
}
