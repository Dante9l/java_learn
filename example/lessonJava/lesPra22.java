package org.example.lessonJava;

import java.util.Scanner;

public class lesPra22 {
    String userName;
    String password;
    @Override
    public String toString() {
        return
                "userName='" + userName + '\'' +
                ", password='" + password + '\''
                ;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void Manager(String userName, String password){
        if (userName.equals(this.userName) && password.equals(this.password)){
            System.out.println("请输入新密码:");
            String newPassword = new Scanner(System.in).nextLine();
            while(true){
                System.out.println("请再次输入新密码:");
                String newPassword1 = new Scanner(System.in).nextLine();
                if (newPassword.equals(newPassword1)){
                    this.password = newPassword;
                    System.out.println("修改成功");
                    break;
                }else{
                    System.out.println("两次输入不一致，请重新输入");
                }
            }
        }
    }

    public static void main(String[] args) {
        lesPra22 admin1 = new lesPra22();
        admin1.setUserName("admin1");
        admin1.setPassword("111111");
        System.out.println(admin1.toString());
        lesPra22 admin2 = new lesPra22();
        admin2.setUserName("admin2");
        admin2.setPassword("222222");
        System.out.println(admin2.toString());
        admin1.Manager("admin1","111111");
    }
}
