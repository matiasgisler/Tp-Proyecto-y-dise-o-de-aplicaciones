package matrices;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class tp_ad_F  extends JFrame {

    public tp_ad_F() {
        setTitle("Ejercicio 1.F");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
      
        JButton submitButton = new JButton("Enviar");
        JLabel ja = new JLabel("<-------");
        

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField1.getText());
                    
                    
                    int num1 = (num%10);
                    int num2 = (num/10)%10;
                    int num3 = (num/100);
                    ja.setText("el numero es   : " +num3+" | "+num2+" | "+num1);
                    
                } catch (NumberFormatException ex) {
                    ja.setText("Entrada invalida. Introduce un número válido.");
                    
                }
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("ingrese un numerode 3 sifras: "));
        panel.add(inputField1);
       
        panel.add(submitButton);
        panel.add(ja);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_F ejercicio = new tp_ad_F();
            ejercicio.setVisible(true);
        });
    }
}