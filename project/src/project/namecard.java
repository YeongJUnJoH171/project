package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class namecard extends JFrame{
	public void saveAs() {
		 final JFileChooser SaveAs = new JFileChooser();
	     SaveAs.setApproveButtonText("Save");
	     int actionDialog = SaveAs.showOpenDialog(this);
	     if (actionDialog != JFileChooser.APPROVE_OPTION) {
	        return;
	     }

	     File fileName = new File(SaveAs.getSelectedFile() + ".csv");
	     BufferedWriter outFile = null;
	     try {
	        outFile = new BufferedWriter(new FileWriter(fileName));

	        ta.write(outFile);   // *** here: ***

	     } catch (IOException ex) {
	        ex.printStackTrace();
	     } finally {
	        if (outFile != null) {
	           try {
	              outFile.close();
	           } catch (IOException e) {
	              // one of the few times that I think that it's OK
	              // to leave this blank
	           }
	        }
	     }
	  
	}
	private JTextField tf = new JTextField(40);
	private JTextArea ta = new JTextArea(40, 110);
public static void main(String[] args) {
	new namecard();
}
namecard(){
	setTitle("고려대학교 관현악단 명단관리");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	
	//악기선택 -----------------------------------------------------------------------------------------------------------
	c.add(new JLabel("악기를 선택하세요"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("바이올린") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("바이올린 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("비올라") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("비올라 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("첼로") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("첼로 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("콘트라 베이스") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("콘트라베이스 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("클라리넷") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 클라리넷 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("플룻") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 플룻 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("오보에") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("오보에 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("바순") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("바순 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("트럼펫") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 트럼펫 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("트럼본") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 트럼본 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("호른") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 호른 " + " ,  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("팀파니") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 팀파니 " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	//--------------------------학번----------------------------------------------------------------------------------
	c.add(new JLabel("학번을 선택해주세요"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("19학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("19학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("18학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 18학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("17학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("17학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("16학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("16학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("15학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("15학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("14학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("14학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("13학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("13학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("12학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("12학번" + ",  ");
       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("11학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("11학번" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	//-----------------------------------------------------------------------------------------------------------------
	
	c.add(new JLabel("이름/ 학과 / 전화번호 / 출신 중학교/ 출신 고등학교 /처음본 선배 이름 / 앞으로의 각오를 간단히  적어주세요 "));
	c.add(tf);
	tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			ta.append(t.getText() + ",  ");
			t.setText("");
		}
	});
	//----------------------------------------------------------------------------------------------------------------
	c.add(new JScrollPane(ta),BorderLayout.SOUTH);
	//-------------------------------------------------------------------------------줄바꾸기 / 여러사람을 동시에 받을 떄 
	c.add(new JPanel(){{add(new JButton(new AbstractAction("새로운 사람") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	ta.append("\n");

        }
     }));}}, BorderLayout.SOUTH);
	
	//초기화버튼--------------------------------------------------------------
		c.add(new JPanel(){{add(new JButton(new AbstractAction("초기화") {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	           
	        	   ta.setText(null);
	
	        }
	     }));}}, BorderLayout.SOUTH);
		//--------------------------------------------------------------------
	//뒤로가기버튼 --------------------------
	c.add(new JPanel(){{add(new JButton(new AbstractAction("뒤로가기") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
        dispose();
        new party();
       }
    }));}}, BorderLayout.SOUTH);
	
	//-------------------------------------저장버튼
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Save As") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          saveAs();
       }
    }));}}, BorderLayout.SOUTH);
	setSize(1300,1200);
	setVisible(true);
}
}