package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class namecard extends JFrame{
private JTextField tf = new JTextField(100);
private JTextArea ta = new JTextArea(40, 100);

public namecard() {
	setTitle("������б� �����Ǵ� ��ܰ���");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(new JLabel("�̸�/�й�/�а�/�Ǳ�/��ȭ��ȣ/��� ���б�/��� ����б�/������ ���� ������ ���� ����ǥ(!)�� ���� �� <Enter> Ű�� �Է��ϼ���"));
	c.add(tf);
	c.add(new JScrollPane(ta));
	
	tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			ta.append(t.getText() + "\n");
			t.setText("");
		}
	});
	setSize(1200,1200);
	setVisible(true);
}

public static void main(String[] args) {
	new namecard();
}
}
//* commit�� �� ���ڱ� �ȵ��� 