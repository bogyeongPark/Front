package seconLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetMemPercent {
    public static JLabel memberPerLabel = new JLabel();

    public SetMemPercent(){
        memberPerLabel.setFont(new Font("돋움", 1, 20)); // NOI18N
        memberPerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberPerLabel.setText("50%");
    }
}
