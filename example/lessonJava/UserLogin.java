package lessonJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin extends JFrame {
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton exitButton;

    public UserLogin() {
        setTitle("用户登录");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JLabel accountLabel = new JLabel("帐号:");
        accountField = new JTextField(15);
        JLabel passwordLabel = new JLabel("密码:");
        passwordField = new JPasswordField(15);
        loginButton = new JButton("登录");
        exitButton = new JButton("退出");


        setLayout(new GridLayout(3, 2));
        add(accountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(exitButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String account = accountField.getText();
                String password = new String(passwordField.getPassword());
                if (account.equals("001") && password.equals("123")) {
                    JOptionPane.showMessageDialog(UserLogin.this, "登录成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(UserLogin.this, "登录失败", "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }
}
