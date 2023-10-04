import java.util.Scanner;

class Student {
    private String studentID;
    private String name;
    private String major;
    private String phoneNumber;

    public Student(String studentID, String name, String major, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String studentID = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String phoneNumber = scanner.next();

            students[i] = new Student(studentID, name, major, phoneNumber);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다:");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번째 학생: " + students[i].getStudentID() + " " + students[i].getName() + " " + students[i].getMajor() + " " + formatPhoneNumber(students[i].getPhoneNumber()));
        }
    }

    private static String formatPhoneNumber(String phoneNumber) {
        return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 7) + "-" + phoneNumber.substring(7);
    }
}
