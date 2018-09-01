import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUserlogin;
    private JPasswordField pwdUserPassword;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainPanel;

    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserlogin.getText()+
                        " "+new String(pwdUserPassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUserlogin.setText("");
                pwdUserPassword.setText("");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
