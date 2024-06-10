package matrices;
import javax.swing.*;

public class tp2_14 extends JFrame {

    public tp2_14() {
        setTitle("2.14");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField numeroField = new JTextField(10);
        JTextField numeroField2 = new JTextField(10);
        JTextField numeroField3 = new JTextField(10);
        JButton submitButton = new JButton("Verificar");
        JLabel resultadoLabel = new JLabel();
        JLabel resultadoLabel1 = new JLabel();
        JLabel resultadoLabel2 = new JLabel();

        submitButton.addActionListener(e -> {
            try {
                int dia = Integer.parseInt(numeroField.getText());
                int mes = Integer.parseInt(numeroField2.getText());
                int año = Integer.parseInt(numeroField3.getText());
                int contador=0;
                if(dia>31||mes>12){
                      resultadoLabel.setText("La fecha es incorrecta");
                }else{
                  
                    if(dia>30 && mes==4 ||mes==6||mes==9||mes==11 ||mes>12){
                        resultadoLabel.setText("La fecha es incorrecta");
                    }else{
                        if(dia>28 &&mes==2||mes>12){
                            resultadoLabel.setText("La fecha es incorrecta");
                            ///////////////////////////////////////////////////
                        }else{
                            contador++;
                        }
                    }
                }
                if(contador==1){
                    
                    dia++;
                             if(dia==31||mes==12){
                                mes=1;
                                dia=1;
                                año++;
                                resultadoLabel.setText("Le fecha un dia despues es :"+dia+"/"+mes+"/"+año);
                            }else{
                  
                                if(dia==30 && mes==4 ||mes==6||mes==9||mes==11){
                                    mes++;
                                    dia=1;
                                    resultadoLabel.setText("Le fecha un dia despues es :"+dia+"/"+mes+"/"+año);
                                }else{
                                    if(dia>28 &&mes==2){
                                        mes++;
                                        dia=1;
                                        resultadoLabel.setText("Le fecha un dia despues es :"+dia+"/"+mes+"/"+año);
                                    }
                                }
                            }
                        
                }
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Introducilo con numeros :v");
            }
        });

        JPanel inputPanel = new JPanel();
        
        
        inputPanel.add(new JLabel("Introduce una fecha:"));
        inputPanel.add(numeroField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        
        inputPanel.add(new JLabel("Dia: "));
        inputPanel.add(numeroField);
        
        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);
        
        inputPanel.add(new JLabel("Mes: "));
        inputPanel.add(numeroField2);
        
        JPanel resultadoPanel1 = new JPanel();
        resultadoPanel.add(resultadoLabel1);
        
        inputPanel.add(new JLabel("Año: "));
        inputPanel.add(numeroField3);
        
        JPanel resultadoPanel2 = new JPanel();
        resultadoPanel.add(resultadoLabel2);

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
            tp2_14 ejercicio = new tp2_14();
            ejercicio.setVisible(true);
        });
    }
}
