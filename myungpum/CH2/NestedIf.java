import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100): ");
        int score = scanner.nextInt();

        System.out.print("학년을 입력하세요(1~4): ");
        int grade = scanner.nextInt();

        if (score >= 60)
            if (grade == 4)
                if (score >= 70)
                    System.out.println("합격입니다.");
                else 
                    System.out.println("불합격입니다.");
            else 
                System.out.println("합격입니다.");
        else 
            System.out.println("불합격입니다.");

        scanner.close();
    }
}
