package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 동아리 뒤풀이 명단관리 연습출석체크  ..
public  class party extends JFrame {
	Container contentPane = getContentPane();
	Container c = getContentPane();
	JButton b1 = new JButton("뒷풀이는 어디?");
	JButton b2 = new JButton("단원 명단관리");
	JButton b3 = new JButton("연습 출석자 ");
	
public static void main(String[] args) { //메인 메소드 - 프로그래밍의 시작 
	 new party(); 
}

    public party() {       /// 메뉴창 
	setTitle("고려대학교 관현악단 프로그램");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	contentPane.setLayout(new BorderLayout(5,7));
	contentPane.add(b1, BorderLayout.CENTER);
	contentPane.add(b2, BorderLayout.WEST);
	contentPane.add(b3, BorderLayout.EAST);

	setSize(550,550);
	setVisible(true);
	
    
    b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new afterparty();
		}
	});
    b2.addActionListener(new ActionListener() {
  		public void actionPerformed(ActionEvent e) {
  			new namecard();
  		}
  	});
    b3.addActionListener(new ActionListener() {
  		public void actionPerformed(ActionEvent e) {
  			new attendence();
  		}
  	});

}


}