package Lesson11.task1;

abstract class Account {

    abstract boolean add(long amount);

    abstract boolean pay(long amount);

    abstract boolean transfer(Account account, long amount);

    abstract long getBalance();
}
