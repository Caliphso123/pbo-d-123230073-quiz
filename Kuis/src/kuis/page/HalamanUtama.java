package kuis.page;

import kuis.page.HalamanLogin;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class HalamanUtama extends JFrame {
    JLabel Lndepan = new JLabel("Nama Depan: ");
    JTextField Fndepan = new JTextField(20);
    JLabel Lnblkg = new JLabel("Nama Belakang: ");
    JTextField Fnblkg = new JTextField(20);
    JLabel divisi = new JLabel("Divisi: ");
    String daftardivisi[] = {
        "IT", "HRD", "Finance", "Marketing"
    };
    JComboBox cbdivisi = new JComboBox(daftardivisi);
    JLabel Ljk = new JLabel("Jenis Kelamin: ");
    JRadioButton rbPria = new JRadioButton("Pria");
    JRadioButton rbWanita = new JRadioButton("Wanita");
    JLabel list = new JLabel("List Data: ");
    JButton simpan = new JButton("Simpan Data");
    JTextArea ta = new JTextArea(20, 20);
    JCheckBox cek = new JCheckBox("Ingin melakukan Import/Export Data ?");
    JButton importt = new JButton("Import from .txt");
    JButton export = new JButton ("Export to .txt");
    
    public HalamanUtama(){
        setTitle("Input Member by " + HalamanLogin.Fusername.getText());
        setSize(400, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        setLayout(null);
        add(Lndepan);
        add(Fndepan);
        add(Lnblkg);
        add(Fnblkg);
        add(divisi);
        add(cbdivisi);
        add(Ljk);
        add(rbPria);
        add(rbWanita);
        add(list);
        add(simpan);
        add(ta);
        add(cek);
        
        Lndepan.setBounds(10, 10, 100, 20);
        Fndepan.setBounds(120, 10, 200, 20);
        Lnblkg.setBounds(10, 30, 100, 20);
        Fnblkg.setBounds(120, 30, 200, 20);
        divisi.setBounds(10, 60, 50, 20);
        cbdivisi.setBounds(10, 85, 300, 20);
        Ljk.setBounds(100, 110, 100, 20);
        rbPria.setBounds(200, 110, 50, 20);
        rbWanita.setBounds(250, 110, 70, 20);
        list.setBounds(10, 200, 70, 20);
        simpan.setBounds(10, 140, 370, 50);
        ta.setBounds(10, 220, 360, 400);
        cek.setBounds(10, 630, 400, 20);
        
        simpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String namadepan = Fndepan.getText();
                String namablkg = Fnblkg.getText();
                String jk = "";
                String divisi = (String) cbdivisi.getSelectedItem();
                if (rbPria.isSelected()) {
                    jk = "Pria";
                }else if (rbWanita.isSelected()) {
                    jk = "Wanita";
                }
                
                if (namadepan.isEmpty() || namablkg.isEmpty() || jk.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data Belum Lengkap", "Gagal", JOptionPane.ERROR_MESSAGE);
                }else{
                    String hasil = namadepan + " " + namablkg + " | " + jk + " | " + divisi;
                    ta.setText(hasil);
                }
                
            }
            
        });
        
        cek.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cek.isSelected()){
                    add(importt);
                    add(export);
                    
                    importt.setBounds(40, 660, 150, 20);
                    export.setBounds(200, 660, 150, 20);
                    importt.setVisible(true);
                    export.setVisible(true);
                    
                    export.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                FileWriter fw = new FileWriter("data.txt");
                                ta.write(fw);
                                fw.close();
                                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                            } catch (IOException a) {
                                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    });
                    
                    importt.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            bacaFile();
                        }
                        
                    });
                }else {
                    importt.setVisible(false);
                    export.setVisible(false);
                }
            }
            
        });
        
        setVisible(true);
    }
    
    private void bacaFile(){
        try {
            FileReader fr = new FileReader("data.txt");
            ta.read(fr, null);
            fr.close();
        } catch (IOException e) {
            System.out.println("File tidak ditemukan");
        }
    }
    
}
