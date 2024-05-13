package matrices;
import javax.swing.*;
public class tp2_5 extends JFrame {

    public tp2_5() {
        setTitle("2.5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numero1 = new JTextField(10);
        JButton submitButton = new JButton("probar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                float num1 = Float.parseFloat(numero1.getText());
                

                if (num1==0){
                    resultadoLabel.setText("El numero es cero ");
                }else{
                    if(num1 <1 && num1>-1){
                        resultadoLabel.setText("El numero es casi cero ");
                    }else{
                        resultadoLabel.setText("El numero NO es casi cero");
                    }
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("introduce un numero:"));
        inputPanel.add(numero1);

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
            tp2_5 ejercicio = new tp2_5();
            ejercicio.setVisible(true);
        });
    }
}