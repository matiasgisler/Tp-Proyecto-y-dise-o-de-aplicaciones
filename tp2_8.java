package matrices;

import javax.swing.*;

public class tp2_8 extends JFrame {

    public tp2_8() {
        setTitle("2.8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroa = new JTextField(10);
        JTextField numerob = new JTextField(10);
        JTextField numeroc = new JTextField(10);
        JButton submitButton = new JButton("probar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                float a = Float.parseFloat(numeroa.getText());
                float b = Float.parseFloat(numerob.getText());
                float c = Float.parseFloat(numeroc.getText());
                
                     
                double X1 = ((b * -1 ) + (Math.sqrt((b * b) - 4 * a * c))) / (2 * a);
                double X2 = ((b * -1 ) - (Math.sqrt((b * b) - 4 * a * c))) / (2 * a);
                double va = (Math.sqrt((b * b) - 4 * a * c)); 
                
                if(va>=0){
                    resultadoLabel.setText("X1 = " + X1 + " / X2 = " + X2 );
                }else {
                     resultadoLabel.setText("la raiz no es real ");
                }
                

            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce el valor que tendra a :"));
        JPanel inputPane2 = new JPanel();
        inputPanel.add(numeroa);
        inputPanel.add(new JLabel("Introduce el valor que tendra b :"));
        JPanel inputPane3 = new JPanel();
        inputPanel.add(numerob);
        inputPanel.add(new JLabel("Introduce el valor que tendra c :"));
        inputPanel.add(numeroc);

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
            tp2_8 ejercicio = new tp2_8();
            ejercicio.setVisible(true);
        });
    }
}
