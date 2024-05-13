package matrices; 
import javax.swing.*;
public class tp2_7 extends JFrame {

    public tp2_7() {
        setTitle("2.7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numero1 = new JTextField(10);
        JTextField numero2 = new JTextField(10);
        JTextField numero3 = new JTextField(10);
        JButton submitButton = new JButton("probar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int num3 = Integer.parseInt(numero3.getText());

                if (num1 > num2 && num1>num3) {
                    if(num2> num3){
                        resultadoLabel.setText("el orden decendiente seria  "+num1+" / "+num2+"/"+num3+"/");
                    }else{if(num3>num2){
                        resultadoLabel.setText("el orden decendiente seria  "+num1+" / "+num3+"/"+num2+"/");
                    }
                        
                    }
                } else {
                   if (num2 > num1 && num2>num3) {
                    if(num1> num3){
                        resultadoLabel.setText("el orden decendiente seria  "+num2+" / "+num1+"/"+num3+"/");
                    }else{if(num2>num1){
                        resultadoLabel.setText("el orden decendiente seria  "+num2+" / "+num3+"/"+num1+"/");
                    }
                        
                    }
                }else{
                       if (num3 > num2 && num3>num1) {
                    if(num1> num2){
                        resultadoLabel.setText("el orden decendiente seria  "+num3+" / "+num1+"/"+num2+"/");
                    }else{if(num2>num1){
                        resultadoLabel.setText("el orden decendiente seria  "+num3+" / "+num2+"/"+num1+"/");
                    }
                        
                    }
                }
                   }
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida. Introduce un número entero.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce tres numeros diferentes:"));
        inputPanel.add(numero1);
        inputPanel.add(numero2);
        inputPanel.add(numero3);

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
            tp2_7 ejercicio = new tp2_7();
            ejercicio.setVisible(true);
        });
    }
}