package matrices;
import javax.swing.*;

public class tp1_10 extends JFrame {

    public tp1_10() {
        setTitle("Ejercicio 1.10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        
        JButton submitButton = new JButton("Enviar");
        JLabel promedio = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                float radio = Float.parseFloat(inputField1.getText());
                double pi=3.14;
                double lado= (2*pi*radio);
                double area=(pi*(radio*radio));
                
                
                promedio.setText("su longitud es : " +lado+  " y su area es : "+area);
               
            } catch (NumberFormatException ex) {
                promedio.setText("Entrada invalida. Introduce un número válido.");  
                
            }
        });
        
        
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese el radio del circulo: "));
        panel.add(inputField1);
        
        
       
        panel.add(submitButton);
        panel.add(promedio);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_10 ejercicio = new tp1_10();
            ejercicio.setVisible(true);
        });
    }
}