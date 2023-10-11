package Homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.print("수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minValue = numbers[0];
        int maxValue = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }

            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        System.out.println("최소값: " + minValue);
        System.out.println("최대값: " + maxValue);

    }
}