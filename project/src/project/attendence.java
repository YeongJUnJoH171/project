package project;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class attendence extends JFrame{
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
	public attendence() {
		setTitle("������б� �����Ǵ� ��ܰ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸� �й� ������ �����ּ���"));
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
		
		//�ʱ�ȭ��ư--------------------------------------------------------------
			c.add(new JPanel(){{add(new JButton(new AbstractAction("�ʱ�ȭ") {

		        @Override
		        public void actionPerformed(ActionEvent arg0) {
		           
		        	   ta.setText(null);
		
		        }
		     }));}}, BorderLayout.SOUTH);
			//--------------------------------------------------------------------
		//�ڷΰ����ư --------------------------
		c.add(new JPanel(){{add(new JButton(new AbstractAction("�ڷΰ���") {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	         dispose();
	         new party();
	        }
	     }));}}, BorderLayout.SOUTH);
		
		//-------------------------------------
		setSize(1200,1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		new attendence();
	}
	}


