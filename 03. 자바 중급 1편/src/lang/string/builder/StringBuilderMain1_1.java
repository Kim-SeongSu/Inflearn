package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // 변경할 부분이 끝나면 불변 객체인 String으로 변환하는 것이 안전 (사이드 이펙트 방지)
        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
