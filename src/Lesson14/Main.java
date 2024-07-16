package Lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {

            System.out.println("""

                    Выберите операцию:

                    0. Выход из программы
                    1. Добавить дело
                    2. Показать дела
                    3. Удалить дело по номеру
                    4. Удалить дело по названию
                    Ваш выбор:\s""");
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
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + 1 + ". " + tasks.get(i));
                    }
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
