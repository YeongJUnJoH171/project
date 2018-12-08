package project;

import javax.swing.*;//아 커밋하고싶다..
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
		setTitle("고려대학교 관현악단 뒷풀이!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel(
				"                                                 뒤풀이 인원수를 선택하세요                                          "));

		//------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("5명 이하") {

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
				add(new JButton(new AbstractAction("5명~10명") {

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
				add(new JButton(new AbstractAction("10명 ~15명") {

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
				add(new JButton(new AbstractAction("15명~25명") {

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
				add(new JButton(new AbstractAction("25명 이상") {

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

		// 초기화버튼--------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("초기화") {

					@Override
					public void actionPerformed(ActionEvent arg0) {

						ta.setText(null);

					}
				}));
			}
		}, BorderLayout.SOUTH);
		// --------------------------------------------------------------------

		// 뒤로가기버튼 -------------------------------------------------------------
		c.add(new JPanel() {
			{
				add(new JButton(new AbstractAction("뒤로가기") {

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
