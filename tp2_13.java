package matrices;
import javax.swing.*;

public class tp2_13 extends JFrame {

    public tp2_13() {
        setTitle("2.13");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField horas = new JTextField(10);
        JTextField minutos = new JTextField(10);
        JTextField segundos = new JTextField(10);
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int h = Integer.parseInt(horas.getText());
                int m = Integer.parseInt(minutos.getText());
                int s = Integer.parseInt(segundos.getText());
                s++;
                               
                if (s>=60 || m>=60){
                    h++;
                    m=0;
                    s=0;
                   
                    
                     resultadoLabel.setText(h+" | "+m+" | "+s);
                }else {
                        resultadoLabel.setText(h+" | "+m+" | "+s);
                    }
                
                        
                        
                
                
                
              
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada inválida");
            }
        });

        JPanel inputPanel = new JPanel();
    
        inputPanel.add(new JLabel("ingrese la hora  :"));
        inputPanel.add(horas);
        
         inputPanel.add(new JLabel("minuto :"));
        inputPanel.add(minutos);
        
         inputPanel.add(new JLabel("segundo  :"));
        inputPanel.add(segundos);

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
            tp2_13 ejercicio = new tp2_13();
            ejercicio.setVisible(true);
        });
    }
}