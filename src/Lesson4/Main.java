package Lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        String moneyStr;
        int money;
        int tax1;
        int tax2;

        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;
                case 3:
                    tax1 = taxEarningsMinusSpendings(earnings, spendings);
                    tax2 = taxEarnings(earnings);
                    if (tax1 > tax2) {
                        printResult(tax2, tax1, "УСН доходы");
                    } else if (tax1 < tax2) {
                        printResult(tax1, tax2, "УСН доходы минус расходы");
                    } else {
                        System.out.println("Можете выбрать любую систему налогообложения");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
            System.out.println();
        }
        System.out.println("Программа завершена!");
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }

    public static void printResult(int tax, int otherTax, String taxMethod) {
        System.out.println();
        System.out.println("Мы советуем вам " + taxMethod);
        System.out.println("Ваш налог составит: " + tax + "рублей");
        System.out.println("Налог на другой системе: " + otherTax + " рублей");
        System.out.println("Экономия: " + (otherTax - tax) + " рублей");
    }
}

