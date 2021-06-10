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
        String[] operands = textField.getText().split("\\+");
        int sum = Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]);
        textField.setText(String.valueOf(sum));

    }
}
