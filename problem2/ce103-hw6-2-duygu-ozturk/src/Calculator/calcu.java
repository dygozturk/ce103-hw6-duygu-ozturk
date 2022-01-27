package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;

public class calcu {

	private JFrame frmCalculator;
	private JTextField textField;
	
	
	double first;
	double second;
	double result;
	String operation;
	String answer; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcu window = new calcu();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\GiresuN\\Desktop\\ikon.png"));
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 865, 514);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(141, 21, 641, 53);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(32, 164, 99, 68);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(32, 242, 99, 68);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0 ) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(32, 320, 99, 68);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(141, 164, 99, 68);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(141, 242, 99, 68);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(141, 320, 99, 68);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(250, 164, 99, 68);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(248, 242, 99, 68);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(248, 320, 99, 68);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(32, 398, 99, 68);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String BackSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					BackSpace=str.toString();
					textField.setText(BackSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(32, 84, 98, 68);
		frmCalculator.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(141, 84, 99, 68);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);	
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(141, 398, 99, 68);
		frmCalculator.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(250, 84, 99, 68);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(359, 84, 99, 68);
		frmCalculator.getContentPane().add(btnMinus);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("*");
				operation="*";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplication.setBounds(359, 164, 99, 68);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(357, 242, 99, 68);
		frmCalculator.getContentPane().add(btnDivide);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(250, 398, 99, 68);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first * second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(357, 320, 99, 146);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setForeground(new Color(148, 0, 211));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(466, 426, 99, 40);
		frmCalculator.getContentPane().add(btnPercent);
		
		JButton btnSin = new JButton("S\u0130N");
		btnSin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sin(ops);
				textField.setText(String.valueOf(ops));
            }
			
		});
		btnSin.setForeground(Color.RED);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(466, 84, 98, 40);
		frmCalculator.getContentPane().add(btnSin);
		
		JButton btnCosArc = new JButton("COS-1");
		btnCosArc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.cosh(ops);
				textField.setText(String.valueOf(ops));
            
			}
		});
		btnCosArc.setForeground(Color.RED);
		btnCosArc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCosArc.setBounds(570, 134, 98, 40);
		frmCalculator.getContentPane().add(btnCosArc);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.cos(ops);
				textField.setText(String.valueOf(ops));
            
			}
		});
		btnCos.setForeground(Color.RED);
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCos.setBounds(466, 134, 98, 40);
		frmCalculator.getContentPane().add(btnCos);
		
		JButton btnSinArc = new JButton("S\u0130N-1");
		btnSinArc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sinh(ops);
				textField.setText(String.valueOf(ops));
            }
			
		});
		btnSinArc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSinArc.setForeground(Color.RED);
		btnSinArc.setBounds(570, 84, 98, 40);
		frmCalculator.getContentPane().add(btnSinArc);
		
		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.tan(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnTan.setForeground(Color.RED);
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan.setBounds(466, 184, 98, 40);
		frmCalculator.getContentPane().add(btnTan);
		
		JButton btnTanArc = new JButton("TAN-1");
		btnTanArc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.tanh(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnTanArc.setForeground(Color.RED);
		btnTanArc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTanArc.setBounds(570, 184, 98, 40);
		frmCalculator.getContentPane().add(btnTanArc);
		
		JButton btnLnx = new JButton("Ln x");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.log10(ops);
				textField.setText(String.valueOf(ops));
				
			}
		});
		btnLnx.setForeground(new Color(0, 128, 0));
		btnLnx.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLnx.setBounds(466, 234, 98, 40);
		frmCalculator.getContentPane().add(btnLnx);
		
		JButton btnLogx = new JButton("Log x");
		btnLogx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.log(ops);
				textField.setText(String.valueOf(ops));
            }
		});
		btnLogx.setForeground(new Color(0, 128, 0));
		btnLogx.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLogx.setBounds(570, 234, 98, 40);
		frmCalculator.getContentPane().add(btnLogx);
		
		JButton btn1dividex = new JButton("1 / x");
		btn1dividex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (1/ ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btn1dividex.setForeground(new Color(148, 0, 211));
		btn1dividex.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1dividex.setBounds(466, 335, 98, 40);
		frmCalculator.getContentPane().add(btn1dividex);
		
		JButton btnxy = new JButton("x^y");
		btnxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.pow(ops, ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnxy.setForeground(new Color(148, 0, 211));
		btnxy.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnxy.setBounds(570, 335, 98, 40);
		frmCalculator.getContentPane().add(btnxy);
		
		JButton btnxkare = new JButton("x^2");
		btnxkare.setForeground(new Color(148, 0, 211));
		btnxkare.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnxkare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops * ops);
				textField.setText(String.valueOf(ops));
				
			}
		});
		btnxkare.setBounds(466, 381, 98, 40);
		frmCalculator.getContentPane().add(btnxkare);
		
		JButton btnxküp = new JButton("x^3");
		btnxküp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops * ops* ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnxküp.setForeground(new Color(148, 0, 211));
		btnxküp.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnxküp.setBounds(570, 381, 98, 40);
		frmCalculator.getContentPane().add(btnxküp);
		
		JButton btnnPr = new JButton("nPr");
		btnnPr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("P");
				operation="P";
			}
		});
		btnnPr.setForeground(new Color(255, 165, 0));
		btnnPr.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnnPr.setBounds(466, 284, 98, 40);
		frmCalculator.getContentPane().add(btnnPr);
		
		JButton btnnCr = new JButton("nCr");
		btnnCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("C");
				operation="C";
			}
		});
		btnnCr.setForeground(new Color(255, 165, 0));
		btnnCr.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnnCr.setBounds(570, 284, 98, 40);
		frmCalculator.getContentPane().add(btnnCr);
		
		JButton btnAns = new JButton("Ans");
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first * second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
			    
			}
		});
		btnAns.setForeground(Color.BLUE);
		btnAns.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAns.setBounds(684, 397, 98, 68);
		frmCalculator.getContentPane().add(btnAns);
		
		
		
		
		JButton btnBracketClose = new JButton(")");
		btnBracketClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnBracketClose.getText();
				textField.setText(number);
			}
		});
		btnBracketClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBracketClose.setBounds(83, 21, 48, 53);
		frmCalculator.getContentPane().add(btnBracketClose);
		
		JButton btne = new JButton("e");
		btne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.E;
				textField.setText(String.valueOf(ops));
				
				
				
			}
		});
		btne.setFont(new Font("Tahoma", Font.BOLD, 18));
		btne.setBounds(684, 164, 98, 68);
		frmCalculator.getContentPane().add(btne);
		
		JButton btnPi = new JButton("Pl");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.PI;
				textField.setText(String.valueOf(ops));
			}
		});
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPi.setBounds(684, 242, 98, 68);
		frmCalculator.getContentPane().add(btnPi);
		
		JButton btnsqrt = new JButton("sqrt");
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = Math.sqrt(ops);
				textField.setText(String.valueOf(ops));
			}
		});
		btnsqrt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsqrt.setBounds(684, 320, 98, 68);
		frmCalculator.getContentPane().add(btnsqrt);
		
		JButton btnoff = new JButton("OFF");
		btnoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnoff.setForeground(new Color(128, 0, 0));
		btnoff.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnoff.setBounds(684, 84, 98, 68);
		frmCalculator.getContentPane().add(btnoff);
		
		JButton btnBracketOpen = new JButton("(");
		btnBracketOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnBracketOpen.getText();
				textField.setText(number);
			}
		});
		btnBracketOpen.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBracketOpen.setBounds(32, 21, 48, 53);
		frmCalculator.getContentPane().add(btnBracketOpen);
		
		JButton btnxfaktoriyel = new JButton("x!");
		btnxfaktoriyel.setForeground(new Color(148, 0, 211));
		btnxfaktoriyel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnxfaktoriyel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops =  Double.parseDouble(String.valueOf(textField.getText()));
		        int result = 1;
		        if (ops <= 1)
		            textField.setText("1");
		        else
		            for (int i=1; i<=ops; i++){
		                result = result*i;
		        }
		        textField.setText(String.valueOf(result));
			}
		});
		btnxfaktoriyel.setBounds(570, 425, 98, 41);
		frmCalculator.getContentPane().add(btnxfaktoriyel);
	}
}
