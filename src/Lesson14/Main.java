package Lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("""

                    Выберите операцию:

                    0. Выход из программы
                    1. Добавить дело
                    2. Показать дела
                    3. Удалить дело по номеру
                    4. Удалить дело по названию
                    5. Удалить дело по контексту
                    Ваш выбор:\s""");

            int input = Integer.parseInt(scaner.nextLine());
            if (input == 0) {
                System.out.println("Программа завершена!");
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
                    int number = Integer.parseInt(scaner.nextLine());
                    if (number > tasks.size() || number < 0) {
                        System.out.println("Такой задачи не существует.");
                        break;
                    } else {
                        tasks.remove(number);
                        System.out.println("Удалено!");
                        break;
                    }

                case 4:
                    System.out.println("Ведите задачу для удаления: ");
                    String taskName = scaner.nextLine();
                    if (tasks.contains(taskName)) {
                        tasks.remove(taskName);
                        System.out.println("Удалено!");
                        break;
                    }else {
                        System.out.println("Такой задачи не существует.");
                        break;
                    }

                case 5:
                    System.out.println("Введите контекст для удаления: ");
                    String keyword = scaner.nextLine();
                    boolean isDelete = false;
                    for (int i = 0; i < tasks.size(); i++) {
                        if (tasks.get(i).contains(keyword)) {
                            tasks.remove(i);
                            i--;
                            isDelete = true;
                        }
                    }
                    if (isDelete) {
                        System.out.println("Удалено!");

                    }else {
                        System.out.println("Задачи не найдены.");
                    }
                    break;
                default:
                    System.out.println("Ввели неправильное значение!");
                    break;
            }
        }
    }
}