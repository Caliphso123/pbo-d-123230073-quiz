package materi7.page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonHandlingPage extends JFrame implements ActionListener
        
{
    private JLabel lbl;
    private JButton btnSetuju;
    private JButton btnBatal;
    private JButton btnNext;
    
    public ButtonHandlingPage(){
        super ("Halaman Button Handling");
        
        lbl = new JLabel("Status = Belum Ditekan");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        btnSetuju = new JButton("Setuju");
        btnBatal = new JButton("Batal");
        btnNext = new JButton("Next");
        
        btnSetuju.addActionListener(this);
        btnNext.addActionListener(this);
        btnBatal.addActionListener(this);
        
//        btnSetuju.addActionListener((e) -> {
//            lbl.setText("Status = Setuju");
//        });
//        
//        btnBatal.addActionListener((e) -> {
//            lbl.setText("Status = Batal");
//        });
        
        setLayout(new BorderLayout());
        add(lbl, "North");
        add(btnSetuju, "West");
        add(btnBatal, "East");
        add(btnNext, "Center");
        
        pack();
        setResizable(true);
        setLocation(100, 100);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSetuju) {
            lbl.setText("Status = Setuju");
        }else if(e.getSource() == btnBatal) {
            lbl.setText("Status = Batal");
        }else   {
            new RadioHandlingPage();
        }
    }
}
