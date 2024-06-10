
package matrices;
import javax.swing.*;
public class tp3_5 extends JFrame {
private int ma,mi,num=mi+1;
    public tp3_5() {
        setTitle("3.5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField max = new JTextField(10);
        JTextField min = new JTextField(10);
        JTextField numero = new JTextField(10);
        
        JButton submitButton = new JButton("Ingresar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            
            try {
               
                 ma = Integer.parseInt(max.getText());
                 mi = Integer.parseInt(min.getText());                
                
                resultadoLabel.setText("para terminar ingrese un numero que este dentro del raNGO");
                while (num<=mi && num>=ma){
                    num = Integer.parseInt(numero.getText());
                    resultadoLabel.setText("ingrese un numero");
                }
                resultadoLabel.setText("si esta dentro del rango. CHAU");

            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada invÃ¡lida.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introdusca el rango maximo :"));
        inputPanel.add(max);
        
        inputPanel.add(new JLabel("Introdusca el rango minimo :"));
        inputPanel.add(min);
        
        inputPanel.add(new JLabel("Introdusca un numero :"));
        inputPanel.add(numero);
        
        
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
            tp3_5 ejercicio = new tp3_5();
            ejercicio.setVisible(true);
        });
    }
}


