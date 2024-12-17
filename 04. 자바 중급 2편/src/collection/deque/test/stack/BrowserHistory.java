/*
문제2 - 브라우저 히스토리 관리
BrowserHistoryTest 와 실행 결과를 참고해서 BrowserHistory 클래스를 완성하자.
브라우저의 방문 기록 관리 기능을 개발하자. 다음 기능을 개발해야 한다.
    visitPage() : 특정 페이지 방문
    goBack() : 뒤로가기
 */

package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> stack = new ArrayDeque<>();
    // 추가
    private String currentPage = null;

    public void visitPage(String url) {
        System.out.printf("방문: %s\n", url);
        stack.push(url);
    }

    public String goBack() {
        if (stack.size() > 1) stack.pop();
        if (!stack.isEmpty()) {
            currentPage = stack.pop();
            System.out.printf("뒤로 가기: %s\n", currentPage);
            return currentPage;
        }
        return null;
    }
}

/*
// 답안
public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
 */
