package sistemalogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoordenadorFrame extends JFrame {
    private Coordenador coordenador;

    public CoordenadorFrame() {
        coordenador = new Coordenador();

        setTitle("Painel do Coordenador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton criarEventoButton = new JButton("Criar Evento");
        JButton listaEventosButton = new JButton("Lista de Eventos");
        JButton totalHorasAccButton = new JButton("Total de Horas ACC");
        JButton infoGeralButton = new JButton("Informações Gerais");

        panel.add(criarEventoButton);
        panel.add(listaEventosButton);
        panel.add(totalHorasAccButton);
        panel.add(infoGeralButton);

        add(panel);

        criarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarEvento();
            }
        });

        listaEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirListaEventos();
            }
        });

        totalHorasAccButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirTotalHorasAcc();
            }
        });

        infoGeralButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirInformacoesGerais();
            }
        });
    }

    private void criarEvento() {
        String nome = JOptionPane.showInputDialog(CoordenadorFrame.this, "Digite o nome do evento:");
        String horasAccStr = JOptionPane.showInputDialog(CoordenadorFrame.this, "Digite as horas ACC do evento:");
        int horasAcc = Integer.parseInt(horasAccStr);
        String data = JOptionPane.showInputDialog(CoordenadorFrame.this, "Digite a data do evento:");

        coordenador.criarEvento(nome, horasAcc, data);

        JOptionPane.showMessageDialog(CoordenadorFrame.this, "Evento criado com sucesso!");
    }

    private void exibirListaEventos() {
        StringBuilder sb = new StringBuilder();
        for (Evento evento : coordenador.getEventos()) {
            sb.append("Nome: ").append(evento.getNome()).append("\n");
            sb.append("Horas ACC: ").append(evento.getHorasAcc()).append("\n");
            sb.append("Data: ").append(evento.getData()).append("\n");
            sb.append("\n");
        }

        JOptionPane.showMessageDialog(CoordenadorFrame.this, sb.toString(), "Lista de Eventos", JOptionPane.INFORMATION_MESSAGE);
    }

    private void exibirTotalHorasAcc() {
        int totalHorasAcc = coordenador.getNumeroTotalHorasAcc();
        JOptionPane.showMessageDialog(CoordenadorFrame.this, "Total de Horas ACC: " + totalHorasAcc, "Total de Horas ACC", JOptionPane.INFORMATION_MESSAGE);
    }

    private void exibirInformacoesGerais() {
        int totalEventos = coordenador.getNumeroTotalEventos();
        int totalHorasAcc = coordenador.getNumeroTotalHorasAcc();

        StringBuilder sb = new StringBuilder();
        sb.append("Total de Eventos: ").append(totalEventos).append("\n");
        sb.append("Total de Horas ACC: ").append(totalHorasAcc).append("\n");

        JOptionPane.showMessageDialog(CoordenadorFrame.this, sb.toString(), "Informações Gerais", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CoordenadorFrame coordenadorFrame = new CoordenadorFrame();
                coordenadorFrame.setVisible(true);
            }
        });
    }
}
