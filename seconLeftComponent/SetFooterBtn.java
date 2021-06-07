package seconLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetFooterBtn {
    public static JButton footerBtn = new JButton();
    public SetFooterBtn(String msg){
        footerBtn.setBackground(new Color(238, 241, 244));
        footerBtn.setFont(new Font("굴림", 1, 20));
        footerBtn.setText(msg);
        footerBtn.setBorder(null);
        footerBtn.setMaximumSize(new Dimension(350, 50));
        footerBtn.setMinimumSize(new Dimension(350, 50));
        footerBtn.setPreferredSize(new Dimension(350, 50));
    }
}
