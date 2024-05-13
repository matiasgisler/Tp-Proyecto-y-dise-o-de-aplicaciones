package matrices;
import javax.swing.*;

public class tp_ad_D  extends JFrame {

    public tp_ad_D() {
        setTitle("Ejercicio 1.D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
       JTextField inputField2 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel nacimiento1 = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(inputField1.getText());
                double pi=3.14;
                double volumen =(1.3333333)*pi*(radio*radio*radio);
                
                nacimiento1.setText("la hipotenusa es  : " +volumen);
               
            } catch (NumberFormatException ex) {
                nacimiento1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese la longitud del radio de la esfera; "));
        panel.add(inputField1);
        
      
        
       
        panel.add(submitButton);
        panel.add(nacimiento1);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_D ejercicio = new tp_ad_D();
            ejercicio.setVisible(true);
        });
    }
}
    