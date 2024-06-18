package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        matrixPrint(colors);
        System.out.println("\n" +
                "Введите угол поворота:\n" +
                "1 - 90 градусов\n" +
                "2 - 180 градусов\n" +
                "3 - 270 градусов");
        int choise = scanner.nextInt();
        rotate(colors, rotatedColors, choise);
    }

    public static void matrixPrint(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] original, int[][] rotated, int choise) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (choise) {
                    case 1:
                        rotated[i][j] = original[SIZE - j - 1][i];
                        break;
                    case 2:
                        rotated[i][j] = original[SIZE - i - 1][SIZE - j - 1];
                        break;
                    case 3:
                        rotated[i][j] = original[j][SIZE - 1 - i];
                        break;
                    default:
                        System.out.println("Нет такой операции.");
                }
                System.out.format("%4d", rotated[i][j]);
            }
            System.out.println();
        }
    }
}
