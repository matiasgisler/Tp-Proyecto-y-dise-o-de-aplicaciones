package matrices; 
import javax.swing.*;
public class tp2_6 extends JFrame {

    public tp2_6() {
        setTitle("2.6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numero1 = new JTextField(10);
        JTextField numero2 = new JTextField(10);
        JButton submitButton = new JButton("probar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());

                if (num1 > num2) {
                    resultadoLabel.setText("el orden decendiente seria  "+num1+" . "+num2);
                } else {
                    resultadoLabel.setText("el orden decendiente seria  "+num2+" . "+num1);
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce dos numeros diferentes:"));
        inputPanel.add(numero1);
        inputPanel.add(numero2);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(resultadoPanel);

        add(mainPanel);
        pack(); // Ajustar el tamaño de la ventana automáticamente
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            tp2_6 ejercicio = new tp2_6();
            ejercicio.setVisible(true);
        });
    }
}