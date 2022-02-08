import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		
		panel.setLayout(new BorderLayout());
		
		panel.add(label, BorderLayout.NORTH);
		
		frame.add(panel); // 프레임에 패널을 넣어줌

		frame.setResizable(false); // 프로그램 사이즈 변경 금지
		frame.setVisible(true); // 창을 보이게 해줌
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //프로그램 기본사이즈 설정
		frame.setLocationRelativeTo(null); // 프로그램 기본 위치 해제
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램을 껐을 때 종료 되도록 설정
	}
}