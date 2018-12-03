package project;
import javax.swing.*;//아 커밋하고싶다..
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
public class afterparty extends JFrame {
	private JTextArea ta = new JTextArea(20, 40);
public afterparty() {
	setTitle("고려대학교 관현악단 뒷풀이!");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	c.add(new JLabel("                                                 뒤풀이 인원수를 선택하세요                                          "));

	
	//인원수 체크 및 뒤풀이 장소 추천 ---------------------------
	c.add(new JPanel(){{add(new JButton(new AbstractAction("5명 이하") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("술을 드시면 <춘차>, <박군포차>, <휘모리>, <유객주>, <신룽푸 마라탕>, <영철버거>, <서대문 꼼장어>, <찌개집>, <포차 어게인>, <바 라라 라디오> 추천드립니다 "
        	   		+ '\n'+"술을 드시지 않으면 <언니네 반점>, <용초수>, <찌개집>, <일품>, <소담식당> 추천드립니다"+'\n'+"인원이 적으니 n빵을 추천합니다"+'\n'+"사람은 적지만 재미있는 뒤풀이 되시길!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("5~10명") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("술을 드시면 <춘차>, <박군포차>, <휘모리>, <유객주>, <영철버거>, <서대문 꼼장어>, <찌개집>, <포차 어게인>,  추천드립니다 "
           	   		+ '\n'+"술을 드시지 않으면 <언니네 반점>, <찌개집>, <일품>, <소담식당> 추천드립니다"+'\n'+"인당 만원씩 걷고, 회장단과 섭외부도 돈을 내야 합니다"+'\n'+"술 너무 많이 마시지 말기!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("10~15명") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("술을 드시면 <춘차>, <휘모리>, <유객주>, <영철버거>, <포차 어게인>,  추천드립니다 "
              	   		+ '\n'+"술을 드시지 않으면 <언니네 반점>, <찌개집>, <일품>, <소담식당> 추천드립니다"+'\n'+"인당 만원씩 걷고  회장단과 섭외부는 돈을 내지 않습니다 비용이 부족하지 않도록 안주 조심해서 시키기"+'\n'+"술 너무 많이 마시지 말기!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("15명~25명") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("술을 드시면 <유객주>, <영철버거>, <포차 어게인>,  추천드립니다 "
              	   		+ '\n'+"술을 드시지 않으면 <언니네 반점>, <찌개집>, <일품>, <소담식당> 추천드립니다"+'\n'+"인당 만원씩 걷고 회장단과 섭외부는 돈을 내지 않아도 됩니다"+'\n'+"술 너무 많이 마시지 말기!");

        }
     }));}}, BorderLayout.NORTH);
	c.add(new JPanel(){{add(new JButton(new AbstractAction("25명 이상") {

        @Override
        public void actionPerformed(ActionEvent arg0) {
           
        	   ta.setText("진리 = 유객주!");

        }
     }));}}, BorderLayout.NORTH);
	//-------------------------------------------------
	
	c.add(new JScrollPane(ta));
	
	//초기화버튼--------------------------------------------------------------
			c.add(new JPanel(){{add(new JButton(new AbstractAction("초기화") {

		        @Override
		        public void actionPerformed(ActionEvent arg0) {
		           
		        	   ta.setText(null);
		
		        }
		     }));}}, BorderLayout.SOUTH);
			//--------------------------------------------------------------------
			
			
			
	//뒤로가기버튼 -------------------------------------------------------------
	c.add(new JPanel(){{add(new JButton(new AbstractAction("뒤로가기") {

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
