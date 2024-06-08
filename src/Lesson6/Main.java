package Lesson6;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Douglas", "Adams", 5);
        Book book1 = new Book("The Hitchhiker’s Guide to the Galaxy",
                1982, author1, 100);
        System.out.println(book1.isBig());
        System.out.println(book1.matches("Galaxy"));
        System.out.println(book1.estimatePrice());
    }
}
