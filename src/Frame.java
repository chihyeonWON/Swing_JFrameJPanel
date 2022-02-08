import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some text");
		JButton btn1 = new JButton("Click me");
		JTextArea textArea = new JTextArea();
		
		panel.setLayout(new BorderLayout());
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(btn1, BorderLayout.WEST);
		panel.add(textArea, BorderLayout.CENTER);
		
		frame.add(panel); // �����ӿ� �г��� �־���

		frame.setResizable(false); // ���α׷� ������ ���� ����
		frame.setVisible(true); // â�� ���̰� ����
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9); //���α׷� �⺻������ ����
		frame.setLocationRelativeTo(null); // ���α׷� �⺻ ��ġ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷��� ���� �� ���� �ǵ��� ����
	}
}