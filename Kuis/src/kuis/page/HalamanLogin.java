package kuis.page;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanLogin extends JFrame{

    public static String username;
    JLabel lbl = new JLabel("Selamat Datang di Aplikasi 123230073");
    JLabel Lusername = new JLabel("Username: ");
    public static JTextField Fusername = new JTextField(20);
    JLabel Lpassword = new JLabel("Password: ");
    JTextField Fpassword = new JTextField(10);
    JButton login = new JButton("Login");
    
    public HalamanLogin(){
        setTitle("Halaman Login");
        setSize(300, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(null);
        add(lbl);
        add(Lusername);
        add(Fusername);
        add(Lpassword);
        add(Fpassword);
        add(login);
        
        lbl.setBounds(10, 10, 300, 20);
        Lusername.setBounds(10, 30, 70, 20);
        Fusername.setBounds(120, 30, 150, 20);
        Lpassword.setBounds(10, 50, 70, 20);
        Fpassword.setBounds(120, 50, 150, 20);
        login.setBounds(200, 70, 70, 20);
        
        login.addActionListener(new ActionListener(){
            public static  String usernames;
            @Override
            public void actionPerformed(ActionEvent e) {
                this.usernames = Fusername.getText();
                String password = Fpassword.getText();
                
                if (usernames.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Gagal Login, Pastikan Username Terisi & Password Sesuai", "Error", JOptionPane.ERROR_MESSAGE);
                }else if (password.equals("pbo-d")) {
                   new HalamanUtama();
                   dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Gagal Login, Pastikan Username Terisi & Password Sesuai", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        setVisible(true);
    }  
    
}
