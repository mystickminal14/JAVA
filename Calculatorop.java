package day2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*	 ;
public class Calculatorop{
	public static void main(String[]args) {
		
		JFrame frame = new JFrame("Calculator");
		frame.setSize(450,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JLabel l1 = new JLabel("Number 1: ");
		l1.setBounds(25, 100, 100, 25);
		frame.add(l1);
		JTextField t1 = new JTextField(10);
		t1.setBounds(100, 100, 100, 25);
		frame.add(t1);
		JLabel l2 = new JLabel("Number 2: ");
		l2.setBounds(25, 150, 100, 25);
		frame.add(l2);
		JTextField t2 = new JTextField(10);
		t2.setBounds(100, 150, 100, 25);
		frame.add(t2);
		JButton b1 = new JButton("ADD");
		b1.setBounds(25, 200, 100, 25);
		frame.add(b1);
		JButton b2 = new JButton("SUBTRACT");
		b2.setBounds(150, 200, 100, 25);
		frame.add(b2);
		JButton b3 = new JButton("MULTIPLY");
		b3.setBounds(275, 200, 100, 25);
		frame.add(b3);
		JButton b4 = new JButton("DIVIDE");
		b4.setBounds(400, 200, 100, 25);
		frame.add(b4);
		JLabel r = new JLabel("          ");
		r.setBounds(200,250,900,200);
		r.setForeground(Color.black);
		r.setFont(new Font("Arial", Font.BOLD,20));
		frame.add(r); 
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cal) {
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				int sum = n1+ n2;
				r.setText("Sum:" +sum);}});
		b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent cal) {
						int n1=Integer.parseInt(t1.getText());
						int n2=Integer.parseInt(t2.getText());
						int s = n1-n2;
						r.setText("Subtract:"+s);}});
		b3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent cal) {
								int n1=Integer.parseInt(t1.getText());
								int n2=Integer.parseInt(t2.getText());
								int m = n1* n2;
								r.setText("Multiplication: "+m);}});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent cal) {
				double n1=Integer.parseInt(t1.getText());
				double n2=Integer.parseInt(t2.getText());
				double d=n1/n2;
				r.setText("Divide:"+d);}});
		JButton c1 = new JButton("CLEAR");
		c1.setBounds(75,250, 100, 25);
		frame.add(c1);
		c1.addActionListener (new ActionListener () {
			 public void actionPerformed (ActionEvent e) {
				 if (e.getSource() == c1) {
			        t1.setText("");
			        t2.setText("");}}});
		JButton c2= new JButton("CLOSE");
		c2.setBounds(325, 250, 100, 25);
		frame.add(c2);
		c2.addActionListener (new ActionListener () {
			 public void actionPerformed (ActionEvent e) {
			  System.exit(0);
			 }});
	}

}
