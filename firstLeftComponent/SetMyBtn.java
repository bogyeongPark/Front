package firstLeftComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetMyBtn {
    public static JButton myBtn = new JButton();

    public SetMyBtn(){
        myBtn.setBackground(new java.awt.Color(253, 253, 248));
        myBtn.setForeground(new java.awt.Color(253, 253, 248));
        myBtn.setIcon(new javax.swing.ImageIcon("../img/my.png")); // NOI18N
        myBtn.setBorder(null);
        myBtn.setMargin(new java.awt.Insets(2, 11, 2, 11));
        myBtn.setMaximumSize(new java.awt.Dimension(50, 50));
        myBtn.setMinimumSize(new java.awt.Dimension(50, 50));
        myBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        myBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                myBtnActionPerformed(evt);
            }
        });
    }
    private void myBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void main(String[] args){
        new SetMyBtn();
    }
}
