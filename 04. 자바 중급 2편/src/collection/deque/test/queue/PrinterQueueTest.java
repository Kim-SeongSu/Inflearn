/*
문제1 - 프린터 대기
    프린터에 여러 문서의 출력을 요청하면 한번에 모든 문서를 출력할 수 없다. 따라서 순서대로 출력해야 한다.
    문서가 대기할 수 있도록 큐 구조를 사용하자.
    "doc1", "doc2", "doc3" 문서를 순서대로 입력하고, 입력된 순서대로 출력하자.
    실행 결과를 참고하자.
 */

package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();

        printQueue.add("doc1");
        printQueue.add("doc2");
        printQueue.add("doc3");

        /*
        for (String s : printQueue) {
            System.out.println("출력: " + s);
        }
         */

        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
    }
}
