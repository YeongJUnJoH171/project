package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 동아리 뒤풀이 명단관리 연습출석체크  ..
public  class party extends JFrame {
	
	Container c = getContentPane();
	ImageIcon icon1 = new ImageIcon("namecard.jpg");
	ImageIcon icon2 = new ImageIcon("attendence.jpg");
	ImageIcon icon3 = new ImageIcon("afterparty.jpg");
	JButton b1 = new JButton("뒷풀이는 어디?", icon3);
	JButton b2 = new JButton("단원 명단관리", icon1);
	JButton b3 = new JButton("연습 출석자 ", icon2);
	
public static void main(String[] args) { //메인 메소드 - 프로그래밍의 시작 
	 new party(); 
}

    public party() {       /// 메뉴창 
	setTitle("고려대학교 관현악단 프로그램");
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