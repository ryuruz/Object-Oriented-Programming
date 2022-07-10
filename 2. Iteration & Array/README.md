# Iteration
## __for__ loop
```java
for(초기문; 조건식; 반복 후 작업) {
    statement
}
```
+ 처음부터 반복 횟수를 알 수 있는 경우 이용
+ 초기문
  + 컴마로 나열 가능
  + 빈 상태 가능  
+ 조건식
  + 논리형 변수 또는 논리 연상 사용
  + true인 경우 반복됨
  + false인 경우 벗어남

## __while__ loop
```java
while (조건식) {
  statement;
}
```
+ 반복 횟수 알 수 없는 경우 적합
+ 조건식 true인 경우 반복됨

## __do-while__ loop
```java
do {
  statement;
} while(조건식);
```
+ 조건식 부재시 오류 발생
+ 작업문 실행 후 조건식 검사
+ 조건식에 사용되는 변수는 실행 이전에 반드시 초기화 이루어져야 함

## nested loop
## countinue
+ 반복문을 빠져나가지 않으면서 즉시 다음 반복으로 넘어가고자 할 때 `countinue`
## break
+ 반복문을 즉시 벗어날 때 사용

___

# Array
## 배열 선언 및 생성
1. 배열에 대한 레퍼런스 변수 선언
  + 이 선언만으로는 배열 공간이 할당되지 않음
  + 선언 시 []안에 배열 크기 지정 불가
  
2. 배열 생성 (배열의 저장 공간 할당)
  + 반드시 new 연산자를 이용
  + []안에 생성할 원소의 개수를 지정함
   
```java
int intArray[];
// 또는
int [] intArray;

intArray = new int [5]; // 원소가 5개인 배열 생성

// 동시에 생성
int intArray[] = new int[5];
```
+ 배열 초기화 `int intArray = {4, 3, 2, 1, 0};`
+ 배열의 인덱스는 정수만 가능하며, 0부터 시작함

## 레퍼런스 치환과 배열 공유
```java
int intArray[] = new int[5];
int myArray[] = intArray;
intArray[1] = 2;
myArray[1] = 6;
// 두 레퍼런스가 하나의 배열을 공유하므로, intArray[1]도 6의 값을 가짐
```

## 배열의 크기
```int size = intArray.length;```
+ length 필드를 사용하여 배열의 크기를 알아낼 수 있음

## 배열과 for-each 문
+ for-each문 : 배열이나, 나열(enumerateion의 크기만큼 루프를 돌면서 각 원소를 순차적으로 접근하는데 유용하게 만든 for문
+ 배열 예제
```java
int [] n = {1, 2, 3, 4, 5};
int sum = 0;
for (int k : n) { //n.length만큼 반복. k는 순차적으로 n[0], n[1] .. n[4]
  sum += k;
}
System.out.println(sum);
```
+ 나열 예제
```java
enum Week { 월, 화, 수, 목, 금, 토, 일}
for (week day : Week.values())
  System.out.print(day + "요일");

___

## 이차원 배열 
+ 이차원 배열의 선언과 생성

```java
char charArray [][];
//또는
char [][] charArray;

charArray = new char [2][5]; //2행 5열

int size1 = charArray.length; //2
int size2 = charArray[0].length; //5
int size3 = charArray[2].length; //5
```

+ 2차원 배열의 초기화

> 배열을 선언하면서 원소 초기화 가능, 자동으로 원소 개수만한 배열 공간이 할당됨

## 비정방향 배열 
+ 각 행의 열의 개수가 다른 배열
```java
int i [][];
i = new int[4][];

i[0] = new int[1];
i[1] = new int[2];
i[2] = new int[3];
i[3] = new int[4];
```
+ `i.length` 총 행의 갯수인 4
+ 각 열의 length는 순서대로 1,2,3,4

___
## 메소드에서 배열 리턴
+ 메소드의 리턴 타입과 배열의 리턴 타입이 일치해야 함
+ 아래 경우 temp의 리턴타입 int
```java
int [] = makeArr() {
    int temp[[] = new int[4];
       return temp;
}

+ 2차원 배열을 리턴하는 메소드
```java
int [][] make2dAr() {
    return new int[3][4];
}
int [][] int2dAr = make2dAr(); // 레퍼런스 받음
```

___

## main() 
+ 자바 응용프로그램의 실행 시작 메소드
+ 반드시 public(다른 클래스에서 메소드 접근 허용) static(객체 생성 전부터 호출 가능) void (리턴 값 없음)
+ 문자열 배열 `String[]`이 매개변수로 전달됨
