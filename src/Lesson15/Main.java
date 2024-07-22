package Lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Заполнение нового заказа.\n" +
                    "Введите страну: ");
            String verifyInput = scanner.nextLine();
            if ("end".equals(verifyInput)) {
                System.out.println("Программа завершена");
                break;
            }


        }

    }
}

class Address{
    protected String country;
    protected String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

}