# 패키지(Package)
+ 서로 관련된 클래스와 인터페이스의 컴파일된 클래스 파일들을 하나의 디렉터리에 묶어 놓은 것
+ 동일한 이름의 클래스가 존재하더라도, 다른 디렉터리에 존재 시 다르게 취급 가능

## 패키지 사용하기
> 다른 패키지에 작성된 클래스 사용
+ import를 이용하지 않는 경우
   + 소스 내에서 패키지 이름과 클래스 이름의 전체 경로명을 써주어야 함
   + `java.util.SCanner = scanner ~` 
+ import를 이용하는 경우
  + 1. 특정 클래스의 경로명만 포함
  + `import java.util.Scanner;`
  + 2. 패키지 내의 모든 클래스 포함 - 하위 패키지의 클래스까지는 포함하지 않음
  + `import java.util.*;`

## 패키지 선언
`package 패키지명`
+ 소스파일의 첫 줄에 선언
+ 컴파일한 클래스 파일을 패키지명의 디텍터리에 저장하라는 지시

## 디폴트 패키지
+ package 선언문이 없이 만들어진 클래스의 패키지
+ 현재 디렉터리

## 패키지의 특징
+ 패키지 계층구조
+ 패키지별 접근 제한
+ 동일한 이름의 클래스와 인터페이스의 사용 가능
+ 높은 소프트웨어 재사용성
___

# 모듈(Module)
+ 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
+ jdk9부터 자바 API의 모든 클래스들(자바 실행 환경)을 패키지 기반에서 모듈들로 완전히 재구성
+ 자바 API를 여러 모듈로 분할하여 응용프로그램의 실행에 적합한 모듈들로만 실행 환경을 구축할 수 있도록 함
+ 모듈 파일(j.nod)로 저장
+ 압축되어 있음

## 자바 플랫폼의 모듈화
+ 자바 플랫폼 : 자바 개발 환경인 JDK와 바자의 실핸 환경인 JRE를 지칭, 자바 API인 java SE 포함
+ 자바 API의 모든 클래스가 여러 개의 모듈로 재구성됨
+ 모듈 파일은 jdk의 jmods 디렉터리에 저장하여 배포
+ 
## 모듈 기반의 자바 실행 환경
+ 자바 실행 환경
  + JRE : 디폴트 자바 실행 환경 - 자바 모듈, 자바 가상 기계 등으로 구성
+ java9 이후부터 모듈을 기반으로 자바 응용프로그램 실행 가능
+ 관련된 클래스만 가지고 와 실행 -> 맞춤형

## 자바 모듈화의 목적
+ 자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함
+ 컴퓨터 시스템의 불필요한 부담 감소
  + 불필요한 모듈이 로드되지 않게
  + 소형 IoT 장치에서도 자바 응용프로그램이 실행되고, 성능을 유지하게 함

___

## 주요 패키지
+ java.lang
  + 스트링, 수학 함수, 입출력 등 자바 프로그래밍에 필요한 __기본적인__ 클래스와 인터페이스
  + 자동으로 import됨 
+ java.util
  + 자바 유틸리지 패키지
  + 날짜, 시간, 벡터, 해시맵 등과 같은 다양한 유틸리티 클래스와 인터페이스 제공
+ java.io
  + 키보드, 모니터, 프린터, 디스크 등에 입출력을 할 수 있는 클래스와 인터페이스 제공 
+ java.awt
  + 자바 GUI 프로그래밍을 위한 클래스와 인터페이스 제공 
+ java.swing
  + 자바 GUI 프로그래밍을 위한 스윙 패키지 

### 요약
+ 패키지
  + 관련있는 클래스들의 집합
  + 디렉토리 계층 구조 가짐
  + 클래스의 정식명칭은 패키지 이름을 포함함
  + package 선언문
    + 디폴트 패키지에 속함
    + 첫번째 라인에 패키지 이름을 지정  
+ import 선언문
  + 클래스를 찾을 패키지를 컴파일러에게 알림
  + 클래스 명칭에서 패키지 이름 생략 가능 
+ 모듈
  + 패키지의 집합
  + 커스텀 실행환경을 만들어 메모리 사용량을 줄임

## Object 클래스
+ 특징
  + java.lang 패키지에 포함
  + 모든 클래스의 슈퍼 클래스
    + 모든 클래스에 강제 상속
    + 모든 객체가 공통으로 가지는 객체의 속성을 나타내는 메소드 보유

## 객체를 문자열로 변환
`String toString()`
+ 객체를 문자열로 반환
+ Object 클래스에 구현된 toString()이 반환하는 문자열
+ 자신만의 재정의 가능 -> Object의 toString() 

## 객체 비교와 equals()
+ == 연산자
  + 두 개의 레퍼런스 비교
  + 실제 data는 중요하지 않음
