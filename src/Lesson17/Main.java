package Lesson17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientsQueue = new LinkedList<>();

        for (String firstClient : firstClients) {
            clientsQueue.offer(firstClient);
        }
        while (!clientsQueue.isEmpty()) {
            if (Math.random() < 0.5) {
                clientsQueue.offer("a friend of " + clientsQueue.peek());
            }
            System.out.println(clientsQueue.poll() + " сделал новый маникюр");
        }
    }
}
