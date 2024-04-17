import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorFrame extends JFrame {

    private JTextField textField1, textField2;

    public ColorFrame() {
        super("Color Frame");

        // Create components
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        JButton button = new JButton("Check Text");

        // Set layout
        setLayout(new GridLayout(3, 1));

        // Add components
        add(textField1);
        add(textField2);
        add(button);

        // Add button listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField1.getText();
                String text2 = textField2.getText();

                if (text1.equals(text2)) {
                    getContentPane().setBackground(Color.GREEN);
                } else {
                    getContentPane().setBackground(Color.RED);
                }
            }
        });

        // Set default size and visibility
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}
