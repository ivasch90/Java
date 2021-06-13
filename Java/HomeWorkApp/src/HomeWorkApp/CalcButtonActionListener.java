package HomeWorkApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {
    private final JTextField textField;

    public CalcButtonActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int plus = textField.getText().indexOf('+');
        int minus = textField.getText().indexOf('-');
        int div = textField.getText().indexOf('/');
        int multi = textField.getText().indexOf('*');
        int square = textField.getText().indexOf("square");

        if (plus >= 0) {
            String[] operands = textField.getText().split("\\+");
            int sum = 0;
            for (int i = 0; i < operands.length; i++) {
                sum += Integer.parseInt(operands[i]);
            }
            textField.setText(String.valueOf(sum));
        }
        else if (minus >= 0) {
        String[] operands = textField.getText().split("\\-");
        int min = Integer.parseInt(operands[0]);

            for (int i = 1; i < operands.length; i++) {
                min -= Integer.parseInt(operands[i]);

            }
            textField.setText(String.valueOf(min));
        }
        else if (div >= 0) {
            String[] operands = textField.getText().split("\\/");
            int division = Integer.parseInt(operands[0]);

            for (int i = 1; i < operands.length; i++) {
                division /= Integer.parseInt(operands[i]);

            }
            textField.setText(String.valueOf(division));
        }
        else if (multi >= 0) {
            String[] operands = textField.getText().split("\\*");
            int mul = Integer.parseInt(operands[0]);

            for (int i = 1; i < operands.length; i++) {
                mul *= Integer.parseInt(operands[i]);

            }
            textField.setText(String.valueOf(mul));
        }
        else if (square >= 0) {
            String operand = textField.getText().substring(6);
            int tmp = Integer.parseInt(operand);
            double sq = Math.sqrt(tmp);

            textField.setText(String.valueOf(sq));
        }
    }
}
