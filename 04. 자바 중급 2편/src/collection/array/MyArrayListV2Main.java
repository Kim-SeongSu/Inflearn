package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);

        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
    }
}

/*
[] size=0, capacity=2
[a] size=1, capacity=2
[a, b] size=2, capacity=2
[a, b, c] size=3, capacity=4
[a, b, c, d] size=4, capacity=4
[a, b, c, d, e] size=5, capacity=8
[a, b, c, d, e, f] size=6, capacity=8
 */