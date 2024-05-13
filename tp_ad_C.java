package matrices;
import javax.swing.*;

public class tp_ad_C  extends JFrame {

    public tp_ad_C() {
        setTitle("Ejercicio 1.C");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
       JTextField inputField2 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel nacimiento1 = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                float x = Float.parseFloat(inputField1.getText());
                float y = Float.parseFloat(inputField2.getText());
                
                float h = (float) (x*x)+(y*y);
                nacimiento1.setText("la hipotenusa es  : " +h);
               
            } catch (NumberFormatException ex) {
                nacimiento1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("ingrese el cateto en el eje x : "));
        panel.add(inputField1);
        
        panel.add(new JLabel("ingrese el cateto en el eje y : "));
        panel.add(inputField2);
        
       
        panel.add(submitButton);
        panel.add(nacimiento1);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_C ejercicio = new tp_ad_C();
            ejercicio.setVisible(true);
        });
    }
}
    