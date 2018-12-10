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
	setTitle("������б� �����Ǵ� ��ܰ���");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	
	//�Ǳ⼱�� -----------------------------------------------------------------------------------------------------------
	c.add(new JLabel("�Ǳ⸦ �����ϼ���"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("���̿ø�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("���̿ø� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("��ö�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��ö� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("ÿ��") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("ÿ�� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("��Ʈ�� ���̽�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��Ʈ���̽� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Ŭ�󸮳�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" Ŭ�󸮳� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("�÷�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" �÷� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("������") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("������ " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("�ټ�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�ټ� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Ʈ����") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" Ʈ���� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Ʈ����") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" Ʈ���� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("ȣ��") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" ȣ�� " + " ,  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("���Ĵ�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" ���Ĵ� " + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	//--------------------------�й�----------------------------------------------------------------------------------
	c.add(new JLabel("�й��� �������ּ���"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("19�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("19�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("18�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append(" 18�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("17�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("17�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("16�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("16�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("15�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("15�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("14�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("14�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("13�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("13�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("12�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("12�й�" + ",  ");
       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("11�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("11�й�" + ",  ");

       }
    }));}}, BorderLayout.NORTH);
	//-----------------------------------------------------------------------------------------------------------------
	
	c.add(new JLabel("�̸�/ �а� / ��ȭ��ȣ / ��� ���б�/ ��� ����б� /ó���� ���� �̸� / �������� ������ ������  �����ּ��� "));
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
	//-------------------------------------------------------------------------------�ٹٲٱ� / ��������� ���ÿ� ���� �� 
	c.add(new JPanel(){{add(new JButton(new AbstractAction("���ο� ���") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	ta.append("\n");

        }
     }));}}, BorderLayout.SOUTH);
	
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
	
	//-------------------------------------�����ư
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