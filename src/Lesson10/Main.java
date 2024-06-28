package Lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Company company = new Company();

        System.out.print("Введите название компании: ");
        //company.title = scanner.nextLine();




        while (true) {
            System.out.println("Введите сумму или end для завершения: ");


            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }


        }
    }
}
