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
	setTitle("������б� �����Ǵ� ��ܰ���");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	
	//�Ǳ⼱�� -----------------------------------------------------------------------------------------------------------
	c.add(new JLabel("�Ǳ⸦ �����ϼ���"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("���̿ø�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ���̿ø� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("��ö�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ��ö� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("ÿ��") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ÿ�� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("��Ʈ�� ���̽�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ��Ʈ���̽� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Ŭ�󸮳�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� Ŭ�󸮳� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("�÷�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� �÷� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("������") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ������ �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("�ټ�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� �ټ� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Ʈ����") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� Ʈ���� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("Ʈ����") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� Ʈ���� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("ȣ��") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ȣ�� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("���Ĵ�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("�Ǳ�� ���Ĵ� �Դϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	//--------------------------�й�----------------------------------------------------------------------------------
	c.add(new JLabel("�й��� �������ּ���"));
	c.add(new JPanel(){{add(new JButton(new AbstractAction("19�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 19 ��������� ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("18�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 18 ����� ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("17�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 17 ���縦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	
	c.add(new JPanel(){{add(new JButton(new AbstractAction("16�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 16 ���縦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("15�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 15 ���踦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("14�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 14 ���踦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("13�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 13 ���踦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("12�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 12 ���踦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("11�й�") {

       @Override
       public void actionPerformed(ActionEvent arg0) {
          
       	ta.append("��� ���ɽ�Ʈ�� ������ 11 ���踦 ȯ���մϴ�" + "\n");

       }
    }));}}, BorderLayout.NORTH);
	//-----------------------------------------------------------------------------------------------------------------
	
	c.add(new JLabel("�̸�/ �а� / ��ȭ��ȣ / ��� ���б�/ ��� ����б� �� �����ּ��� "));
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