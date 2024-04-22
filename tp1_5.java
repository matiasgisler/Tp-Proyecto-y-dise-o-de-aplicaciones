package matrices;
import javax.swing.*;

public class tp1_5 extends JFrame {

    public tp1_5() {
        setTitle("Ejercicio 1.5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel promedio = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                int nota1 = Integer.parseInt(inputField1.getText());
                int nota2 = Integer.parseInt(inputField2.getText());
                int resultado= (nota1+nota2)/2;
                promedio.setText("El promedio es: " +resultado);
               
            } catch (NumberFormatException ex) {
                promedio.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese la primera nota: "));
        panel.add(inputField1);
        panel.add(new JLabel("Ingrese la segunda nota: "));
        panel.add(inputField2);
        
       
        panel.add(submitButton);
        panel.add(promedio);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_5 ejercicio = new tp1_5();
            ejercicio.setVisible(true);
        });
    }
}