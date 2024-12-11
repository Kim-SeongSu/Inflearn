package collection.list;

public class BatchProcessor {
    /*
    //private final MyArrayList<Integer> list = new MyArrayList<>();    // BatchProcessor가 구체적인 클래스에 의존
    private final MyLinkedList<Integer> list = new MyLinkedList<>();    // MyArrayList를 MyLinkedList로 변경할 때마다 수정해야 함.

    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
    }
     */

    private final List<Integer> list;         // BatchProcessor가 추상적인 MyList 인터페이스에 의존

    public BatchProcessor(List<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);  // 맨 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}


