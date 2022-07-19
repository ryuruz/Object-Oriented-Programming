import javax.swing.*;
import java.awt.*;

public class CntntPnEx extends JFrame{
	public CntntPnEx() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container cntntPn = getContentPane();
		cntntPn.setBackground(Color.ORANGE);
		cntntPn.setLayout(new FlowLayout());
	
		cntntPn.add(new JButton("OK"));
		cntntPn.add(new JButton("Cancel"));
		cntntPn.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CntntPnEx();
	}
}
