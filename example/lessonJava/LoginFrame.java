package lessonJava;

import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
    private JLabel nameLabel = new JLabel();
    private JLabel userCategoryLabel = new JLabel();
    private JLabel passwordLabel = new JLabel();
    private JTextField nameTextFiedld = new JTextField();
    private JTextField passwordField = new JPasswordField();
    private JButton loginBtn = new JButton();
    private JButton exitBtn = new JButton();
    private JComboBox<String> stateComboBox = new JComboBox();

    public LoginFrame() {
        this.setLayout((LayoutManager)null);
        this.nameLabel.setText("用户名：");
        this.nameLabel.setFont(new Font("Dialog", 0, 15));
        this.nameLabel.setBounds(65, 67, 81, 16);
        this.passwordLabel.setText("密码：");
        this.passwordLabel.setFont(new Font("Dialog", 0, 15));
        this.passwordLabel.setBounds(65, 112, 81, 16);
        this.nameTextFiedld.setBounds(194, 67, 118, 22);
        this.passwordField.setBounds(194, 112, 118, 22);
        this.userCategoryLabel.setText("用户类别：");
        this.userCategoryLabel.setFont(new Font("Dialog", 0, 15));
        this.userCategoryLabel.setBounds(65, 157, 81, 16);
        this.stateComboBox.addItem("学生");
        this.stateComboBox.addItem("教师");
        this.stateComboBox.addItem("管理员");
        this.stateComboBox.setSelectedIndex(0);
        this.stateComboBox.setBounds(194, 157, 118, 20);
        this.loginBtn.setText("登录");
        this.loginBtn.setFont(new Font("Dialog", 0, 15));
        this.loginBtn.setBounds(65, 224, 109, 25);
        this.loginBtn.addActionListener(this);
        this.exitBtn.setText("退出");
        this.exitBtn.setFont(new Font("Dialog", 0, 15));
        this.exitBtn.setBounds(203, 224, 109, 25);
        this.exitBtn.addActionListener(this);
        this.add(this.nameLabel);
        this.add(this.nameTextFiedld);
        this.add(this.passwordLabel);
        this.add(this.passwordField);
        this.add(this.loginBtn);
        this.add(this.exitBtn);
        this.add(this.userCategoryLabel);
        this.add(this.stateComboBox);
        this.setSize(400, 330);
        this.setTitle("用户登录");
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(this.getOwner());
    }

    public void actionPerformed(ActionEvent e) {
        String name = this.nameTextFiedld.getText();
        String password = new String(this.passwordField.getText());
        int state = this.stateComboBox.getSelectedIndex();
        if (e.getSource() == this.loginBtn) {
            if (name.equals("admin") && password.equals("123")) {
                JOptionPane.showMessageDialog((Component)null, "登陆成功！");
                this.dispose();
                new MainFrame(2, "admin");
            } else {
                JOptionPane.showMessageDialog((Component)null, "登陆失败！");
                this.dispose();
            }
        } else {
            System.exit(0);
        }

    }
}
class test {
    public static void main(String[] args) {
        new LoginFrame();
    }
}