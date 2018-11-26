package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
// 동아리 뒤풀이 명단관리 연습출석체크  
public  class party extends JFrame  implements MouseListener,ActionListener{
	 JTable jTable;
	    JScrollPane pane;
	    JPanel pbtn;
	    JButton btnInsert;
	       
	Container contentPane = getContentPane();
	Container c = getContentPane();
public static void main(String[] args) { //메인 메소드 - 프로그래밍의 시작 
	 new party(); 
}

    public party() {  
    	 jTable = new JTable(model);
         pane = new JScrollPane(jTable);
         add(pane);
        
         pbtn = new JPanel();
         btnInsert = new JButton("회원가입");
         pbtn.add(btnInsert);
         add(pbtn,BorderLayout.NORTH);
        
        
         jTable.addMouseListener(this); //리스너 등록
         btnInsert.addActionListener(this); //회원가입버튼 리스너 등록
        
         setSize(600,200);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         
         
     //end 생성자                   /// 메뉴창 
	
	
}
    
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("아이디");
        col.add("비밀번호");
        col.add("이름");
        col.add("전화");
        col.add("주소");
        col.add("생일");
        col.add("직업");
        col.add("성별");
        col.add("이메일");
        col.add("자기소개");
       
        return col;
    }//getColumn
    
    
    public void namecard() { 
    	c.setLayout(null);
    	c.setLayout(new GridLayout(3,4));
    	setSize(550,550);
    	setVisible(true);
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
    		
    		if(b.getText() == "뒷풀이는 어디?") {
    			afterparty();
    		}
    		else if(b.getText() == "단원 명단관리") {
    			namecard();
    		}
    		else if(b.getText() == "연습 출석자 ") {
    			attendence();
    		}
    			
    	}
   	}

}


