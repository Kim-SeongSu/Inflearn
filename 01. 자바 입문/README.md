# 김영한의 자바 입문 - 코드로 시작하는 자바 첫걸음

**[ 목차 ]**

> *01.* **변수**

> *02.* **연산자**

> *03.* **조건문**

> *04.* **반복문**

> *05.* **스코프 & 형변환**

> *06.* **배열**

> *07.* **메서드**

<br>

## 
> [!TIP]
> 실무에 도움이 될 꿀팁!

- `단축키 모음`
> IntelliJ의 단축키
```java
01. 빠른 코드 실행: ctrl + shift + F10
02. 줄 전체 복사: ctrl + D

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