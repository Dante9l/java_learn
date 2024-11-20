package lessonJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserLogin1 extends JFrame {
    private JTextField accountField;
    private JPasswordField passwordField;
    private JComboBox<String> userTypeComboBox;
    private JButton loginButton;
    private JButton exitButton;
    private User[] users; // 存储多个用户对象

    public UserLogin1() {
        setTitle("用户登录");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        users = new User[]{
                new User("001", "123", "管理员"),
                new User("002", "456", "教师"),
                new User("003", "789", "学生")
        };

        JLabel accountLabel = new JLabel("帐号:");
        accountField = new JTextField(15);
        JLabel passwordLabel = new JLabel("密码:");
        passwordField = new JPasswordField(15);
        JLabel userTypeLabel = new JLabel("用户类别:");
        userTypeComboBox = new JComboBox<>(new String[]{"管理员", "教师", "学生"});
        loginButton = new JButton("登录");
        exitButton = new JButton("退出");

        setLayout(new GridLayout(4, 2));
        add(accountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(userTypeLabel);
        add(userTypeComboBox);
        add(loginButton);
        add(exitButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String account = accountField.getText();
                String password = new String(passwordField.getPassword());
                String selectedUserType = (String) userTypeComboBox.getSelectedItem();
                boolean loginSuccess = false;
                String userType = null;

                for (User user : users) {
                    if (account.equals(user.getAccount()) && password.equals(user.getPassword()) && selectedUserType.equals(user.getUserType())) {
                        loginSuccess = true;
                        userType = user.getUserType();
                        break;
                    }
                }

                if (loginSuccess) {
                    JOptionPane.showMessageDialog(UserLogin1.this, "登录成功，您是：" + userType, "提示", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(UserLogin1.this, "登录失败", "错误", JOptionPane.ERROR_MESSAGE);
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
                new UserLogin1().setVisible(true);
            }
        });
    }
}

class User {
    private String account;
    private String password;
    private String userType;

    public User(String account, String password, String userType) {
        this.account = account;
        this.password = password;
        this.userType = userType;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }
}