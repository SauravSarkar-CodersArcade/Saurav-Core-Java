package JavaSwings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculatorGUI {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame implements ActionListener {
    JTextField t1;
    JTextField t2;
    JButton b1;
    JLabel l1;
    JLabel l2;
    public Addition(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Calculate");
        l1 = new JLabel("Sum");
        l2 = new JLabel("Product");

        add(t1);
        add(t2);
        add(b1);
        add(l1);
        add(l2);

        b1.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int value = num1 + num2;
        int pro = num1 * num2;
        l1.setText(value + " ");
        l2.setText(pro + " ");
    }
}
