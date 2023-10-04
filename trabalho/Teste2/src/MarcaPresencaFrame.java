package sistemalogin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcaPresencaFrame extends JFrame {

    private JCheckBox compareceuCheckbox;
    private JButton marcarButton;

    public MarcaPresencaFrame() {
        setTitle("Marcar Presença");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        compareceuCheckbox = new JCheckBox("Compareceu");
        marcarButton = new JButton("Marcar");

        panel.add(compareceuCheckbox);
        panel.add(marcarButton);

        add(panel);

        marcarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificar se o aluno compareceu
                boolean compareceu = compareceuCheckbox.isSelected();

                if (compareceu) {
                    // Lógica para marcar a presença
                    JOptionPane.showMessageDialog(MarcaPresencaFrame.this, "Presença marcada com sucesso",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Lógica para marcar a falta
                    JOptionPane.showMessageDialog(MarcaPresencaFrame.this, "Falta marcada com sucesso",
                            "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }

                // Fechar a janela de marcação de presença
                dispose();
            }
        });
    }
}
