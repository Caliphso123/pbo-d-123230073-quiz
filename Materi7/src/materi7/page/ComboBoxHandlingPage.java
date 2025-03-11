package materi7.page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxHandlingPage extends JFrame implements ItemListener {
    
    private String status[] = {"Setuju", "Batal"};
    private JLabel lbl;
    private JComboBox cbStatus;
    
    public ComboBoxHandlingPage(){
        setTitle("Combo Box Handling");
        lbl = new JLabel("Status: Belum Dipilih");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        cbStatus = new JComboBox(status);
        cbStatus.addItemListener(this);
        
        setLayout(new BorderLayout());
        add(lbl, "North");
        add(cbStatus, "South");
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == cbStatus){
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(cbStatus.getSelectedIndex() == 0){
                    lbl.setText("Status: Setuju");
                }else if(cbStatus.getSelectedIndex() == 1){
                    lbl.setText("Status: Batal");
                }
            }
        }
    }
    
}
