# 김영한의 자바 입문 - 코드로 시작하는 자바 첫걸음

**[ 목차 ]**

> *01.* **변수** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/01.%20%EB%B3%80%EC%88%98%20(variable).md)

> *02.* **연산자** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/02.%20%EC%97%B0%EC%82%B0%EC%9E%90%20(operator).md)

> *03.* **조건문** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/03.%20%EC%A1%B0%EA%B1%B4%EB%AC%B8%20(conditional).md)

> *04.* **반복문** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/04.%20%EB%B0%98%EB%B3%B5%EB%AC%B8%20(loop).md)

> *05.* **스코프 & 형변환** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/05.%20%EC%8A%A4%EC%BD%94%ED%94%84(Scope)%20%26%20%ED%98%95%EB%B3%80%ED%99%98(Casting).md)

> *06.* **배열** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/06.%20%EB%B0%B0%EC%97%B4%20(Array).md)

> *07.* **메서드** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/blob/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/07.%20%EB%A9%94%EC%84%9C%EB%93%9C%20(Method).md)

> *+* **java 실습** [ 🔍 ](https://github.com/Kim-SeongSu/Inflearn/tree/main/01.%20%EC%9E%90%EB%B0%94%20%EC%9E%85%EB%AC%B8/src)
<br>

## 
> [!TIP]
> 🔆 **실무에 도움이 될 꿀팁 정리!**

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
