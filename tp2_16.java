package matrices;
import javax.swing.*;

public class tp2_16 extends JFrame {

    public tp2_16() {
        setTitle("2.16");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroField = new JTextField(10);
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();
        JLabel resultadoLabel1 = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numeroField.getText());
                resultadoLabel1.setText("");
                resultadoLabel.setText("");
                int unidades=0;
                int decenas=0;
                unidades=num/10;
                decenas=num%10;
                
                switch (decenas)
                {
                    case 1:
                        resultadoLabel1.setText("Uno");
                        break;
                    case 2:
                        resultadoLabel1.setText("Dos");
                        break;
                    case 3:
                        resultadoLabel1.setText("Tres");
                        break;
                    case 4:
                        resultadoLabel1.setText("Cuatro");
                        break;
                    case 5:
                        resultadoLabel1.setText("Cinco");
                        break;
                    case 6:
                        resultadoLabel1.setText("Seis");
                        break;
                    case 7:
                        resultadoLabel1.setText("Siete");
                        break;
                    case 8:
                        resultadoLabel1.setText("Ocho");
                        break;
                    case 9:
                        resultadoLabel1.setText("Nueve");
                        break;
                }
                switch (num){
                    case 10:
                        resultadoLabel1.setText("Diez");
                        break;
                    case 11:
                        resultadoLabel1.setText("Once");
                        break;
                    case 12:
                        resultadoLabel1.setText("Doce");
                        break;
                    case 13:
                        resultadoLabel1.setText("Trece");
                        break;
                    case 14:
                        resultadoLabel1.setText("Catorce");
                        break;
                    case 15:
                        resultadoLabel1.setText("Quince"); 
                        break;
                }
                
                if(num>15){
                    switch (unidades){
                        case 1:
                            resultadoLabel.setText("dieci ");
                            break;
                        case 2:
                            resultadoLabel.setText("veinti ");
                            break;
                        case 3:
                            resultadoLabel.setText("treinti ");
                            break;
                        case 4:
                            resultadoLabel.setText("cuarenti ");
                            break;
                        case 5:
                            resultadoLabel.setText("cincuenti ");
                            break;
                        case 6:
                            resultadoLabel.setText("sesenti ");
                            break;
                        case 7:
                            resultadoLabel.setText("sesenti ");
                            break;
                        case 8:
                            resultadoLabel.setText("ochenti ");
                            break;
                        case 9:
                            resultadoLabel.setText("noventi ");
                            break;     
                    }
                }
                
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Entrada invÃ¡lida. ingrese un nnmero enre 1 y 7.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Introduce un numero entre 1 y 99"));
        inputPanel.add(numeroField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);

        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);
        
        JPanel resultadoPanel1 = new JPanel();
        resultadoPanel1.add(resultadoLabel1);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(resultadoPanel);
        mainPanel.add(resultadoPanel1);
        add(mainPanel);
        pack(); 
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            tp2_16 ejercicio = new tp2_16();
            ejercicio.setVisible(true);
        });
    }
}