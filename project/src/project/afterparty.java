package project;
import javax.swing.*;//�� Ŀ���ϰ�ʹ�..
import java.awt.*;
import java.awt.event.*;
public class afterparty extends JFrame {
	

public afterparty() {
	
	private JTextField tf = new JTextField(40);
	private JTextArea ta = new JTextArea(20, 40);
	private JButton b = new JButton("�ʱ�ȭ");
	
	
	setTitle("������б� �����Ǵ� ��Ǯ��!");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(new JLabel("��Ǯ�� �ο����� �Է��ϼ���(5�� ����)"));
	c.add(tf);
	c.add(new JScrollPane(ta));
	
	
	
	
	setSize(500,500);
	setVisible(true);
}

public static void main(String[] args) {
	new afterparty();
}

}
