
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FizzBuzz implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton button;
    JLabel label;
    JTextField textField;
    JTextField textFieldResult;

    void Fizzbuzz() {
        frame = new JFrame("FizzBuzz");

        label = new JLabel();
        label.setText("Enter a number ");
        label.setBounds(100, 100, 100, 100);

        textField = new JTextField();
        textField.setBounds(200, 150, 150, 30);

        textFieldResult = new JTextField();
        textFieldResult.setBounds(200, 300, 200, 50);
        textFieldResult.setEditable(false);

        button = new JButton("RESULT");
        button.addActionListener(this);
        button.setBounds(200, 200, 200, 50);

        frame.add(label);
        frame.add(textField);
        frame.add(textFieldResult);
        frame.add(button);

        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        String result = textField.getText();
        int number = Integer.parseInt(result);
        String answer = "";
        if (e.getSource() == button) {

            if (number % 3 == 0 && number % 5 == 0) {
                answer = "FIZZBUZZ !!";
            } else if (number % 3 == 0) {
                answer = "BUZZ !!";

            } else if (number % 5 == 0) {
                answer = "FIZZ !!";
            } else if (number % 3 != 0 && number % 5 != 0) {
                System.out.println(number);

            }
            textFieldResult.setText(answer);
        }

    }

    public static void main(String[] args) {
        new FizzBuzz().Fizzbuzz();
    }

}