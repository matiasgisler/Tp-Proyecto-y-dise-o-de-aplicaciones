package matrices;
import javax.swing.*;

public class tp2_1 extends JFrame {

    public tp2_1() {
        setTitle("2.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroField = new JTextField(10);
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numeroField.getText());

                if (num % 2 == 0) {
                    resultadoLabel.setText("El número " + num + " es Par.");
                } else {
                    resultadoLabel.setText("El número " + num + " es Impar.");
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce un número entero:"));
        inputPanel.add(numeroField);

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
            tp2_1 ejercicio = new tp2_1();
            ejercicio.setVisible(true);
        });
    }
}