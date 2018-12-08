package project;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pipersf extends JFrame{
	private JTextField tf = new JTextField(100);
	private JTextArea ta = new JTextArea(40, 100);
	final JFileChooser SaveAs = new JFileChooser();
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
	pipersf() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("파이퍼스 출석관리"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		c.add(new JPanel(){{add(new JButton(new AbstractAction("Save As") {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	           saveAs();
	        }
	     }));}}, BorderLayout.SOUTH);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");
			}
		});
		
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
	         new attendence();
	        }
	     }));}}, BorderLayout.SOUTH);
		
		//-------------------------------------
		//처음으로 가기 버튼 ----------------------------------------
		c.add(new JPanel(){{add(new JButton(new AbstractAction("처음으로 가기") {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	         dispose();
	         new party();
	        }
	     }));}}, BorderLayout.SOUTH);
		//-------------------------------------------------------------------------
		setSize(1200,1000);
		setVisible(true);
}
}