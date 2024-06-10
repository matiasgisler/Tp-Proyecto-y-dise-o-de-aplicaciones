package matrices;
import javax.swing.*;

public class tp3_3 extends JFrame {
private int n=1;
        int r = (int) (Math.random() * 100) + 1;
    public tp3_3() {
        setTitle("3.3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField num = new JTextField(10);
        JButton submitButton = new JButton("Ingresar ");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            
            try {
                
                             
                
                
                while (n>0){
                    n = Integer.parseInt(num.getText());
                    if (n==r){
                        resultadoLabel.setText("adivinaste");
                        }else{
                            if (n<r){
                            resultadoLabel.setText("el numero  a adivinar es mayor ");
                        }else {
                            resultadoLabel.setText("el numero  a adivinar es menor ");
                    }
                    }
                    
                    break;
                }
                resultadoLabel.setText("te rendiste");
                
                
    
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
            tp3_3 ejercicio = new tp3_3();
            ejercicio.setVisible(true);
        });
    }
}

