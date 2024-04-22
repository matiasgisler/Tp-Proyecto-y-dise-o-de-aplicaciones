package matrices;
import javax.swing.*;

public class tp1_9 extends JFrame {

    public tp1_9() {
        setTitle("Ejercicio 1.9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JTextField manzana1 = new JTextField(10);
        JTextField manzana2 = new JTextField(10);
        JTextField manzana3 = new JTextField(10);
        JTextField manzana4 = new JTextField(10);
        JTextField pera1 = new JTextField(10);
        JTextField pera2 = new JTextField(10);
        JTextField pera3 = new JTextField(10);
        JTextField pera4 = new JTextField(10);
        
        
        JTextField preciom = new JTextField(10);
        JTextField preciop = new JTextField(10);
        
        JButton submitButton = new JButton("Enviar");
        JLabel uno = new JLabel("manzanas");
        JLabel dos = new JLabel("peras");
        

        submitButton.addActionListener(e -> {
            try {
             
                
                float per1 = Float.parseFloat(pera1.getText());
                float per2 = Float.parseFloat(pera2.getText());
                float per3 = Float.parseFloat(pera3.getText());
                float per4 = Float.parseFloat(pera4.getText());
                float kilop = Float.parseFloat(preciop.getText());
               
                float resultado2=(float)((per1+per2+per3+per4)*kilop);
             
                dos.setText("El total de peras es: " +resultado2);
                
               
            } catch (NumberFormatException ex) {
                uno.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
        
         submitButton.addActionListener(e -> {
            try {
                float man1 = Float.parseFloat(manzana1.getText());
                float man2 = Float.parseFloat(manzana2.getText());
                float man3 = Float.parseFloat(manzana3.getText());
                float man4 = Float.parseFloat(manzana4.getText());
                float kilom = Float.parseFloat(preciom.getText());
                
                float resultado1=(float)((man1+man2+man3+man4)*kilom) ;
               
                uno.setText("El total de manzanas es: " +resultado1);
               
                
               
            } catch (NumberFormatException ex) {
                uno.setText("Entrada invalida. Introduce un número válido.");
                
            }
        });
                
             
        JPanel panel = new JPanel();
         
        panel.add(new JLabel("Ingrese el precio del kilo de manzanas :  "));
        panel.add(preciom);
        panel.add(new JLabel("Ingrese el precio de kilo de poeras :  "));
        panel.add(preciop);

        
        
        
        
        panel.add(new JLabel(" ------1ro trimestre          : "));
        
        panel.add(new JLabel("Ingrese los kilos vendidos de manzanas  "));
        panel.add(manzana1);
        panel.add(new JLabel("Ingrese los kilos vendidos de peras  "));
        panel.add(pera1);
    
        panel.add(new JLabel(" ------2do trimestre          : "));
       
        panel.add(new JLabel("Ingrese los kilos vendidos de manzanas  "));
        panel.add(manzana2);
        panel.add(new JLabel("Ingrese los kilos vendidos de  "));
        panel.add(pera2);
        
        
        panel.add(new JLabel(" ------3er trimestre          : "));
       
        panel.add(new JLabel("Ingrese los kilos vendidos de manzanas  "));
        panel.add(manzana3);
        panel.add(new JLabel("Ingrese los kilos vendidos de peras  "));
        panel.add(pera3);
        
        
        panel.add(new JLabel(" ------4to trimestre          : "));
        
        panel.add(new JLabel("Ingrese los kilos vendidos de manzanas  "));
        panel.add(manzana4);
        panel.add(new JLabel("Ingrese los kilos vendidos de peras  "));
        panel.add(pera4);
       
       
        panel.add(submitButton);
        panel.add(uno);
        panel.add(dos);
        
      
       
        add(panel);
        pack();
    
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           tp1_9 ejercicio = new tp1_9();
            ejercicio.setVisible(true);
        });
    }
}