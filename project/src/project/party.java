package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ���Ƹ� ��Ǯ�� ��ܰ��� �����⼮üũ  ..
public  class party extends JFrame {
	
	Container c = getContentPane();
	ImageIcon icon1 = new ImageIcon("namecard.jpg");
	ImageIcon icon2 = new ImageIcon("attendence.jpg");
	ImageIcon icon3 = new ImageIcon("afterparty.jpg");
	JButton b1 = new JButton("��Ǯ�̴� ���?", icon3);
	JButton b2 = new JButton("�ܿ� ��ܰ���", icon1);
	JButton b3 = new JButton("���� �⼮�� ", icon2);
	
public static void main(String[] args) { //���� �޼ҵ� - ���α׷����� ���� 
	 new party(); 
}

    public party() {       /// �޴�â 
	setTitle("������б� �����Ǵ� ���α׷�");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	c.setLayout(new BorderLayout(5,7));
	
	c.add(b1 ,BorderLayout.CENTER);
	c.add(b2 ,BorderLayout.WEST);
	c.add(b3 ,BorderLayout.EAST);

	setSize(1500,550);
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