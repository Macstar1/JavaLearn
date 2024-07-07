package Lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String verifyInput;
        Scanner scanner = new Scanner(System.in);
        PasswordChecker pass = new PasswordChecker();


        System.out.println("Введите мин. длину пароля: ");
        pass.setMinLength(Integer.parseInt(scanner.nextLine()));

        System.out.println("Введите макс. допустимое количество повторений символа");
        pass.setMaxRepeats(Integer.parseInt(scanner.nextLine()));

        while (true) {
            System.out.println("Введите пароль или end: ");
            verifyInput = scanner.nextLine();
            if ("end".equals(verifyInput)) {
                System.out.println("Программа завершена");
                break;
            }

            pass.verify(verifyInput);
        }

    }

}
