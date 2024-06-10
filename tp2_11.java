package matrices;
import javax.swing.*;

public class tp2_11 extends JFrame {

    public tp2_11() {
        setTitle("2.11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroField = new JTextField(10);
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numeroField.getText());

                if (num <= 4) {
                    resultadoLabel.setText("su nota es insuficiente ");
                } else {
                    if (num==5){
                        resultadoLabel.setText("su nota es suficiente ");
                    } else {
                        if (num==6){
                            resultadoLabel.setText("su nota esta bien ");
                        }else {
                            if (num==7 || num==8){
                                 resultadoLabel.setText("su nota es notable ");
                                     }else{
                                        if (num==9 || num==10){
                                            resultadoLabel.setText("su nota es sobresaliente ");
                                 }
                            }
                        }
                    }                   
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. ingrese una nota entre  y 10.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce una nota para evaluar :"));
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
        pack(); 
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            tp2_11 ejercicio = new tp2_11();
            ejercicio.setVisible(true);
        });
    }
}
