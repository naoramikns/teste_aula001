package sistemalogin;

import javax.swing.*;

 

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

public class AlunoFrame extends JFrame {

 

    private JButton marcarPresencaButton;

 

    public AlunoFrame() {

        setTitle("Painel do Aluno");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 150);

        setLocationRelativeTo(null); // Centraliza a janela na tela

 

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

 

        marcarPresencaButton = new JButton("Marcar Presença");

 

        panel.add(marcarPresencaButton);

 

        add(panel);

 

        marcarPresencaButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                // Abrir janela para marcar presença

                MarcaPresencaFrame marcarPresencaFrame = new MarcaPresencaFrame();

                marcarPresencaFrame.setVisible(true);

            }

        });

    }

}

