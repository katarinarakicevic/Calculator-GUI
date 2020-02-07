package rs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private double x;
	private double y;
	private String mark;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setResizable(false);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setBackground(new Color(176, 224, 230));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(3, 79, 334, -68);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		textArea.setBounds(41, 22, 271, 46);
		contentPane.add(textArea);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s =textArea.getText();
				textArea.setText(s+"1");
			}
		});
		button.setBounds(41, 91, 56, 46);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"2");
			}
		});
		button_1.setBounds(116, 91, 56, 46);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"3");
			}
		});
		button_2.setBounds(182, 91, 56, 46);
		contentPane.add(button_2);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"4");
			}
		});
		btnNewButton.setBounds(41, 163, 56, 46);
		contentPane.add(btnNewButton);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"5");
			}
		});
		button_3.setBounds(116, 163, 56, 46);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"6");
			}
		});
		button_4.setBounds(182, 163, 56, 46);
		contentPane.add(button_4);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"7");
			}
		});
		btnNewButton_1.setBounds(41, 231, 56, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"8");
			}
		});
		btnNewButton_2.setBounds(116, 230, 56, 47);
		contentPane.add(btnNewButton_2);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"9");
			}
		});
		button_5.setBounds(182, 231, 56, 46);
		contentPane.add(button_5);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+"0");
			}
		});
		btnNewButton_3.setBounds(41, 309, 137, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(",");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s =textArea.getText();
				textArea.setText(s+",");
			}
		});
		btnNewButton_4.setBounds(188, 309, 56, 40);
		contentPane.add(btnNewButton_4);
		
		JButton button_6 = new JButton("/");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a =textArea.getText();
				mark="/";
				x= Double.parseDouble(a);
				textArea.setText(a+"/\n");
			}
		});
		button_6.setBounds(274, 91, 47, 46);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a =textArea.getText();
				mark="*";
				x= Double.parseDouble(a);
				textArea.setText(a+"*\n");
			}
		});
		button_7.setBounds(274, 163, 47, 46);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("+");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a =textArea.getText();
				mark="+";
				x= Double.parseDouble(a);
				textArea.setText(a+"+\n");
			}
		});
		button_8.setBounds(274, 231, 47, 46);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a =textArea.getText();
				mark="-";
				x= Double.parseDouble(a);
				textArea.setText(a+"-\n");
			}
		});
		button_9.setBounds(274, 309, 47, 40);
		contentPane.add(button_9);
		
		JButton btnNewButton_5 = new JButton("=");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b= textArea.getText();
				int d=b.length();
				int i=b.indexOf(mark);
				String c =b.substring(i+1,d);
				y= Double.parseDouble(c);
				switch (mark) {
				case "+":
					double sum = x+y;
					textArea.setText(""+sum);
					break;
				case "-":
					double difference = x-y;
					textArea.setText(""+difference);
					break;
				case "*":
					double multiplication = x*y;
					textArea.setText(""+multiplication);
					break;
				case "/":
					double division = x/y;
					textArea.setText(""+division);
					break;
				}
			}
		});
		btnNewButton_5.setBounds(41, 360, 200, 45);
		contentPane.add(btnNewButton_5);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mark="";
				textArea.setText("");
				x=0;
				y=0;
			}
		});
		btnC.setBounds(348, 22, 56, 46);
		contentPane.add(btnC);
	}
}
