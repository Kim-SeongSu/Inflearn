package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // 두 가지 중 타입만 선택해서 사용
        // MyArrayList<Integer> list = new MyArrayList<>();     // 크기: 50000, 계산 시간: 1361ms   O(n)
        LinkedList<Integer> list = new LinkedList<>();      // 크기: 50000, 계산 시간: 2ms      O(1)

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
