package matrices;
import javax.swing.*;

public class tp_ad_A  extends JFrame {

    public tp_ad_A() {
        setTitle("Ejercicio 1.A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
       
        JButton submitButton = new JButton("Enviar");
        JLabel nacimiento1 = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                float c = Float.parseFloat(inputField1.getText());
                
                float f = 32+(9*c/5);
                nacimiento1.setText("en fahrenheit : " +f);
               
            } catch (NumberFormatException ex) {
                nacimiento1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("ingrese los grados centigrados: "));
        panel.add(inputField1);
        
       
        panel.add(submitButton);
        panel.add(nacimiento1);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_A ejercicio = new tp_ad_A();
            ejercicio.setVisible(true);
        });
    }
}
    