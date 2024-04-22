package matrices;
import javax.swing.*;

public class tp1_3 extends JFrame {

    public tp1_3() {
        setTitle("Ejercicio 1.3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel nacimiento1 = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
                int nacimiento = Integer.parseInt(inputField1.getText());
                int año = Integer.parseInt(inputField2.getText());
                int resultado= año-nacimiento;
                nacimiento1.setText("usted tiene : " +resultado);
               
            } catch (NumberFormatException ex) {
                nacimiento1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
     
      

        JPanel panel = new JPanel();
        panel.add(new JLabel("ingrese el año que nacio: "));
        panel.add(inputField1);
        panel.add(new JLabel("ingrese el año actual: "));
        panel.add(inputField2);
        
       
        panel.add(submitButton);
        panel.add(nacimiento1);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_3 ejercicio = new tp1_3();
            ejercicio.setVisible(true);
        });
    }
}
    