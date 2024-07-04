package Lesson11.task1;

public class Main {

    public static void main(String[] args) {
        Account PiterSimple = new SimpleAccount(70_000L);
        Account MariSimple = new SimpleAccount(80_000L);
        PiterSimple.add(2000L);
        PiterSimple.transfer(MariSimple,5000L);

        System.out.println(PiterSimple.getBalance());
        System.out.println(MariSimple.getBalance());
    }
}
