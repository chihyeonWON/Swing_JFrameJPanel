import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //���α׷� �⺻������ ����
		frame.setLocationRelativeTo(null); // ���α׷� �⺻ ��ġ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷��� ���� �� ���� �ǵ��� ����
	}
}