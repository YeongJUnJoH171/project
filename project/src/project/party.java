package project;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
// ���Ƹ� ��Ǯ�� ��ܰ��� �����⼮üũ  
public class party extends JFrame {
	public static final Object CENTER = null;
	public static final Object WEST = null;
	public static final Object EAST = null;
	Container c = getContentPane();
	
public static void main(String[] args) { //���� �޼ҵ� - ���α׷����� ���� 
	 new party(); 
}

    public party() {                      /// �޴�â 
	setTitle("������б� �����Ǵ� ���α׷�");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = getContentPane();
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
    public void namecard() { 
    	c.setLayout(null);
    
     }
    
    public void afterparty(){
    	
    	c.setLayout(null);
    }
    
    public void attendence() {
    	c.setLayout(null);
    	
    }
    
    class MyMouseListener extends MouseAdapter {
    	public void mouseClicked(MouseEvent e) {
    		JButton b = (JButton)e.getSource();
    		if(b.equals(CENTER)) {
    			afterparty();
    		}
    		else if(b.equals(WEST)) {
    			namecard();
    		}
    		else if(b.equals(EAST)) {
    			attendence();
    		}
    			
    	}
   	}

}


