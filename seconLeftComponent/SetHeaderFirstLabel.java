package seconLeftComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetHeaderFirstLabel {
    public static JLabel headerFirstLabel = new JLabel();
    public SetHeaderFirstLabel(){
        headerFirstLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerFirstLabel.setFont(new Font("돋움", 1, 30));
        headerFirstLabel.setMinimumSize(new Dimension(199, 45));
        headerFirstLabel.setText("Java 정복");
    }
}
