package firstLeftComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetPlusBtn {
    public static JButton plusBtn = new JButton();
    public SetPlusBtn(){
        plusBtn.setBackground(new Color(253, 253, 248));
        plusBtn.setForeground(new Color(253, 253, 248));
        plusBtn.setIcon(new ImageIcon("../img/plus.png")); // NOI18N
        plusBtn.setBorder(null);
        plusBtn.setIconTextGap(0);
        plusBtn.setMargin(new Insets(2, 11, 2, 11));
        plusBtn.setMaximumSize(new Dimension(50, 50));
        plusBtn.setMinimumSize(new Dimension(50, 50));
        plusBtn.setPreferredSize(new Dimension(50, 50));
        plusBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });
    }
    private void plusBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void main(String[] args){
        new SetPlusBtn();
    }
}
