package project;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class attendence extends JFrame{
	
	public attendence() {
		setTitle("고려대학교 관현악단 출석체크");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton string = new JButton("현악기 모임 Mozart Chamber");
		JButton pipers = new JButton("    관악기 모임 Pipers");
		JButton pops = new JButton("    Ost 연주 소모임 Pops");
		JButton all = new JButton("    관현악단 전체 모임");
		
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
		c.add(new JPanel(){{add(new JButton(new AbstractAction("뒤로가기") {

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


