package scanner;

/*
문제 - 이름 나이 입력받고 출력하기
사용자로부터 입력받은 이름과 나이를 출력하세요. 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다." 이
어야 합니다.
 */

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.printf("당신의 이름은 %s이고, 나이는 %d살입니다.\n",name,age);
    }
}
