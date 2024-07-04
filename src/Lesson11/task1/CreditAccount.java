package Lesson11.task1;

public class CreditAccount extends Account {
    private long accountSize;
    private final long accountLimit;

    public CreditAccount(long accountSize) {
        this.accountSize = accountSize;
        this.accountLimit = -50_000L;
    }

    @Override
    boolean add(long amount) {
        if (accountSize + amount <= 0) {
            accountSize += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    boolean pay(long amount) {
        if (accountSize - amount > accountLimit) {
            accountSize -= amount;
            return true;
        }else {
            return false;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        if (account.add(amount) && pay(amount)) {
            account.add(amount);
            pay(amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    long getBalance(){
        return accountSize;
    };
}
