package matrices;

import javax.swing.*;

public class tp2_9 extends JFrame {

    public tp2_9() {
        setTitle("2.8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroa = new JTextField(10);
        JButton submitButton = new JButton("probar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int contador=1;
                int num1 = Integer.parseInt(numeroa.getText());
                
                for(int i=0; num1>9;i++){
                    contador ++;
                    num1=(num1/10);
                    
                }
                
                resultadoLabel.setText("La cantidad de cifras que tiene es "+contador);
                
            } catch (NumberFormatException ex) {
                
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
                
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce el valor que tendra a :"));
        inputPanel.add(numeroa);
        
        
        
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
            tp2_9 ejercicio = new tp2_9();
            ejercicio.setVisible(true);
        });
    }
}
