package project;

import javax.swing.*;//�� Ŀ���ϰ�ʹ�..
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class afterparty extends JFrame {
	private JTextArea ta = new JTextArea(20, 40);
	InputStreamReader in = new InputStreamReader(System.in);

	public afterparty() {
		setTitle("������б� �����Ǵ� ��Ǯ��!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel(
				"                                                 ��Ǯ�� �ο����� �����ϼ���                                          "));

		//------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("5�� ����") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						try {
							String textLine;
							FileReader br = new FileReader("1.txt");
							BufferedReader reader = new BufferedReader(br);
							while ((textLine = reader.readLine()) != null) {

								ta.read(reader, "ta");
							}
							br.close();
						} catch (IOException e) {
						}
				
					}
				}));
			}
		}, BorderLayout.NORTH);
		//---------------------------------------------------------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("5��~10��") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						try {
							String textLine;
							FileReader br = new FileReader("2.txt");
							BufferedReader reader = new BufferedReader(br);
							while ((textLine = reader.readLine()) != null) {

								ta.read(reader, "ta");
							}
							br.close();
						} catch (IOException e) {
						}
				
					}
				}));
			}
		}, BorderLayout.NORTH);
		//------------------------------------------------------------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("10�� ~15��") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						try {
							String textLine;
							FileReader br = new FileReader("3.txt");
							BufferedReader reader = new BufferedReader(br);
							while ((textLine = reader.readLine()) != null) {

								ta.read(reader, "ta");
							}
							br.close();
						} catch (IOException e) {
						}
				
					}
				}));
			}
		}, BorderLayout.NORTH);
		//-------------------------------------------------------------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("15��~25��") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						try {
							String textLine;
							FileReader br = new FileReader("4.txt");
							BufferedReader reader = new BufferedReader(br);
							while ((textLine = reader.readLine()) != null) {

								ta.read(reader, "ta");
							}
							br.close();
						} catch (IOException e) {
						}
				
					}
				}));
			}
		}, BorderLayout.NORTH);
		//--------------------------------------------------------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("25�� �̻�") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						try {
							String textLine;
							FileReader br = new FileReader("5.txt");
							BufferedReader reader = new BufferedReader(br);
							while ((textLine = reader.readLine()) != null) {

								ta.read(reader, "ta");
							}
							br.close();
						} catch (IOException e) {
						}
				
					}
				}));
			}
		}, BorderLayout.NORTH);
		// -------------------------------------------------

		c.add(new JScrollPane(ta));

		// �ʱ�ȭ��ư--------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("�ʱ�ȭ") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						ta.setText(null);

					}
				}));
			}
		}, BorderLayout.SOUTH);
		// --------------------------------------------------------------------

		// �ڷΰ����ư -------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("�ڷΰ���") {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						new party();
					}
				}));
			}
		}, BorderLayout.SOUTH);
		// -------------------------------------------------------------------

		setSize(500, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new afterparty();
	}

}
