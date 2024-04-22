package matrices;
import javax.swing.*;

public class tp1_7 extends JFrame {

    public tp1_7() {
        setTitle("Ejercicio 1.7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel promedio = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                float num = Float.parseFloat(inputField1.getText());
                num=Math.round(num);
                
                promedio.setText("El numero entero es: " +num);
               
            }finally{}
                
                
            
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese su numero decimal: "));
        panel.add(inputField1);
       
        panel.add(submitButton);
        panel.add(promedio);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_7 ejercicio = new tp1_7();
            ejercicio.setVisible(true);
        });
    }
}