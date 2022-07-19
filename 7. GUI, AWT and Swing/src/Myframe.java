import javax.swing.*;


public class Myframe extends JFrame{
	public Myframe() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Myframe frame = new Myframe();
	}

}
