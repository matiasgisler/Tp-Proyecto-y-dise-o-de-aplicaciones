package matrices;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class tp_ad_H  extends JFrame {

    public tp_ad_H() {
        setTitle("Ejercicio 1.F");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        JTextField inputField3 = new JTextField(10);
      
        JButton submitButton = new JButton("Enviar");
        JLabel ja = new JLabel("<-------");
        

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int dia = Integer.parseInt(inputField1.getText());
                    int mes = Integer.parseInt(inputField2.getText());
                    int año = Integer.parseInt(inputField3.getText());
                    
                    int resultado= dia+mes+año;
                    
                    
                    
                    int num1 = (resultado%10);
                    int num2 = (resultado/10)%10;
                    int num3 = (resultado/100)%10;
                    int num4 = (resultado/1000);
                    int resultadofinal = num1+num2+num3+num4;
                    ja.setText("Tu numero de la suerte es: "+resultadofinal);
                    
                    
                } catch (NumberFormatException ex) {
                    ja.setText("Entrada invalida. Introduce un número válido.");
                    
                }
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese tu dia de cumpleaños: "));
        panel.add(inputField1);
        
        panel.add(new JLabel("Ingrese tu mes de cumppleaños: "));
        panel.add(inputField2);
        
        panel.add(new JLabel("Ingrese tu año de cumpleaños: "));
        panel.add(inputField3);
        panel.add(submitButton);
        panel.add(ja);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp_ad_H ejercicio = new tp_ad_H();
            ejercicio.setVisible(true);
        });
    }
}