import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {
        // ID와 비밀번호 쌍을 저장할 HashMap
        Map<String, String> credentials = new HashMap<>();

        // 파일로부터 ID와 비밀번호 읽어오기
        readCredentialsFromFile(credentials, "db.txt");

        // 로그인 시도
        login(credentials);
    }

    private static void readCredentialsFromFile(Map<String, String> credentials, String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // 각 줄에서 ID와 비밀번호 추출
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    String id = parts[0].trim();
                    String password = parts[1].trim();
                    credentials.put(id, password);
                }
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    private static void login(Map<String, String> credentials) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("ID를 입력하세요: ");
            String inputId = scanner.nextLine().trim();

            // 입력된 ID가 존재하지 않으면 다시 입력
            if (!credentials.containsKey(inputId)) {
                System.out.println("입력한 ID가 존재하지 않습니다. 다시 입력하세요.");
                continue;
            }

            System.out.print("비밀번호를 입력하세요: ");
            String inputPassword = scanner.nextLine().trim();

            // 입력된 비밀번호와 저장된 비밀번호 비교
            if (inputPassword.equals(credentials.get(inputId))) {
                System.out.println("로그인 성공!");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
