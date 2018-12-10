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

	     File fileName = new File(SaveAs.getSelectedFile() + ".txt");
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
	private JTextField tf = new JTextField(100);
	private JTextArea ta = new JTextArea(40, 100);
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
          
       	ta.append("악기는 바이올린 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("비올라") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 비올라 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("첼로") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 첼로 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("콘트라 베이스") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 콘트라베이스 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("클라리넷") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 클라리넷 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("플룻") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 플룻 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("오보에") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 오보에 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("바순") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 바순 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("트럼펫") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 트럼펫 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("트럼본") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 트럼본 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("호른") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 호른 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("팀파니") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("악기는 팀파니 입니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	//--------------------------학번----------------------------------------------------------------------------------
	c.add(new JLabel("학번을 선택해주세요"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("19학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 19 새내기들을 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("18학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 18 인재들 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("17학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 17 인재를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("16학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 16 인재를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("15학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 15 선배를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("14학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 14 선배를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("13학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 13 선배를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("12학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 12 선배를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("11학번") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("고대 오케스트라에 들어오신 11 선배를 환영합니다" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	//-----------------------------------------------------------------------------------------------------------------
	
	c.add(new JLabel("이름/ 학과 / 전화번호 / 출신 중학교/ 출신 고등학교 를 적어주세요 "));
	c.add(tf);
	tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			ta.append(t.getText() + "\n");
			t.setText("");
		}
	});
	//----------------------------------------------------------------------------------------------------------------
	c.add(new JScrollPane(ta),BorderLayout.SOUTH);
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