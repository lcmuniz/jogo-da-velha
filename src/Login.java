import javax.swing.*;

public class Login {

    private JFrame frame;
    private  JTextField usuarioTextField;
    private JPasswordField senhaPasswordField;

    public void show() {

        // construir interface

        frame = new JFrame("Login");
        frame.setSize(250, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usuarioLabel = new JLabel("Usuário");
        usuarioLabel.setBounds(10, 20, 80, 25);

        usuarioTextField = new JTextField();
        usuarioTextField.setBounds(80, 20, 160, 25);

        JLabel senhaLabel = new JLabel("Senha");
        senhaLabel.setBounds(10, 50, 80, 25);

        senhaPasswordField = new JPasswordField();
        senhaPasswordField.setBounds(80, 50, 160, 25);

        JButton entrarButton = new JButton("Entrar");
        entrarButton.setBounds(80, 80, 100, 25);
        entrarButton.addActionListener(e -> aoPressionarEntrar());

        panel.add(usuarioLabel);
        panel.add(usuarioTextField);
        panel.add(senhaLabel);
        panel.add(senhaPasswordField);
        panel.add(entrarButton);

        frame.add(panel);
        frame.getRootPane().setDefaultButton(entrarButton);
        frame.setVisible(true);

    }

    private void aoPressionarEntrar() {
        {

            String usuario = usuarioTextField.getText();
            String senha = String.valueOf(senhaPasswordField.getPassword());

            if (usuario.equals("joao") && senha.equals("123")) {
                // entra no jogo se o usuario for joao e a senha 123
                Jogo jogo = new Jogo();
                jogo.show();
                frame.setVisible(false);  // esconde janela de login
            }
            else {
                // caso contrário, mostra mensagem que não conseguiu entrar
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
            }
        }

    }

}
