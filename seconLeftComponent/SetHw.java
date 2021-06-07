package seconLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetHw {
    public static JScrollPane hwPanel = new JScrollPane();
    public static  JLabel hwLabel = new JLabel();

    public SetHw(){
        hwLabel.setFont(new Font("돋움", 1, 20)); // NOI18N
        hwLabel.setText("과제함");
        SetHwList hws = new SetHwList();
        hwPanel.setViewportView(hws.hwList);
    }
}
