import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Programa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);
        panel.add(textField);

        for (int i = 1; i <= 6; i++) {
            JButton button = new JButton("Botão " + i);
            button.addActionListener(e -> textField.setText("Você pressionou o Botão " + i));
            panel.add(button);
        }
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}