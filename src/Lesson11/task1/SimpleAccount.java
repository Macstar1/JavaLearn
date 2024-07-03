package Lesson11.task1;

public class SimpleAccount extends Account {
    private long account;

    public SimpleAccount(long account) {
        this.account = account;
    }

    @Override
    boolean add(long amount) {
        account += amount;
        return true;
    }

    @Override
    boolean pay(long amount) {
        if (amount < account) {
            account -= amount;
            return true;
        }else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        return false;
    }

    @Override
    long getBalance() {
        return account;
    }
}
