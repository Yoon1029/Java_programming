package Homework;

import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        // 미리 저장된 ID와 비밀번호 쌍
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("myId", "myPass");
        userMap.put("myId2", "myPass2");
        userMap.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = scanner.nextLine().trim(); // 입력된 공백 무시

            if (!userMap.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String inputPassword = scanner.nextLine().trim(); // 입력된 공백 무시

            // 저장된 비밀번호와 입력된 비밀번호 비교
            if (userMap.get(inputId).equals(inputPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break; // 로그인 성공 시 반복문 종료
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }

       
    }
}
