package rightComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetFooter {

    public static JPanel footer = new JPanel();

    public SetFooter(){
        footer.setBackground(new Color(255, 255, 255));
        SetFooterBtn fBtn =  new SetFooterBtn("테스트용");
        fBtn.footerBtn.addActionListener(new ActionListener() {
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
                                .addComponent(fBtn.footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
                footerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(fBtn.footerBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
        );
    }
    private void footerBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}
