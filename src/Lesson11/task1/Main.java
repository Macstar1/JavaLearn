package Lesson11.task1;

public class Main {

    public static void main(String[] args) {
        Account PiterSimple = new SimpleAccount(5_000L);
        Account MariSimple = new SimpleAccount(10_000L);
        Account PiterCredit = new CreditAccount(-15_000L);
        Account MariCredit = new CreditAccount(-15_000L);

        System.out.println(PiterSimple.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println(PiterSimple.transfer(MariCredit, 5_000L));
        System.out.println(PiterSimple.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println();

        System.out.println(PiterSimple.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println(MariCredit.transfer(PiterSimple, 15_000L));
        System.out.println(PiterSimple.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println();

        System.out.println(PiterCredit.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println(MariCredit.transfer(PiterCredit,10_000L));
        System.out.println(PiterCredit.getBalance());
        System.out.println(MariCredit.getBalance());
        System.out.println();

        System.out.println(MariCredit.getBalance());
        System.out.println(MariCredit.add(200L));
        System.out.println(MariCredit.pay(500L));
        System.out.println(MariCredit.getBalance());
        System.out.println();

        System.out.println(MariSimple.getBalance());
        System.out.println(MariSimple.add(2000L));
        System.out.println(MariSimple.pay(5000L));
        System.out.println(MariSimple.getBalance());
    }
}
