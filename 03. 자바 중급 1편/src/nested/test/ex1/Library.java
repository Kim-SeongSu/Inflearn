/*
문제: 도서 관리 시스템
도서관에서 사용할 수 있는 간단한 도서 관리 시스템을 만들어 보자. 이 시스템은 여러 권의 도서 정보를 관리할 수 있어야 한다.
각 도서는 도서 제목( title )과 저자명( author )을 가지고 있다. 시스템은 도서를 추가하고, 모든 도서의 정보를 출력하는 기능을 제공해야 한다.
    Library 클래스를 완성해라.
        LibraryMain 과 실행 결과를 참고하자.
    Book 클래스는 Library 내부에서만 사용된다. Library 클래스 외부로 노출하면 안된다.
    Library 클래스는 Book 객체 배열을 사용해서 도서 목록을 관리한다.
 */

package nested.test.ex1;

public class Library {
    private Book[] bookList;
    private int cnt;

    public Library(int maxNum) {
        bookList = new Book[maxNum];  // 내가 틀린 부분
        cnt = 0;                      // 내가 틀린 부분
    }

    class Book {
        public String title;
        public String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        /*
          if (cnt < bookList.length) {
            bookList[cnt++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
         */
        // 추천하는 처리 방법
        // 검증 로직 처리 후
        if (cnt >= bookList.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정상 로직 처리
        bookList[cnt++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i=0; i<cnt; i++) {
            System.out.printf("도서 제목: %s, 저자: %s\n", bookList[i].title, bookList[i].author);
        }
    }
}
