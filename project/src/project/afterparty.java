package project;
import javax.swing.*;//�� Ŀ���ϰ�ʹ�..
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class afterparty extends JFrame {
	private JTextArea ta = new JTextArea(20, 40);
public afterparty() {
	setTitle("������б� �����Ǵ� ��Ǯ��!");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(new JLabel("                                                 ��Ǯ�� �ο����� �����ϼ���                                          "));

	
	//�ο��� üũ �� ��Ǯ�� ��� ��õ ---------------------------
	c.add(new JPanel(){{add(new JButton(new AbstractAction("5�� ����") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("���� ��ø� <����>, <�ڱ�����>, <�ָ�>, <������>, <�ŷ�Ǫ ������>, <��ö����>, <���빮 �����>, <���>, <���� �����>, <�� ��� ����> ��õ�帳�ϴ� "
        	   		+ '\n'+"���� ����� ������ <��ϳ� ����>, <���ʼ�>, <���>, <��ǰ>, <�Ҵ�Ĵ�> ��õ�帳�ϴ�"+'\n'+"�ο��� ������ n���� ��õ�մϴ�"+'\n'+"����� ������ ����ִ� ��Ǯ�� �ǽñ�!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("5~10��") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("���� ��ø� <����>, <�ڱ�����>, <�ָ�>, <������>, <��ö����>, <���빮 �����>, <���>, <���� �����>,  ��õ�帳�ϴ� "
           	   		+ '\n'+"���� ����� ������ <��ϳ� ����>, <���>, <��ǰ>, <�Ҵ�Ĵ�> ��õ�帳�ϴ�"+'\n'+"�δ� ������ �Ȱ�, ȸ��ܰ� ���ܺε� ���� ���� �մϴ�"+'\n'+"�� �ʹ� ���� ������ ����!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("10~15��") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("���� ��ø� <����>, <�ָ�>, <������>, <��ö����>, <���� �����>,  ��õ�帳�ϴ� "
              	   		+ '\n'+"���� ����� ������ <��ϳ� ����>, <���>, <��ǰ>, <�Ҵ�Ĵ�> ��õ�帳�ϴ�"+'\n'+"�δ� ������ �Ȱ�  ȸ��ܰ� ���ܺδ� ���� ���� �ʽ��ϴ� ����� �������� �ʵ��� ���� �����ؼ� ��Ű��"+'\n'+"�� �ʹ� ���� ������ ����!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("15��~25��") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("���� ��ø� <������>, <��ö����>, <���� �����>,  ��õ�帳�ϴ� "
              	   		+ '\n'+"���� ����� ������ <��ϳ� ����>, <���>, <��ǰ>, <�Ҵ�Ĵ�> ��õ�帳�ϴ�"+'\n'+"�δ� ������ �Ȱ� ȸ��ܰ� ���ܺδ� ���� ���� �ʾƵ� �˴ϴ�"+'\n'+"�� �ʹ� ���� ������ ����!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("25�� �̻�") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("���� = ������!");

        }
     }));}}, BorderLayout.NORTH);
	//-------------------------------------------------
	
	c.add(new JScrollPane(ta));
	
	//�ʱ�ȭ��ư--------------------------------------------------------------
			c.add(new JPanel(){{add(new JButton(new AbstractAction("�ʱ�ȭ") {

		        @Override
		        public void actionPerformed(ActionEvent arg0) {
		           
		        	   ta.setText(null);
		
		        }
		     }));}}, BorderLayout.SOUTH);
			//--------------------------------------------------------------------
			
			
			
	//�ڷΰ����ư -------------------------------------------------------------
	c.add(new JPanel(){{add(new JButton(new AbstractAction("�ڷΰ���") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
         dispose();
         new party();
        }
     }));}}, BorderLayout.SOUTH);
    // -------------------------------------------------------------------
	
	
	
	setSize(500,600);
	setVisible(true);
}

public static void main(String[] args) {
	new afterparty();
}

}
