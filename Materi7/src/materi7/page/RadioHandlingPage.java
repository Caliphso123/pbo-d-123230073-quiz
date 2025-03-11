package materi7.page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class RadioHandlingPage extends JFrame {
    private JTextField textField;
    private JPanel panel;
    private JRadioButton rbtn1, rbtn2, rbtn3;
    
    public RadioHandlingPage(){
        setTitle("Coba RadioButton Handling");
        textField = new JTextField("Jenis Kelamin : Belum Dipilih");
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel = new JPanel(new FlowLayout());
        rbtn1 = new JRadioButton("Pria");
        rbtn2 = new JRadioButton("Wanita");
        rbtn3 = new JRadioButton("???");
        
        ButtonGroup grup = new ButtonGroup();
        grup.add(rbtn1);
        grup.add(rbtn2);
        grup.add(rbtn3);
        
        rbtn1.addItemListener((e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                textField.setText("Jenis Kelamin: Pria");
            }
        });
        
        rbtn2.addItemListener((e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                textField.setText("Jenis Kelamin: Wanita");
            }
        });
        
        rbtn3.addItemListener((e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                textField.setText("Jenis Kelamin: ???");
            }
        });
        
        setLayout(new BorderLayout());
        add(textField, "North");
        add(panel, "West");
        
        panel.add(rbtn1);
        panel.add(rbtn2);
        panel.add(rbtn3);
        
        pack();
        setVisible(true);
        setLocation(200, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
