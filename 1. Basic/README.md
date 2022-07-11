## Identifier 식별자
+ 클래스, 변수, 상수, 메소드 등에 붙이는 이름
 
+ 원칙
  + 한글 사용 가능
  + 첫 번째 문자로 숫자 불가
  + 특수문자 중 _ $ 사용 가능, 첫 번째 위치도 가능하나 잘 사용 안 함
  + null, true, false 불가

가독성 높이기
  1. 클래스
      > 첫 번째 문자 대문자로, 각 단어의 첫 번째 문자만 대문자 
  2. 변수, 메소드
      > 두 번째 이상의 단어의 첫 문자만 대문자
  3. 상수
      > 모든 문자 대문자로    
      
```java
final static double PI = 3.141592;
```
____

## Data Type 데이터 타입
+ 기본 타입 8개 __string 포함 X__
  + 논리 타입
    + boolean : 1비트, true/false
  + 정수 타입
    + char : 2바이트, unicode, 0x0000 ~ 0xFFFF
    + byte : 1바이트, -128~127
    + short : 2바이트, -32768~32767  
    + int : 4바이트, -2^31~2^31-1, jdk8부터 양수로 사용 가능
    + long : 8바이트, -2^63~2^63-1, jdk8부터 양수로 사용 가능
  + 실수 타입
    + float : 4바이트
    + double : 8바이트
 
[_1바이트 = 8비트_]

[_영어 한글 모두 문자 하나 당 2바이트 유니코드_]

+ Reference Type : 배열, 또는 객체에 대한 주소값, 포인터 개념
  + array, class, interface

### 문자열 
기본 타입 아니고, String 클래스로 문자열 표현 가능
+ 쌍따옴표 이용 <-> char : ''

____

## Literal
+ 프로그램에서 직접 표현한 값
+ 정수 리터럴
  + 4바이트인 int형으로 컴파일
    + 10진수
    + 8진수 : 0으로 시작 `int m = 015; // 10진수 13`
    + 16진수 : 0x로 시작 `int k = 0x15; // 10진수 21`
    + 2진수 : 0b로 시작 `int b = 0b0101; // 10진수 5`
    + Long 타입으로 리터럴 선언 시, 숫자 뒤에 L 또는 l 표시 `long g = 24L`
+ 실수 리터럴
  + 소수점 형태나, 지수 형태로 표현한 실수
  + 8바이트인 double 타입으로 컴파일
```java
double d = 0.1234;
double e = 1234E-4; //1234x10^(-4)
double f = 12.;
double g = 12.0;
double h = .1234;
```
  + 숫자 뒤에 f(float)나 d(double)을 명시적으로 붙이기도 함
