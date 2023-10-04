package sistemalogin;

 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

 

    public LoginFrame() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Centraliza a janela na tela

 

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

 

        JLabel usernameLabel = new JLabel("Usuário:");
        JLabel passwordLabel = new JLabel("Senha:");

 

        usernameField = new JTextField();
        passwordField = new JPasswordField();

 

        loginButton = new JButton("Entrar");

 

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Espaço vazio para layout
        panel.add(loginButton);

 

        add(panel);

 

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

 

                // Simulação de autenticação
                if (username.equals("aluno") && password.equals("123")) {
                    // Abre a janela do Aluno
                    AlunoFrame alunoFrame = new AlunoFrame();
                    alunoFrame.setVisible(true);
                    dispose(); // Fecha a janela de login
                } else if (username.equals("coordenador") && password.equals("456")) {
                    // Abre a janela do Coordenador
                    CoordenadorFrame coordenadorFrame = new CoordenadorFrame();
                    coordenadorFrame.setVisible(true);
                    dispose(); // Fecha a janela de login
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Usuário ou senha inválidos",
                            "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
            }
        });
    }
}
