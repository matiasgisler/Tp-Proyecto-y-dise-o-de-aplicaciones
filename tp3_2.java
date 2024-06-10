package matrices;
import javax.swing.*;

public class tp3_2 extends JFrame {
private int suma=0,promedio=0,mayores=0,cont=0;
    public tp3_2() {
        setTitle("3.2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField edades = new JTextField(10);
        
        
        JButton submitButton = new JButton("Ingresar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            
            try {
                cont++;
                int edad = Integer.parseInt(edades.getText());
                
                while(edad>0){
                    
                    suma=suma+edad;
                    
                    if(edad >17){
                        
                        mayores++;
                        
                    }
                    
                    break;
                    

                    
                }
                
                    promedio=suma/cont;
                    resultadoLabel.setText("La suma de las edades es "+suma+", el promedio es "+promedio+" y los alumnos mayores son "+mayores);
                
                
                
                

            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada invÃ¡lida.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introdusca la edad de los alumnos y para finalizar un numero negativo :"));
        inputPanel.add(edades);
        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(resultadoPanel);

        add(mainPanel);
        pack(); 
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            tp3_2 ejercicio = new tp3_2();
            ejercicio.setVisible(true);
        });
    }
}

