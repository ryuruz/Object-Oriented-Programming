import javax.swing.*;
import java.awt.*;

public class GridLayEx extends JFrame {
	public GridLayEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout g = new GridLayout(4,2);
		g.setVgap(5); // 각 행 사이의 수직 간격
		Container c = getContentPane();
		c.setLayout(g);
		//c.setLayout(new GridLayout(4,2, 0, 5));
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));

		c.add(new JLabel("학번"));
		c.add(new JTextField(""));

		c.add(new JLabel("학과"));
		c.add(new JTextField(""));

		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayEx();
	}

}
