import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public calculator() {
        setTitle("Sum Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());

        JLabel num1Label = new JLabel("Number 1:");
        contentPane.add(num1Label);

        num1Field = new JTextField(10);
        contentPane.add(num1Field);

        JLabel num2Label = new JLabel("Number 2:");
        contentPane.add(num2Label);

        num2Field = new JTextField(10);
        contentPane.add(num2Field);

        JButton calculateButton = new JButton("sum");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int sum = num1 + num2;
                resultLabel.setText("The sum is: " + sum);
            }
        });
        contentPane.add(calculateButton);

        resultLabel = new JLabel("Enter two numbers and press sum");
        contentPane.add(resultLabel);

        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        calculator calculator = new calculator();
        calculator.setVisible(true);
    }
}
