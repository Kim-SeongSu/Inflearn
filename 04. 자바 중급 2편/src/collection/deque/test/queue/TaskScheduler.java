/*
문제2 - 작업 예약
    서비스를 운영중인데, 낮 시간에는 사용자가 많아서 서버에서 무거운 작업을 하기 부담스럽다. 무거운 작업을 예약해두고 사용자가 없는 새벽에 실행하도록 개발해보자.
    다양한 무거운 작업을 새벽에 실행한다고 가정하자.
    작업은 자유롭게 구현하고 자유롭게 예약할 수 있어야 한다.
    다음 예제 코드와 실행 결과를 참고해서 TaskScheduler 클래스를 완성하자.
 */

package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler<E> {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(E e) {
        tasks.offer((Task) e);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        tasks.poll().execute();
    }

    @Override
    public String toString() {
        return "TaskScheduler{" +
                "tasks=" + tasks +
                '}';
    }
}

/*
// 답안
public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();
    public void addTask(Task task) {
        tasks.offer(task);
    }
    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
    }
    public int getRemainingTasks() {
        return tasks.size();
    }
}
 */