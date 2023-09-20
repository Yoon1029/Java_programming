import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();
            sum += num;
            System.out.println("현재까지 입력된 값은 " + sum + "입니다");
        }
        
    }
}

