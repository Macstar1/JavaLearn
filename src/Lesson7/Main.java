package Lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {50, 14, 80};
        int[] quantity = new int[3];
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n", i + 1, products[i], prices[i]);
        }

        int sumProducts = 0;

        while (true) {

            System.out.println("Выберите товар и количество или введите `end`");
            String inputString = scanner.nextLine();

            if (inputString.equals("end")) {
                break;
            }

            String[] splitInput = inputString.split(" ");
            int productNumber = Integer.parseInt(splitInput[0]);
            int productCount = Integer.parseInt(splitInput[1]);
            quantity[productNumber - 1] += productCount;
        }
        System.out.println("Ваша корзина: ");
        for (int i = 0; i < products.length; i++) {
            if (quantity[i] != 0) {
                System.out.printf("%s %d шт %d руб/шт %d руб в сумме\n",
                        products[i],
                        quantity[i],
                        prices[i],
                        quantity[i] * prices[i]);
                sumProducts += quantity[i] * prices[i];
            }
        }
        System.out.printf("Итого: %d руб", sumProducts);
    }
}
