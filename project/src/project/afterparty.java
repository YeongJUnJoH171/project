package project;
import javax.swing.*;//아 커밋하고싶다..
import java.awt.*;
import java.awt.event.*;
public class afterparty extends JFrame {
	

public afterparty() {
	
	private JTextField tf = new JTextField(40);
	private JTextArea ta = new JTextArea(20, 40);
	private JButton b = new JButton("초기화");
	
	
	setTitle("고려대학교 관현악단 뒷풀이!");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(new JLabel("뒤풀이 인원수를 입력하세요(5명 단위)"));
	c.add(tf);
	c.add(new JScrollPane(ta));
	
	
	
	
	setSize(500,500);
	setVisible(true);
}

public static void main(String[] args) {
	new afterparty();
}

}
