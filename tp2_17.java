package matrices;
import javax.swing.*;

public class tp2_17 extends JFrame {

    public tp2_17() {
        setTitle("2.17");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField comidadiaria = new JTextField(10);
        JTextField numanimales = new JTextField(10);
        JTextField mediadekilos = new JTextField(10);
        
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                float CD = Float.parseFloat(comidadiaria.getText());
                float NA = Float.parseFloat(numanimales.getText());
                float MK = Float.parseFloat(mediadekilos.getText());
                int resultado1=0;
                
                if(CD>0 && CD<1){
                    
                    resultado1 =(int)  (CD / MK);
                    
                }else{
                    
                    resultado1 =(int)   (CD / MK);  
                    
                }
                
                if(resultado1>=NA){
                    resultadoLabel.setText("si se puede alimentar a  "+resultado1+ " animales" );
                     }else {
                    float resultado2 = (float) (CD / NA);
                    resultadoLabel.setText("no alacanza, asi que para suministrar cada animal debe comer  una cantidad de : "+resultado2+" kilos");
                }
                
              
                

            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada invÃ¡lida.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introdusca la cantidad de alimentos diarios :"));
        inputPanel.add(comidadiaria);
        
        inputPanel.add(new JLabel("Introdusca la media de kilos que comen :"));
        inputPanel.add(mediadekilos);
        
        inputPanel.add(new JLabel("Introdusca la cantidad de animales a alimentar :"));
        inputPanel.add(numanimales);
        
        

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
            tp2_17 ejercicio = new tp2_17();
            ejercicio.setVisible(true);
        });
    }
}

