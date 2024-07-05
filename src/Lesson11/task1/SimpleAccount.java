package Lesson11.task1;

public class SimpleAccount extends Account {
    private long accountSize;

    public SimpleAccount(long accountSize) {
        this.accountSize = accountSize;
    }

    @Override
    boolean add(long amount) {
        accountSize += amount;
        return true;
    }

    @Override
    boolean pay(long amount) {
        if (amount <= accountSize) {
            accountSize -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        if (amount < accountSize) {
            pay(amount);
            account.add(amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    long getBalance() { return accountSize; }
}
