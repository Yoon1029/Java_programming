package Homework;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int resultRecursive = gcdRecursive(num1, num2);
        int resultIterative = gcdIterative(num1, num2);

        System.out.println("재귀 호출로 구한 최대공약수: " + resultRecursive);
        System.out.println("반복문으로 구한 최대공약수: " + resultIterative);
    }

    // 재귀 호출을 이용한 최대공약수 계산
    private static int gcdRecursive(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcdRecursive(n, m % n);
        }
    }

    // 반복문을 이용한 최대공약수 계산
    private static int gcdIterative(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}
