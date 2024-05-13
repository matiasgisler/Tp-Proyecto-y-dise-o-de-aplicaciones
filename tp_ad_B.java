package matrices;
import javax.swing.*;

public class tp_ad_B  extends JFrame {

    public tp_ad_B() {
        setTitle("Ejercicio 1.B");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
       
        JButton submitButton = new JButton("Enviar");
        JLabel nacimiento1 = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                double km = Float.parseFloat(inputField1.getText());
                
                double ms = (km/3.6);
                nacimiento1.setText("En metros por segundo : " +ms);
               
            } catch (NumberFormatException ex) {
                nacimiento1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese los kilometros por hora: "));
        panel.add(inputField1);
        
       
        panel.add(submitButton);
        panel.add(nacimiento1);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_B ejercicio = new tp_ad_B();
            ejercicio.setVisible(true);
        });
    }
}
    