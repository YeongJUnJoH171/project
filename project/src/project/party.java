package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
// ���Ƹ� ��Ǯ�� ��ܰ��� �����⼮üũ  
public  class party extends JFrame  implements MouseListener,ActionListener{
	 JTable jTable;
	    JScrollPane pane;
	    JPanel pbtn;
	    JButton btnInsert;
	       
	Container contentPane = getContentPane();
	Container c = getContentPane();
public static void main(String[] args) { //���� �޼ҵ� - ���α׷����� ���� 
	 new party(); 
}

    public party() {  
    	 jTable = new JTable(model);
         pane = new JScrollPane(jTable);
         add(pane);
        
         pbtn = new JPanel();
         btnInsert = new JButton("ȸ������");
         pbtn.add(btnInsert);
         add(pbtn,BorderLayout.NORTH);
        
        
         jTable.addMouseListener(this); //������ ���
         btnInsert.addActionListener(this); //ȸ�����Թ�ư ������ ���
        
         setSize(600,200);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         
         
     //end ������                   /// �޴�â 
	
	
}
    
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("���̵�");
        col.add("��й�ȣ");
        col.add("�̸�");
        col.add("��ȭ");
        col.add("�ּ�");
        col.add("����");
        col.add("����");
        col.add("����");
        col.add("�̸���");
        col.add("�ڱ�Ұ�");
       
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
    		
    		if(b.getText() == "��Ǯ�̴� ���?") {
    			afterparty();
    		}
    		else if(b.getText() == "�ܿ� ��ܰ���") {
    			namecard();
    		}
    		else if(b.getText() == "���� �⼮�� ") {
    			attendence();
    		}
    			
    	}
   	}

}