```java
float f = 0.1234f;
double w = .1234D;
```
+ 문자 리터럴
  + 단일 인용부호 (') 이용하여 문자 표현
  + 유니코드 사용시 \u 이용
```java
char c = \u0041; // A의 유니코드 0041
char d = \uae00; // 글의 유니코드 ae00
```
 + 특수 문자 리터럴

type|meaning|type|meaning
---|---|---|---
\b | backspace | \r | carriage return
\t | tab | \\\" | double quote
\n | line feed | \\\' |single quote
\f | form feed | \\ | backslash

+ 논리 리터럴
  + true / false
  + boolean 타입 변수에 치환하거나 조건문에 이용 `while(ture) // while(1) 안 됨 !!`

+ 이외의 리터럴
  + null : 레퍼런스에 대입하여 이용
``` java
int n = null; // 오류
String str = null;
```
  + 문자열 리터럴
    + 쌍따옴표 이용
 
### var - 변수 타입 생략
+ java10부터 도입
+ 지역 변수 선언에만 사용
+ 컴파일러가 변수 타입을 추론함
+ 변수 선언문에 반드시 초깃값 지정 `var name; // 컴파일 오류 발생`

### 상수 선언
+ final 키워드 이용

___

## 자동 타입 변환
+ 치환문(=)이나 수식 내에서 타입이 일치하지 않는 경우, 컴파일러에 의해 작은 타입은 큰 타입으로 자동 변환됨
```java
long m = 25; // 25는 int 타입이지만, long으로 자동 변환 25(32비트, 4바이트) -> 0025(64비트, 8바이트) `

double d = 3.14 * 10; // 실수 연산이므로 10이 10.0으로 자동 변환
```

## 강제 타입 변환
+ 큰 타입이 작은 타입으로 변환되야 하는 경우, 자동 타입 변환이 불가하여 강제 타입 변환이 필요
+ 개발자가 강제로 타입 변환을 지시
+ () 안에 변환할 타입 지정
+ 값 손실 우려 있음

```java
int n = 300;

byte b = n; // 컴파일 오류
byte b = (byte)n; // 4바이트 int 타입에서 1바이트인 byte 타입으로 변환 완료

double d = 1.9;
int n = (int)d; // 소숫점 이하 0.9의 값이 손실되어 n=1
```
____

## Scanner
```java
import java.util.Scanner;
Scanner a = new Scanner(System.in);

String name = scanner.next();
String city = scanner.next();
int age = scanner.nextInt();
double weight = scanner.nextDouble();
Boolean single = scanner.nextBoolean();
```

## Operator

+ 증감 연산

연산자|내용|연산자|내용
---|---|---|---
a++ | 먼저 a 반환 후 1 증가시킴 | ++a | 1 증가시킨 후 반환
a-- | 먼저 a 반환 후 1 감소시킴 | --a | 1 감소시킨 후 반환

+ 논리 연산

연산자|내용|예제|결과
---|---|---|---
NOT(!) | 역 | !(3<5) | false
OR(\|\|) | 모두 false인 경우에만 false | (3>5) \|\| (1==1) | true
AND(&&) | 모두 ture인 경우에만 true | (3>5) && (1==1) | false
XOR(^) | 서로 다를 때 true | (3>5) ^ (1==1) | true

+ 삼항 연산자 (Ternary Operator)
  + 세 개의 피연산자로 구성
  + condition? op2 : op3
    + condition이 true이면 op2, false이면 op3

+ 비트 연산 : 비트 논리 연산과 비프 시프트 연산 존재

1. 비트 논리 연산 

연산자|내용
---|---
AND(&) | 두 비트 모두 1인 경우에만 1
OR(\|) | 두 비트 모두 0인 경우에만 0
XOR(^) | 두 비트가 다르면 1, 같으면 0 
NOT(~) | 1을 0으로, 0을 1으로 

+ 예제) 현재 냉장고 온도가 0도 이상인지 판단하는 코드를 작성하라. (냉장고의 온도가 0도 이상이면, 3번 비트가 1이 된다.)
```java
byte flag = ob00001010; //0b 또는 0B는 binery prefix
if (flag & 0b00001000 == 0) // 어차피 and 연산이므로 비교값이 3번 비트만 0이기 때문에 flag의 3번 비트 여부만 영향 끼침
 System.out.println("0도 이하");
else
 System.out.println("0도 이상"); 
```
2. 비트 시프트 연산
+ 저장 공간의 크기가 정해져 있으므로, 시프트되는 방향에 따라 끝에 있는 비트는 사라지게 됨
+ float, double, boolean 타입은 불가

shift operator | name | meaning
---|---|---
a >> b | 산술적 오른쪽 시프트 | a의 각 비트를 오른쪽으로 b번 시프트. 최상위 비트의 빈자리는 시프트 전의 최상의 비트로 다시 채운다.
a << b | 산술적 왼쪽 시프트 | a의 각 비트를 왼쪽으로 b번 시프트. 최하위 비트의 빈자리는 항상 0으로 채운다.
a >>> b | 논리적 오른쪽 시프트 | a의 각 비트를 오른쪽으로 b번 시프트하고, 최상위 비트의 빈자리는 항상 0으로 채운다

```java
byte a = 5; // 0b00000101
byte b = (byte)(a<<2); //0b00010100 : 20
System.out.println("1. " + b);	

byte c = 20; // 0b00010100
byte d = (byte)(c>>>2); //0b00000101 : 5
System.out.println("2. " + d);
		
byte e = 20; // 0b00010100
byte f = (byte)(e>>2); //0b00000101 : 5
System.out.println("3. " + f);
		
byte g = (byte) 0xf8; // -8의 16진수 값 
/* 
2의 보수법으로 -8을 2진법으로 표현하면 8인 00001000에서 not연산인 11110111에 1 더하면 됨
근데 뒤 4비트만 보면 1+2+4 = 7이고, 1 더하면 8이므로 0111 을 1000으로 바꾸면 됨
따라서 0xf8 = 0b11111000 
*/
byte h = (byte)(g>>2); // 0b11111110 = 254 = -2 : 0xf2
System.out.println("3. " + h);
```

___

## 조건문
### if문
```java
if(조건) {
	//실행문이 한 문장인 경우 중괄호 생략 가능
}
```

### if-else문
```java
if(조건1) {
}
else if (조건2) {
	// elif로 줄여쓰기 불가
}
else if (조건3) {
}
else{
}
```

### swith문
```java
switch (식) {
	case 값1; // 값만 사용 가능하고, 변수나 식 사용 불가함
		~
		break;
		// 실행문을 {, }로 묶지 않는다
	case 값1;
		~
		break;
	default:
		~
		// 생략 가능 
}
```
