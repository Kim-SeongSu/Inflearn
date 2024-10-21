# 김영한의 실전 자바 - 기본편

**[ 목차 ]**

> *01.* **클래스와 데이터** [ 🔍 ]()

> *02.* **기본형과 참조형** [ 🔍 ]()

> *03.* **객체 지향 프로그래밍** [ 🔍 ]()

> *04.* **생성자** [ 🔍 ]()

> *05.* **패키지** [ 🔍 ]()

> *06.* **접근 제어자** [ 🔍 ]()

> *07.* **자바 메모리 구조와 static** [ 🔍 ]()

> *08.* **final** [ 🔍 ]()

> *09.* **상속** [ 🔍 ]()

> *10.* **다형성** [ 🔍 ]()

> *11.* **다형성과 설계** [ 🔍 ]()

> *+* **java 실습** [ 🔍 ]()
<br>


## 
> [!TIP]
> 🔆 **실무에 도움이 될 꿀팁 정리!**

<!-->
- `단축키 모음`
> IntelliJ의 단축키
```java
01. 빠른 코드 실행: ctrl + shift + F10
02. 줄 전체 복사: ctrl + D
03. 클래스명 수정: workspace에서 이름 변경 후 Alt + Enter  → "Rename File"
04. 메서드 위치로 이동: 메서드 이름 클릭 + ctrl + B
05. 한번에 변수 변경: shift + F6
```
<br>

- `psvm`
> **main 구문**을 **생성**하는 IntelliJ의 명령어
```java
psvm 
>> public static void main(String[] args) { }

```
<br>

- `sout`
> **println 구문**을 **생성**하는 IntelliJ의 명령어
```java
sout 
>> System.out.println();

soutv  // 가장 가까운 변수를 아래의 양식에 맞춰 출력
>> System.out.println("num1 = " + num1);

soutm  // 현재 클래스와 메서드를 출력
>> System.out.println("VarEx1Question.main");

soutp  // 현재 메서드의 파라미터 이름과 값을 출력
>> System.out.println("args = " + Arrays.toString(args));
```
<br>

- `iter`
> **향상된 for문**을 **생성**하는 IntelliJ의 명령어
```java
int[] numbers = {1,2,3,4,5,6}    // 배열 생성 후
iter
>> for (int value : numbers){
    }

```
<br>
-->