package calculadora.buttons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CalculadoraButtons extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final JTextComponent txtDisplay = null;
	private JPanel contentPane;
	private JTextField textDisplay;
	
	String operations;
	String answer;
	double firstnum;
	double secondnum;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		//=====================================================================================
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			
		}catch(Exception e){
			//JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
		
		//========================================================================================
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraButtons frame = new CalculadoraButtons();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraButtons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 21));
		textDisplay.setBounds(10, 11, 248, 46);
		contentPane.add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "V";
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 78, 60, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "%";
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(72, 78, 60, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnBS = new JButton("\uF0D5");
		btnBS.setBackground(Color.WHITE);
		btnBS.setIcon(new ImageIcon(""));
		btnBS.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			String backspace=null;
			
			if(textDisplay.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textDisplay.getText());
				strB.deleteCharAt(textDisplay.getText().length() - 1);
				backspace = strB.toString();
				textDisplay.setText(backspace);
			}
			}
		});
		
		btnBS.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBS.setBounds(195, 78, 60, 60);
		contentPane.add(btnBS);
		
		JButton btnNewButton_2 = new JButton("\u0421");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textDisplay.setText(null);
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(133, 78, 60, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBackground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 138, 60, 60);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(72, 138, 60, 60);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(133, 138, 60, 60);
		contentPane.add(btn9);
		
		JButton btnNewButton_1_1_1 = new JButton("X");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "x";
			}
		});
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(195, 138, 60, 60);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 198, 60, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(72, 198, 60, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(133, 198, 60, 60);
		contentPane.add(btn6);
		
		JButton btnNewButton_1_1_2 = new JButton("\u00F7");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
			}
		});
		btnNewButton_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1_1_2.setBounds(195, 198, 60, 60);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 258, 60, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(72, 258, 60, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
			
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(133, 258, 60, 60);
		contentPane.add(btn3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
			}
		});
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(195, 258, 60, 60);
		contentPane.add(btnAdd);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(72, 318, 60, 60);
		contentPane.add(btn0);
		
		JButton btnNewButton_1_1_3_1 = new JButton("=");
		btnNewButton_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(textDisplay.getText());
				
			
				
				
				
				if(operations == "+")
				{
					
				    result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					
				}
				
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if(operations == "x")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}
		});
		btnNewButton_1_1_3_1.setBackground(Color.WHITE);
		btnNewButton_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_3_1.setBounds(195, 318, 60, 60);
		contentPane.add(btnNewButton_1_1_3_1);
		
		JButton btnNewButton_2_3_1 = new JButton("\u2212");
		btnNewButton_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		btnNewButton_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_3_1.setBounds(133, 318, 60, 60);
		contentPane.add(btnNewButton_2_3_1);
		
		JButton btnDot = new JButton("\u2219");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(EnterNumber);
				
				if(! textDisplay.getText().contains(".")) {
					}
				textDisplay.setText(textDisplay.getText() + btnDot.getText());;
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(11, 318, 60, 60);
		contentPane.add(btnDot);
	}
}
