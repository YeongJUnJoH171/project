package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class namecard extends JFrame{
private JTextField tf = new JTextField(100);
private JTextArea ta = new JTextArea(40, 100);

public namecard() {
	setTitle("고려대학교 관현악단 명단관리");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(new JLabel("이름/학번/학과/악기/전화번호/출신 중학교/출신 고등학교/간단한 각오 순으로 적고 느낌표(!)를 적은 뒤 <Enter> 키를 입력하세요"));
	c.add(tf);
	c.add(new JScrollPane(ta));
	
	tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField)e.getSource();
			ta.append(t.getText() + "\n");
			t.setText("");
		}
	});
	setSize(1200,1200);
	setVisible(true);
}

public static void main(String[] args) {
	new namecard();
}
}
//* commit이 왜 갑자기 안되지 ??..