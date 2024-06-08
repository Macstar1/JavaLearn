package Lesson3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean condition = true;
        int days = 0;

        do {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней: ");
            int userNumberOfDays = scanner.nextInt();

            if (userNumberOfDays == daysAYear(year)) {
                counter++;
                days = daysAYear(year);
            } else condition = false;
        }
        while (condition);

        System.out.println("Неправильно! В этом году " + days + " дней!");
        System.out.println("Набрано очков:  " + counter);
    }

    public static int daysAYear(int year) {
        int numberOfDays;

        if (year % 400 == 0) numberOfDays = 366;
        else if (year % 100 == 0) numberOfDays = 365;
        else if (year % 4 == 0) numberOfDays = 366;
        else numberOfDays = 365;

        return numberOfDays;
    }
}
