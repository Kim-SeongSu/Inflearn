package method;

/*
문제 - 은행 계좌 입출금
    다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
    또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
    출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
 */

import java.util.Scanner;

public class MethodEx4 {
    public static int deposit(int balance, int depositAmount){
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + (balance + depositAmount) + "원");
        return balance + depositAmount;
    }

    public static int withdraw(int balance, int withdrawAmount){
        if (balance >= withdrawAmount) {
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + (balance - withdrawAmount) + "원");
            return balance - withdrawAmount;
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true){
            System.out.println("---------------------------------\n1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n---------------------------------");
            int ipt = sc.nextInt();
            System.out.printf("선택: %d\n", ipt);

            if (ipt == 1){
                System.out.print("입금액을 입력하세요: ");
                int amount = sc.nextInt();
                balance = deposit(balance, amount);
            } else if (ipt == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = sc.nextInt();
                balance = withdraw(balance, amount);
            } else if (ipt == 3){
                System.out.printf("현재 잔액: %d원\n", balance);
            } else if (ipt == 4) {
                System.out.print("시스템을 종료합니다.");
                break;
            } else {
                System.out.print("올바른 값을 입력하세요.");
            }
        }



    }
}
