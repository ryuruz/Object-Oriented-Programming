# Inheritance

### 상속의 개념
* 객체지향의 상속
	* 부모 클래스에 만들어진 필드, 메소드를 자식클래스가 물려받음
	* 동일한 특성을 재정의할 필요가 없어 간결하게 자식 클래스 작성 가능

* 상속의 장점
	* 클래스의 간결화
	* 관리 용이 -> 클래스들의 계층적 분류
	* 소프트웨어 생산성 향상

### 클래스 상속과 객체
```java
public class Person{~}
public class Student extends Person{~}
```
+ 부모 클래스(super class)
+ 자식 클래스(sub class)
+ 상속을 위해서는 `extends` 키워드 사용 

### 자바 상속의 특징
+ 다중 상속 지원 x
+ 쭉 아래로 상속 가능 (상속 횟수 무제한)
+ 상속의 최상위 조상 클래스 java.lang.Object 클래스
	+ 모든 클래스는 자동으로 이를 상속받음
	+ 컴파일러에 의해 자동으로 이루어짐
	
### 상속과 접근 지정자
+ 슈퍼 클래스의 __private__ 멤버
	+ 다른 모든 클래스에서의 접근 불허
	+ 클래스 내의 멤버들에게만 접근 허용
+ 슈퍼 클래스의 __protected__ 멤버
	+ 같은 패키지 내의 모든 클래스에서의 접근 허용
	+ 다른 패키지에 있어도, 서브 클래스에서는는 접근 가능
+ 슈퍼 클래스의 default 멤버
	+ 패키지 내의 모든 클래스에서의 접근 허용
+ 슈퍼 클래스의 public 멤버
	+ 다른 모든 클래스에서의 접근 허용

### 상속에 따른 클래스의 생성자 호출 및 실행
+ 서브 클래스의 객체가 생성되는 경우
	+ 서브 클래스의 생성자와 슈퍼 클래스의 생성자가 모두 실행됨
	+ 슈퍼 클래스의 생성자가 먼저 실행된 후 서브 클래스의 생성자 실행됨
+ new에 의해 서브클래스의 객체가 생성될 때
	+ 호출 순서 : 서브 클래스의 생성자, 실핸 전 슈퍼 클래스 생성자 호출 -> 슈퍼 클래스의 생성자
	+ 실행 순서 : 슈퍼 클래스 -> 서브 클래스

1. 기본 생성자가 자동 선택되는 경우
+ 명시적 지시가 없는 경우, 서브 클래스의 생성자가 기본 생성자이든, 매개변수를 가진 것이든, 슈퍼 클래스의 기본 생성자가 선택된다.
+ 자바 컴파일러에 의해 강제로 이루어짐

2. 슈퍼 클래스에 기본 생성자가 없어 오류난 경우

```java
class A{
	public A(int x){
		System.out.println("생성자 A");
	}
}
class B extends A{
	public B(){ 
		System.out.println("생성자 B");
	}
}

public class ConstructorEx2{
	public static void main(string[] args){
	B b;
	b = new B(); 
	}
}
```

+ 클래스 A에 기본 생성자 없음
+ 클래스 B의 기본 생성자와 짝을 이룰 기본 생성자가 없어 오류 발생

3. 서브 클래스에 매개변수를 가진 생성자 

```java
class A{
	public A(){
		System.out.print("생성자 A ");
	}
	public A(int x){
		System.out.print("매개변수 생성자 A ");
	}
}
class B extends A{
	public B(){ 
		System.out.print("생성자 B ");
	}
	public B(int x){
		System.out.print("매개변수 생성자 B ");
	}
}

public class ConstructorEx2{
	public static void main(string[] args){
	B b;
	b = new B(5); // 
	}
}
```

+ 실행결과 : 생성자 A 매개변수 생성자B
+ 이 경우에도 개발자의 특별한 지시가 없으면 슈퍼 클래스의 기본 생성자가 호출됨
+ 컴파일러에 의해 `super()` 자동으로 첫 줄에 추가되기 때문

4. super() 이용하여 명시적으로 슈퍼 클래스의 생성자 선택 

```java
class A{
	public A(){
		System.out.print("생성자 A ");
	}
	public A(int x){
		System.out.print("매개변수 생성자 A ");
	}
}
class B extends A{
	public B(){ 
		System.out.print("생성자 B ");
	}
	public B(int x){
		super(x); // 반드시 첫 줄
		System.out.print("매개변수 생성자 B ");
	}
}

public class ConstructorEx2{
	public static void main(string[] args){
	B b;
	b = new B(5); // 
	}
}
```
+ 실행 결과 : 매개변수 생성자 A 매개변수 생성자 B
