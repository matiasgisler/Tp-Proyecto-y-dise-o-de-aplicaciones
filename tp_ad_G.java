package matrices;
import javax.swing.*;

public class tp_ad_G  extends JFrame {

    public tp_ad_G() {
        setTitle("Ejercicio 1.G");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel numero1 = new JLabel("<-------");
        JLabel numero2 = new JLabel("");
        JLabel numero = new JLabel("");
        JLabel numero3 = new JLabel("");
        JLabel numero4 = new JLabel("");
        

        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField1.getText());
                int num1=num/10;
                int num2= num1/10;
                int num3= num2/10;
                int num4= num3/10;
                numero2.setText(""+num );
                numero4.setText(""+num4 );
                numero3.setText(""+num3 );
                numero.setText(""+num2 );
                numero1.setText(""+num1 );
                
            } catch (NumberFormatException ex) {
                numero1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese un numero de 5 cifras; "));
        panel.add(inputField1);
        
      
        
       
        panel.add(submitButton);
        panel.add(numero2);
        panel.add(numero1);
        panel.add(numero);
        panel.add(numero3);
        panel.add(numero4);
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_G ejercicio = new tp_ad_G();
            ejercicio.setVisible(true);
        });
    }
}