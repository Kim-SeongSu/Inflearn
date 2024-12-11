/*
문제2 - 리스트의 입력과 출력
문제 설명
    사용자에게 n 개의 정수를 입력받아서 List 에 저장하고, 입력 순서대로 출력하자.
    0 을 입력하면 입력을 종료하고 결과를 출력한다.
    출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 , 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
 */


package collection.list.test.ex1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            // int n = Integer.parseInt(sc.nextLine());
            int n = sc.nextInt();
            if (n == 0) break;
            list.add(n);
        }
        System.out.println("출력");
        // System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size()-1) System.out.print(", ");
        }
    }
}
