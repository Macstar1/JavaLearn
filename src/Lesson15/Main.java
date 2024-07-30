package Lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Adress, Integer> costPerAddress = new HashMap<>();
        Set<String> cities = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        Adress home = new Adress("Russia", "Moscow");
        Adress julia = new Adress("Russia", "Piter");
        Adress olya = new Adress("Ukraine", "Kiev");

        costPerAddress.put(home, 100);
        costPerAddress.put(julia, 500);
        costPerAddress.put(olya, 1500);

        int countryNumbers;
        int deliveryCost;
        int allDeliverySost = 0;

        while (true) {

            System.out.println("Заполнение нового заказа.\n" +
                    "Введите страну: ");
            String verifyCountry = scanner.nextLine();
            if ("end".equals(verifyCountry)) {
                System.out.println("Программа завершена");
                break;
            }
            System.out.println("Введите город: ");
            String verifyCity = scanner.nextLine();

            System.out.println("Введите вес (кг): ");
            Integer weight = Integer.parseInt(scanner.nextLine());
            Adress newAdress = new Adress(verifyCountry, verifyCity);
            if (costPerAddress.containsKey(newAdress)) {
                cities.add(newAdress.country);
                countryNumbers = cities.size();
                deliveryCost = costPerAddress.get(newAdress) * weight;
                allDeliverySost += deliveryCost;
                System.out.println("Стоимость доставки составит: " + deliveryCost + " руб.");
                System.out.println("Общая стоимость всех доставок: " + allDeliverySost + " руб.");
                System.out.println("Количество стран, в которые осуществлены доставки: " + countryNumbers + ".");

            } else {
                System.out.println("Данный адрес не обслуживается.");
            }
            System.out.println();
        }
    }
}

