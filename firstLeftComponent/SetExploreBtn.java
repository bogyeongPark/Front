package firstLeftComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetExploreBtn {
    public static JButton exploreBtn = new JButton();

    public SetExploreBtn(){
        exploreBtn.setBackground(new Color(253, 253, 248));
        exploreBtn.setForeground(new Color(253, 253, 248));
        exploreBtn.setIcon(new ImageIcon("../img/explore_simple.png")); // NOI18N
        exploreBtn.setBorder(null);
        exploreBtn.setMargin(new Insets(2, 11, 2, 11));
        exploreBtn.setMaximumSize(new Dimension(50, 50));
        exploreBtn.setMinimumSize(new Dimension(50, 50));
        exploreBtn.setPreferredSize(new Dimension(50, 50));
        exploreBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exploreBtnActionPerformed(evt);
            }
        });
    }
    private void exploreBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String[] args){
        new SetExploreBtn();
    }
}
