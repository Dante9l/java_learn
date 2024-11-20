package lessonJava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JPanel mainPanel;
    private JMenuItem courseQuery;
    private JMenuItem courseAdd;
    private JMenuItem courseUpdate;
    private JMenuItem scoreAdd;
    private JMenuItem scoreQuery;
    private JMenuItem scoreUpdate;
    private JMenuItem tea;
    private JMenuItem stu;
    private JMenuItem personInfo;
    private JMenuItem exit;
    private int state;
    private String userId;

    public MainFrame(int state, String userId) {
        this.userId = userId;
        this.state = state;
        this.setTitle("学 生 成 绩 管 理 系 统");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 770, 487);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 774, 26);
        this.contentPane.add(menuBar);
        JMenu course = new JMenu("课程管理");
        menuBar.add(course);
        this.courseQuery = new JMenuItem("课程查询");
        course.add(this.courseQuery);
        this.courseAdd = new JMenuItem("课程添加");
        this.courseUpdate = new JMenuItem("课程修改");
        if (state == 2) {
            course.add(this.courseAdd);
            course.add(this.courseUpdate);
        }

        JMenu score = new JMenu("成绩管理");
        menuBar.add(score);
        this.scoreQuery = new JMenuItem("成绩查询");
        score.add(this.scoreQuery);
        this.scoreAdd = new JMenuItem("成绩添加");
        this.scoreUpdate = new JMenuItem("成绩修改");
        if (state == 2) {
            score.add(this.scoreAdd);
            score.add(this.scoreUpdate);
        }

        JMenu person = new JMenu("用户管理");
        menuBar.add(person);
        this.personInfo = new JMenuItem("个人信息");
        person.add(this.personInfo);
        this.stu = new JMenuItem("学生信息");
        this.tea = new JMenuItem("教师信息");
        if (state == 2) {
            person.add(this.stu);
            person.add(this.tea);
        }

        this.exit = new JMenuItem("系统退出");
        person.add(this.exit);
        this.mainPanel = new JPanel();
        this.mainPanel.setBounds(0, 22, 774, 427);
        this.contentPane.add(this.mainPanel);
        this.mainPanel.setLayout((LayoutManager)null);
        JLabel label = new JLabel("学 生 成 绩 管 理 系 统");
        label.setFont(new Font("微软雅黑", 3, 45));
        label.setForeground(Color.black);
        label.setBounds(90, 159, 569, 119);
        this.mainPanel.add(label);
        JLabel lblNewLabel = new JLabel("New Label");
        lblNewLabel.setIcon(new ImageIcon("images/new.png"));
        lblNewLabel.setBounds(0, 0, 774, 427);
        this.mainPanel.add(lblNewLabel);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setVisible(true);
        this.exit.addActionListener(this);
        this.stu.addActionListener(this);
        this.personInfo.addActionListener(this);
        this.scoreQuery.addActionListener(this);
        this.scoreAdd.addActionListener(this);
        this.scoreUpdate.addActionListener(this);
        this.courseQuery.addActionListener(this);
        this.courseAdd.addActionListener(this);
        this.tea.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.exit) {
            System.exit(0);
        } else if (e.getSource() == this.stu) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(10, 22, 745, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.personInfo) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel = new PersonInfoPanel(this.state, this.userId);
            this.mainPanel.setBounds(10, 22, 774, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.scoreQuery) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(100, 22, 550, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.scoreAdd) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(10, 22, 745, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.scoreUpdate) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(10, 22, 745, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.courseAdd) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(10, 22, 745, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.courseUpdate) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(10, 22, 745, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        } else if (e.getSource() == this.tea) {
            this.contentPane.remove(this.mainPanel);
            this.contentPane.repaint();
            this.mainPanel.setBounds(10, 22, 745, 427);
            this.contentPane.add(this.mainPanel);
            this.setVisible(true);
        }

    }
}
