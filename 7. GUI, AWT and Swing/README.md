# 자바의  GUI(Graphical User Interface)
## GUI
+ 그래픽을 이용하여, 사용자에게 이해하기 쉬운 모양으로 정보 제공
+ 사용자는 마우스나 키보드를 이용하여 쉽게 입력 가능
+ 여러가지 컴포넌트 제공
- [ ] AWT
- [ ] Swing
+ GUI 라이브러리 계층 구조

|Object|
|---|
AWT
Swing

|AWT(Abstract Windowing Toolkit)|Swing|
|:---:|:---:|
java.awt|javax.swing
중량 컴포넌트|경량 컴포넌트
자바가 처음 나왔을 때 함께 배포된 GUI 라이브러리 |AWT 기능에 +a 추가된 고급 컴포넌트
운영체제의 도움을 받아 작동</br>운영체제에 부담이 되나 처리 속도가 빠름| j자로 시작하는 클래스

___

## Swing 클래스의 특징
+ 클래스 이름이 j 자로 시작 but 예외도 존재 ex) AbstractButton
+ 2가지 유형 존재

|JComponent를 상속받는 클래스|AWT의 container를 상속받는 몇개의 클래스|
|:---:|:---:|
대부분의 스윙 컴포넌트들이 이에 해당</br>스윙 컴포넌트의 공통 속성을 구현한 추상 클래스로 구성</br>인스턴스 생성 불가|JApplet, JDialog, JFrame 등

## 컨테이너와 컴포넌트
### 컨테이너
+ 다른 GUI 컴포넌트를 포함할 수 있는 컴포넌트
+ java.awt.Container 상속받음
+ 다른 컨테이너에 포함될 수 있음
### 최상위 컨테이너
+ 다른 컨테이너에 속하지 않고 독립적으로 화면에 출력 가능한 컨테이너 
>> JFrame, JDialog, JApplet
+ 모든 컴포넌트는 컨테이너에 포함되어야 화면에 출력 가능
### 컴포넌트
+ 컨테이너에 포함되어야 화면에 출력될 수 있는 순수 컴포넌트
+ 모든 컴포넌트는 java.awt.Component 상속받음
+ 모든 스윙 컴포넌트는 javax.swing.JComponent 상속받음

## 스윙 GUI 프로그램 만들기
### 1. 스윙 프레임 작성
+ 모든 스윙 컴포넌트를 담는 최상위 GUI 컨테이너
   + JFraim을 상속받아 구현
   + 컴포넌트가 화면에 보이려면 스윙 프레임 내에 부착되어야 함 -> 부착되어야 하는 공간: Content Pane
   + 프레임을 닫으면 프레임 내의 모든 컴포넌트가 보이지 않게 됨
+  스윙 프레임의 기본 구성
   + 프레임: 스윙 프로그램의 기본 틀
   + 메뉴바: 메뉴들이 부착되는 공간
   + 컨텐트 팬: GUI 컴포넌트들이 부착되는 공간  
### 2. main() 메소드 작성 - 객체 생성 역할

### 3. 프레임에 스윙 컴포넌트 붙이기
+ 스윙 패키지 사용을 위한 import문
```
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.swing.event.*;
```

## 프레임에 컴포넌트 붙이기
+ 생성자에 추가 
+ 컨텐트팬(Contents Pane) 알아내기
+ 컨텐트팬에 컴포넌트 달기
+ 변경 시 frame.setContentPane()

## 스윙 프로그램의 종료
+ 응용 프로그램 내에서 스스로 종료
    + `System.exit(0)`
    + 언제 어디서나 무조건 종료
   
## 컨테이너와 배치 개념
+ 적절한 위치, 크기 조절
+ 배치 관리자의 대표 유형 4가지
+ 컨테이너는 생성시 디폴트 배치관리자를 설정함
+ 컨테이너에 새로운 배치관리자 설정 가능

|배치 관리자|설명|
|:---:|:---:|
FlowLayout | 컴포넌트들을 왼쪽 위에서부터 차례로 배치
BorderLayout | 중앙을 기준으로 동서남북으로 나누어 배치
GridLayout | 행과 열로 이루어짐, 왼쪽에서 오른쪽, 위에서 아래
CardLayout | 일렬로 배치, 화면 상 제일 앞 컴포넌트만 보임

### FlowLayout
+ 컨테이너 공간 내 왼쪽에서 오른쪽으로 배치
+ 다시 위에서 아래로
+ 컨테이너의 크기가 변하면 컴포넌트를 재배치함

```java
container.setLayout(new FlowLayout());
// 생성자
FlowLayout()
FlowLayout(int align) // align: 정렬 방법. 디폴트: 가운데 정렬, 왼쪽정렬 .LEFT, 가운데 정렬 .CENTER, 오른쪽 정렬 .RIGHT
FlowLayout(int align, int hGap, int vGap) // hGap 좌우 컴포넌트 간 수평간격, vGap 상하 컴포넌트 간 수직 간격, 디폴트 5
```

### BorderLayout
+ 컨테이너 공간을 5구역으로 분할, 배치:  East, West, South, North, Center
+ 배치 방법 `add(Component comp, int index)`
+ 컨테이너의 크기가 변하면 재배치

```java
// 생성자
BorderLayout()
BorderLayout(int hGap, int vGap) // hGap 좌우 컴포넌트 간 수평간격, vGap 상하 컴포넌트 간 수직 간격, 디폴트 0

// add() 멤버 함수
void add(Component comp, int index) // ex) container.add(JButton("div"), BorderLayout.WEST);
```
### GridLayout
+ 컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고, 각 셀에 하나의 컴포넌트 배치
+ 생성자에 행, 열수 지정
+ 셀에 왼쪽에서 오른쪽으로, 다시 위에서 아래로 순서대로 배치


```java
// 생성자
GridLayout()
GridLayout(int rows, int cols) // 그리드의 행, 열수, 디폴트 1
GridLayout(int rows, int cols, int hGap, int vGap) // hGap 좌우 컴포넌트 간 수평간격, vGap 상하 컴포넌트 간 수직 간격, 디폴트 0
```

### 배치관리자 없는 컨테이너
+ 응용 프로그램에서 컴포넌트의 절대 크기와 절대 위치 결정
+ 컴포넌트의 크기나 위치를 개발자 임의로 결정하고자 하는 경우
   + 게임 등 컴포넌트들의 위치와 크기가 수시로 변하는 경우
   + 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우 등
+ 배치 관리자 제거 코드 `container.setLayout(null);` 
+ 컴포넌트의 절대 크기와 절대 위치 설정
    + 크기 설정 setSize(int width, int height);
    + 위치 설정 setLocation(int x, int y);
    + 동시 설정 setBounds(int x, int y, int width, int height);

____

