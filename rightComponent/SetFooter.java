package rightComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetFooter {

    public static JPanel footer = new JPanel();
    public static JButton footerBtn = new JButton();

    public SetFooter(String message){
        footer.setBackground(new Color(255, 255, 255));
        footerBtn.setBackground(new Color(238, 241, 244));
        footerBtn.setFont(new Font("굴림", 1, 20));
        footerBtn.setText(message);
        footerBtn.setBorder(null);
        footerBtn.setMaximumSize(new Dimension(350, 50));
        footerBtn.setMinimumSize(new Dimension(350, 50));
        footerBtn.setPreferredSize(new Dimension(350, 50));
        footerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                footerBtnActionPerformed(evt);
            }
        });

        GroupLayout footerLayout = new GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(footerLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );
    }
    private void footerBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        new SetFooter("테스트용");
    }
}
