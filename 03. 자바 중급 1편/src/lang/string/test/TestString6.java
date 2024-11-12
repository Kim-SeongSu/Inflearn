/*
문제6 - 검색 count
문제 설명
str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라
 */

package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        while (str.contains(key)) {
            str = str.substring(str.indexOf(key)+1,str.length());
            count++;
        }

        /*
        #답안
        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
         }
         */

        System.out.println("count = " + count);
    }
}