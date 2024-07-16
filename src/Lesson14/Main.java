package Lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {

            System.out.println("\n" +
                    "Выберите операцию:\n" +
                    "\n" +
                    "0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию\n" +
                    "Ваш выбор: ");
            int input = Integer.parseInt(scaner.nextLine());
            if (input == 0) {
                break;
            }
            switch (input) {
                case 1:
                    System.out.println("Введите название задачи: ");
                    tasks.add(scaner.nextLine());
                    System.out.println("Добавлено!");
                    break;
                case 2:
                    System.out.println("Ваш список дел: " + tasks);
                    break;
                case 3:
                    System.out.println("Введите номер для удаления: ");
                    tasks.remove(Integer.parseInt(scaner.nextLine()));
                    System.out.println("Удалено!");
                    break;
                case 4:
                    System.out.println("Ведите задачу для удаления: ");
                    tasks.remove(scaner.nextLine());
                    System.out.println("Удалено!");
                    break;
            }
            System.out.println();
        }
    }
}
