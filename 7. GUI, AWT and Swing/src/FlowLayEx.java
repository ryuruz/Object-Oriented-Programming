import javax.swing.*;
import java.awt.*;

public class FlowLayEx extends JFrame {
	public FlowLayEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(500,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FlowLayEx();
	}

}