+ boolean equals()
  + `a.equals(b)` a와 b 비교
  + 객체 내용이 같은지 비교  

## Wrapper 클래스
+ 자바의 기본타입을 클래스화한 8개의 클래스
+ 이름이 Wrapper인 클래스가 존재하는 것이 아니라, 기본 타입을 매치시킨 것
+ 자바 기본타입의 첫 글자 대문자 
+ (기본타입 -> Wrapper 클래스) : int -> Integer, char -> Character

## Wrapper 객체 생성
+  `static 메소드 valueOf(기본타입 또는 문자열)` 이용
+  new 키워드 쓰지 않음 
`Byte b = Byte.valueOf((byte) 10)`

## Wrapper의 주요 메소드
+ 많은 메소드가 static 타입

## Wrapper 활용
+ 기본 타입 알아내기
```java
integer i = Integer.valueOf(10);
int ii = i.intValue() // i = 10;

Character c = Character.valueOf('c');
char cc = c.charValue(); // cc='c'

Boolean b = Boolean.valueOf(true);
boolean bb = b.booleanValue(); // bb= true
```
+ 문자열을 기본 데이터 타입으로 변환
  + Character 클래스에는 parseChar() 메소드가 없음 
  + `byte b = Byte.parseByte("12")`
+ 기본 타입을 문자열로 변환
+ Integer 클래스
`String s4 = Integer.toString(123, 7)` 123을 7진수의 문자열으로 변환

## 박싱, 언박싱
+ 박싱 : 기본 타입의 값을 Wrapper 객체로 변환 `Integer ten = Integer.valueOf(10);`
+ 언박싱 : Wrapper 객체에 들어있는 기본 타입의 값을 빼내는 것 `int n = ten.intValue();`
+ 컴파일러에 의해 자동 박싱/언박싱
```java
Integer ten = 10; // 자동 박싱
int n = ten; // 자동 언박싱
```
___

## String의 특징과 객체 생성
+ java.lang.String
+ 하나의 문자열 표현
+ 생성방법
   + `String s = "Hello";` 
      + 스트링 리터럴 테이블에 저장
      + 동일한 문자열을 중복하여 저장할 수 없음 => 동일한 문자열이 있다면 동일한 주소(레퍼런스)를 가리키고 있는 것임
   + `String t = new String("Hello")` 
      + 힙 메모리에 저장
      + 각각의 객체들을 생성하여, 동일한 문자열도 지정 가능
+ 스트링 객체는 수정 불가능 -> 원하는 객체 새로 생성하기
+ 스트링 비교시 equals() 사용

## 문자열 메소드
+ +연산자로 문자열 연결
+ 피연선자에 문자열이나 객체가 포함되어 있는 경우 
   + 객체는 toString() 메소드를 호출하여 문자열로 변환하여 연결됨
   + 기본 타입 값은 문자열로 변환하여 연결됨
+ String concat(String str)을 이용한 문자열 연결
   + `I Love ".concat("JAVA. ")` >> I Love JAVA.
   + 기존 스트링 객체에 연결되지 않고 새로운 스트링 객체를 리턴

+ 문자열 접근
   + 공백 제거 : `String Trim()` 문자열 앞 뒤 공백 문자를 제거한 문자열 리턴
   + 문자열 내의 문자 접근 : `String CharAt(int index)` 문자열 내 인덱스에 속하는 문자에 접근
 
## StringBuffer 클래스
+ java.lang.StringBuffe
+ 가변 크기의 문자열 저장 클래스
+ 문자열 변경 가능
+ 객체 크기는 스트링 길이에 따라 가변적

## StringTokenizer 클래스
+ java.util.StringTokenizer
+ `StringTokenizer st = new StringTokenizer("name = Jihyun&Tinny", "&")`
+ 하나의 문자열을 여러 문자열로 분리
+ 구분 문자(delimiter) : 분리할 떄 기준이 되는 기준 문자
+ 토큰(token) : 구분 문자로 분리딘 문자열, 구분 문자는 토큰에 속하지 않음

## Math 클래스
+ java.lang.Math -> 기본이라 import 필요 없음
+ 난수 발생 `static double random()`
   + 0.0이상 1.0미만의 임의의 double 값 반환
   + <-> java.util.Random 클래스도 존재
```java
// 0에서 100 사이의 난수를 10개 발생시키는 샘플 코드
for (int x = 0; x<10; x++){
   int n = (int)(Math.random()*100 + 1);
   System.out.println(n);
   }
```

## Calendar 클래스
+ java.util 패키지
+ 추상 클래스 => 추상 메소드로 이루어짐 => 사용하면 직접 정의해주어야 함
+ 객체 생성 `Calandar now = Calendar.getInstance();`
+ 날짜, 시간 알아내기 : get
+ 설정하기 : set
