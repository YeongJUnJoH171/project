package project;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
// 동아리 뒤풀이 명단관리 연습출석체크  
public class party extends JFrame {
	public static final Object CENTER = null;
	public static final Object WEST = null;
	public static final Object EAST = null;
	Container c = getContentPane();
	
public static void main(String[] args) { //메인 메소드 - 프로그래밍의 시작 
	 new party(); 
}

    public party() {                      /// 메뉴창 
	setTitle("고려대학교 관현악단 프로그램");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = getContentPane();
	contentPane.setLayout(new BorderLayout(5,7));
	contentPane.add(new JButton("뒷풀이는 어디?"), BorderLayout.CENTER);
	contentPane.add(new JButton("단원 명단관리"), BorderLayout.WEST);
	contentPane.add(new JButton("연습 출석자 "), BorderLayout.EAST);
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


