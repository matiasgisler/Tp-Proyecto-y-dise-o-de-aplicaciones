package matrices;
import javax.swing.*;

public class tp2_15 extends JFrame {

    public tp2_15() {
        setTitle("2.15");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroField = new JTextField(10);
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numeroField.getText());
                
                if(num<=7 && num>=1){
                    switch(num){
                        case 1: resultadoLabel.setText("lunes");
                        break;
                        case 2: resultadoLabel.setText("martes");
                        break;
                        case 3: resultadoLabel.setText("miercoles");
                        break;
                        case 4: resultadoLabel.setText("jueves");
                        break;
                        case 5: resultadoLabel.setText("viernes");
                        break;
                        case 6: resultadoLabel.setText("sabado");
                        break;
                        case 7: resultadoLabel.setText("domingo");
                        break;
                    }
                }else {
                    resultadoLabel.setText("ingrese un numero entre 1 y 7 ");
                }
                
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. ingrese un nnmero enre 1 y 7.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce un numero para mostrar el dia:"));
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
            tp2_15 ejercicio = new tp2_15();
            ejercicio.setVisible(true);
        });
    }
}

