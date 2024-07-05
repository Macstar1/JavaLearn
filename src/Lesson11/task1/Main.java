package Lesson11.task1;

public class Main {

    public static void main(String[] args) {
        Account PiterSimple = new SimpleAccount(5_100L);
        Account MariSimple = new SimpleAccount(2_000L);
        Account PiterCredit = new CreditAccount(-5_000L);
        Account MariCredit = new CreditAccount(-12_000L);

        System.out.println(PiterSimple.add(2_000L));
        System.out.println(PiterSimple.transfer(MariSimple, 5_000L));

        System.out.println(PiterSimple.getBalance());
        System.out.println(MariSimple.getBalance());

        System.out.println(MariCredit.transfer(PiterSimple, 1_000L));
        System.out.println(MariCredit.add(200L));
        System.out.println(MariCredit.pay(500L));

        System.out.println(PiterCredit.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println(PiterSimple.getBalance());
    }
}
