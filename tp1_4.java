package matrices;
import javax.swing.*;

public class tp1_4 extends JFrame {

    public tp1_4() {
        setTitle("Ejercicio 1.4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField1 = new JTextField(10);
        JButton submitButton = new JButton("Enviar");
        JLabel nacimiento1 = new JLabel("<-------");
        

        submitButton.addActionListener(e -> {
            try {
               short num = Short.parseShort(inputField1.getText());
               
               short num1=(short) (num-1);
               short num2=(short) (num+1);
                nacimiento1.setText(""+num1+" |-+-+-+-+-+-+-+-+-+-+-+-+-| "+num2);
               
            } catch (NumberFormatException ex) {
                nacimiento1.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingrese un numero "));
        panel.add(inputField1);
        
       
        panel.add(submitButton);
        panel.add(nacimiento1);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_4 ejercicio = new tp1_4();
            ejercicio.setVisible(true);
        });
    }
}