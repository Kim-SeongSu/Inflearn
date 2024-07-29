package loop;

/*
문제: 구구단 출력
중첩 for문을 사용해서 구구단을 완성해라.
 */

public class NestedEx1 {
    public static void main(String[] args) {

        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.printf("| %d * %d = %d |\n", i,j,i*j);
            }
            System.out.println("|------------|");
        }
    }
}
