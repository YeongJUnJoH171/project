package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ���Ƹ� ��Ǯ�� ��ܰ��� �����⼮üũ  ..
public  class party extends JFrame {
	Container contentPane = getContentPane();
	Container c = getContentPane();
public static void main(String[] args) { //���� �޼ҵ� - ���α׷����� ���� 
	 new party(); 
}

    public party() {       /// �޴�â 
	setTitle("������б� �����Ǵ� ���α׷�");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	contentPane.setLayout(new BorderLayout(5,7));
	contentPane.add(new JButton("��Ǯ�̴� ���?"), BorderLayout.CENTER);
	contentPane.add(new JButton("�ܿ� ��ܰ���"), BorderLayout.WEST);
	contentPane.add(new JButton("���� �⼮�� "), BorderLayout.EAST);

	setSize(550,550);
	setVisible(true);
	
	MyMouseListener listener = new MyMouseListener();
	c.addMouseListener(listener);
	c.addMouseMotionListener(listener);
	
}
 
    
    class MyMouseListener extends MouseAdapter {
    	public void mouseClicked(MouseEvent e) {
    		JButton b = (JButton)e.getSource();
    		
    		if(b.getText() == "��Ǯ�̴� ���?") {
    			new afterparty();
    		}
    		else if(b.getText() == "�ܿ� ��ܰ���") {
    			new namecard();
    		}
    		else if(b.getText() == "���� �⼮�� ") {
    			new attendence();
    		}
    			
    	}
   	}

}


