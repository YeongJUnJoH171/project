package project;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class attendence extends JFrame{
	
	public attendence() {
		setTitle("������б� �����Ǵ� �⼮üũ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton string = new JButton("���Ǳ� ���� Mozart Chamber");
		JButton pipers = new JButton("    ���Ǳ� ���� Pipers");
		JButton pops = new JButton("    Ost ���� �Ҹ��� Pops");
		JButton all = new JButton("    �����Ǵ� ��ü ����");
		
		c.add(string);
		c.add(pipers);
		c.add(pops);
		c.add(all);
		setSize(800,200);
	    setVisible(true);
		string.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			 new stringf();
			}
		});
		pipers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			 new pipersf();
			}
		});
		pops.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			 new popsf();
			}
		});
		all.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			 new allf();
			}
		});
		c.add(new JPanel(){{add(new JButton(new AbstractAction("�ڷΰ���") {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	         dispose();
	         new party();
	        }
	     }));}}, BorderLayout.SOUTH);
	}
	

	public static void main(String[] args) {
		new attendence();
	}
	}


