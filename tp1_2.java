package matrices;
import javax.swing.*;

public class tp1_2 extends JFrame {

    public tp1_2() {
        setTitle("Ejercicio 1.2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel resultLabel = new JLabel("<-------");

        submitButton.addActionListener(e -> {
            try {
                int edad = Integer.parseInt(inputField.getText());
                edad++;
                resultLabel.setText("El año que viene tendras : " + edad);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Entrada inválida. Introduce un número válido.");
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("ingrese su edad: "));
        panel.add(inputField);
        panel.add(submitButton);
        panel.add(resultLabel);

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_2 ejercicio = new tp1_2();
            ejercicio.setVisible(true);
        });
    }
}

