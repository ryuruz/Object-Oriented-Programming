import javax.swing.*;
import java.awt.*;

public class practice1 extends JFrame{
	practice1(){
		setTitle("이름");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		// 1. FlowLayout
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		
		// 2. BorderLayout
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new JButton("0"), BorderLayout.CENTER);
		contentPane.add(new JButton("1"), BorderLayout.NORTH);
		contentPane.add(new JButton("2"), BorderLayout.EAST);
		contentPane.add(new JButton("3"), BorderLayout.SOUTH);
		contentPane.add(new JButton("4"), BorderLayout.WEST);
		
		// 3. GridLayout
		contentPane.setLayout(new GridLayout(2,2));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		
		// GridLayout으로 입력폼 만들기
		contentPane.setLayout(new GridLayout(3,2, 0,5));
		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		
		// 4. 배치관리자 없이
		contentPane.setLayout(null);
		JLabel la = new JLabel("Hello");
		la.setLocation(130,50);
		la.setSize(200,20);
		contentPane.add(la);
		
		for (int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(200,20);
			contentPane.add(b);
		}
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		practice1 mf = new practice1();
	}

}
