package Lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> cities = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        Address home = new Address("Russia", "Moscow");
        Address julia = new Address("Russia", "Piter");
        Address olya = new Address("Ukraine", "Kiev");

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
            Address newAdress = new Address(verifyCountry, verifyCity);
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

class Address {
    protected String country;
    protected String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Address o = (Address) obj;
        return country.equals(o.country) && city.equals(o.city);
    }
}