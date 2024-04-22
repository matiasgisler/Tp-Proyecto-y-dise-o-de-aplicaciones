package matrices;
import javax.swing.*;

public class tp1_6 extends JFrame {

    public tp1_6() {
        setTitle("Ejercicio 1.6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        JTextField inputField3 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel promedio = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                int nota1 = Integer.parseInt(inputField1.getText());
                int nota2 = Integer.parseInt(inputField2.getText());
                int nota3 = Integer.parseInt(inputField3.getText());
                int resultado= (nota1+nota2+nota3)/3;
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
        panel.add(new JLabel("Ingrese la tercera nota: "));
        panel.add(inputField3);
       
        panel.add(submitButton);
        panel.add(promedio);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_6 ejercicio = new tp1_6();
            ejercicio.setVisible(true);
        });
    }
}