package firstLeftComponent;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetGroup {
    public static JButton group = new JButton();
    public SetGroup(){
        group.setBackground(new Color(253, 253, 248));
        group.setFont(new Font("돋움", 1, 20)); // NOI18N
        group.setText("JV");
        group.setBorder(null);
        group.setMargin(new Insets(2, 11, 2, 11));
        group.setMaximumSize(new Dimension(50, 50));
        group.setMinimumSize(new Dimension(50, 50));
        group.setPreferredSize(new Dimension(50, 50));
        group.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                groupActionPerformed(evt);
            }
        });
    }
    private void groupActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void main(String[] args){
        new SetGroup();
    }
}
