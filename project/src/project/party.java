package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ���Ƹ� ��Ǯ�� ��ܰ��� �����⼮üũ  ..
public  class party extends JFrame {
	Container contentPane = getContentPane();
	Container c = getContentPane();
	JButton b1 = new JButton("��Ǯ�̴� ���?");
	JButton b2 = new JButton("�ܿ� ��ܰ���");
	JButton b3 = new JButton("���� �⼮�� ");
	
public static void main(String[] args) { //���� �޼ҵ� - ���α׷����� ���� 
	 new party(); 
}

    public party() {       /// �޴�â 
	setTitle("������б� �����Ǵ� ���α׷�");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	contentPane.setLayout(new BorderLayout(5,7));
	contentPane.add(b1, BorderLayout.CENTER);
	contentPane.add(b2, BorderLayout.WEST);
	contentPane.add(b3, BorderLayout.EAST);

	setSize(550,550);
	setVisible(true);
	
    
    b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			new afterparty();
		}
	});
    b2.addActionListener(new ActionListener() {
  		public void actionPerformed(ActionEvent e) {
  			dispose();
  			new namecard();
  		}
  	});
    b3.addActionListener(new ActionListener() {
  		public void actionPerformed(ActionEvent e) {
  			dispose();
  			new attendence();
  		}
  	});

}


}