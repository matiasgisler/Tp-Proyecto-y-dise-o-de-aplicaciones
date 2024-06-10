package matrices;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tp3_4 extends JFrame {

    private JTextField inputField;
    private JTextArea outputArea;
    private int sumaEdades = 0;
    private int contadorAlumnos = 0;
    private int contadorMayorEdad = 0;

    public tp3_4() {
        setTitle("Ejercicio 3_4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(10);
        JButton submitButton = new JButton("Introduzca un numero");
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(inputField.getText());

                    for (int i=0;i<=numero;i++) {
                         outputArea.append("-" +i);
                        }

                } catch (NumberFormatException ex) {
                    outputArea.append("Error: Introduce una edad válida\n\n");
                    inputField.setText("");
                }
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Numero:"));
        inputPanel.add(inputField);
        inputPanel.add(submitButton);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(inputPanel);
        mainPanel.add(scrollPane);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            tp3_4 ejercicio = new tp3_4();
            ejercicio.setVisible(true);
        });
    }
}