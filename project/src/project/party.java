package project;
import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

// ���Ƹ� ��Ǯ�� 
public class party extends JFrame {
public static void main(String[] args) {
	int studnum;
	int a = 10000; 
	int b = 5000; 
	
	menuscreen(); 
	
}

public void menuscreen() {
	setTitle("������б� �����Ǵ� ��Ǯ�� ���α׷�");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = getContentPane();
	
	contentPane.setLayout(new BorderLayout(5,7));
	
	contentPane.add(new JButton("North"), BorderLayout.NORTH);
	contentPane.add(new JButton("Center"), BorderLayout.CENTER);
	contentPane.add(new JButton("West"), BorderLayout.WEST);
	contentPane.add(new JButton("East"), BorderLayout.EAST);
	contentPane.add(new JButton("South"), BorderLayout.SOUTH);
	
	setSize(400,200);
	setVisible(true);
	
}
}
