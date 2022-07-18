# 컬렉션과 제네릭

## 컬렉션(Collection)의 개념
+ 컬렉션 : 요소(element) 객체들의 저장소
+ 요소들의 개수에 따라 크기를 자동 조절함
+ 요소의 삽입, 삭제에 따른 요소의 위치 자동 이용
+ 고정 크기의 배열을 다루는 어려움 해소
+ 다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이
+ 컬렉션의 요소는 객체만 가능 => __int, char, double 등의 기본 타입 사용 불가 => Wrapper 이용__

## 제네릭(Generics)
+ 컬렉션은 제네릭 기법으로 구현
+ 특정 타입만 다루지 않고, 여러 종류의 타입으로 정할 수 있도록 클래스나 메소드를 일반화시키는 기법 
+ \<E\>, \<K\>, \<V\>의 타입 매개 변수(요소 타입을 일반화한 타입) 이용

## 제네릭 Stack \<E\> 클래스의 메뉴얼 
+ 스택 생성 : ` Stack<E> myStack = new Stack<E> ();`
+ 메소드
```java
Boolean empty() // 스택이 비어있는지 확인
E peek() // 요소를 제거하지 않고 스택에서 가장 위에있는 요소를 리턴
E pop() // 가장 위에 있는 요소를 제거하면서 꺼내옴
E push(item) // 요소를 스택의 가장 최상위에 집어 넣음
```

## Vector \<E\>
+ java.util.Vector
+ \<E\>에서 E 대신 요소로 사용할 특정 타입으로 구체화
+ 여러 객체들을 삽입, 삭제, 검색하는 컨테이너 클래스
+ 객체, null 삽입 가능. 기본 타입은 Wrapper 객체로 만들어서 저장해야 함
+ 객체 삽입 : 맨 뒤 또는 중간에 객체 추가 
+ 객체 삭제 : 임의의 위치에 있는 객체 삭제 가능, 삭제 후 자동으로 자리 정렬
+ `Vector v = new Vector();` 처럼 타입 매개 변수를 생략하면 안 됨

## 자동 박싱/언박싱
```java
Vector<Interger> v = new Vector<Integer> (); // 기본 타입인 int로 구체화 불가
v.add(4); // Integer.valueOf(4)로 자동 박싱
int k = v.get(0); // Integer타입이 int타입으로 자동 언박싱
```

## 컬렉션을 매개변수로 받는 메소드
+ `public void printVector(Vector> Integer v);`

## 자바 타입 추론의 진화
+ 변수 v의 타입을 보고, 뒤 벡터의 타입을 추론
`Vector<Integer> v = new Vector<>();` 
+ `var`키워드 도입, 컴파일러이 지역 변수 추론 가능
`var v = new Vector<Integer>();` 

___

## ArrayList 클래스
### 특성
+ java.util.ArrayList
+ `ArrayList<String> a = new ArrayList<String>();`
+ 가변 크기 배열을 구현한 클래스
+ 삽입 가능한 것 : 객체, null
+ 객체 삽입/삭제 : 리스트의 __맨 뒤, 중간__ 에 삽입 가능, 임의 위치에 있는 객체 삭제 가능
+ vector 클래스를 대체하기 위함

## 벡터 클래스와의 비교
### 공통점
+ List 인터페이스 구현
+ 중복 허용
+ 저장순서 유지
+ 내부적 배열 사용

### 차이점
+ vector 클래스는 멀티 thread에 대한 동기화 제공
+ arrayList클래스는 동기화 제공하지 않음 -> 빠름

- [ ] 데이터 개수 적으면 : arrayList
- [ ] 멀티 쓰레드 환경에서 동기화를 하고 싶은 경우는 vector 사용, arraylist인 경우 메소드 사용

## ArrayList 컬렉션의 주요 메소드
+ vector의 메소드와 거의 다 유사하지만, 벡터의 현재 용량을 리턴하는 메소드인 `int capacity()` 메소드가 없음

메소드 | 설명
|---|---|
add() | 요소 삽입
set() | 요소 변경
remove() | 요소 제거
clear() | 초기화

___

## 컬렉션의 순차 검색을 위한 Iterator
+ `iterator()`
+ 인덱스 없이 순차적 탐색 가능

메소드 | 설명
|---|---|
boolean hasNext() | 방문할 요소가 남아있으면 true 리턴
E next | 다음 요소 리턴
void remove() | 마지막으로 리턴된 요소 제거

```java
Vector<Integer> v = new Vector<Integer>();
Iterator<Integer> it = v.iterator();

while(it.hasNext()) { // 모든 요소 방문
  int n = it.next(); // 다음 요소 방문
  System.out.println(n);
}

// 다시 사용할 경우
it = v.iterator(); // 다시 객체 소환
```

- [ ] for문으로 요소에 접근할 경우 문제점
+ 요소를 삭제할 경우, 자동으로 배열이 정리되기 때문에 모든 요소에 접근이 불가능할 수 있음.
+ 따라서 iterator()로 접근하는 것이 권장됨

___ 

## HashMap <K, V>
+ java.util.HashMap
+ key값과 value값의 쌍으로 구성되는 요소를 다루는 컬렉션
+ key : 해시맵에 삽입되는 위치 결정에 사용, 값을 검색하기 위해 필요
+ 삽입, 삭제, 검색이 빠른 특징
+ 요소 삽입 : put(k, v), 요소 검색 : get(k)
+ 요소 삭제 : remove(k) // 지정된 키를 찾아 키와 값 모두 삭제

___

## LinkedList <E>
+ java.util.LinkedList
+ 요소 객체들이 양방향으로 연결되어 관리됨
+ vector, arrayList와 매우 유사
+ 요소 객체는 맨 앞, 맨 뒤, 인덱스를 이용하면 중간에도 삽입 가능
+ 스택, 큐로 사용 가능

___

## Collections 클래스 활용
+ java.util 패키지에 포함
+ 모든 메소드는 static 타입

___

## 제네릭
+ 타입 선언부에 일반화된 타입 추가
+ 제네릭 타입의 클래스에 구체적인 타입을 대입하여 객체 생성
+ 컴파일러에 의해 이루어짐
+ 타입 매개 변수로 기본 타입 사용 불가

```java
public class MyClass<T>{~}
MyClass<String> s = new MyClass<String>(); // 제네릭 타입 T에 String 지정
```

## 타입 매개 변수
+ \<와 /> 사이에 하나의 대문자를 타입 매개변수로 사용
+ E, T, V, K
+ 타입 매개변수가 나타내는 타입의 객체 생성 불가 `T a new T();` 
+ 타입 매개변수는 나중에 실제타입으로 구체화 가능
+ 어떤 문자도 매개 변수로 사용 가능

## 제네릭에서 배열의 제한
+ 제네릭 클래스 또는 인터페이스의 배열을 허용하지 않음
+ 제네릭 타입의 배열도 허용되지 않음
+ 타입 매개변수의 배열에 레퍼런스는 허용

## 제네릭의 장점
+ 컴파일 시에 타입이 결정되어 보다 안전한 프로그래밍 가능
+ 런타임 타입 충돌 문제 방지
+ ClassCastException 방지
