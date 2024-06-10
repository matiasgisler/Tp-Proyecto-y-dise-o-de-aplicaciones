package matrices;
import javax.swing.*;

public class tp3_4 extends JFrame {
        
    public tp3_4() {
        setTitle("3.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField num = new JTextField(10);
        JButton submitButton = new JButton("Ingresar ");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            
            try {
                int n = Integer.parseInt(num.getText());
                
                for(int i=0;i<=n;i++){
                    resultadoLabel.setText(""+i);
                    i++;  
                    break;
                }
                
                
                
                
    
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada invÃ¡lida.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("adivine el numero y si se rinde ingrese un  numero negativo :"));
        inputPanel.add(num);
        
        
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
            tp3_4 ejercicio = new tp3_4();
            ejercicio.setVisible(true);
        });
    }
}

