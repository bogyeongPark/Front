package seconLeftComponent;
import javax.swing.*;
import java.awt.*;

public class SetHeaderFirst {
    public static JPanel headerFirst = new JPanel();
    public static JSeparator headerLine = new JSeparator();
    public static JLabel headerFirstLabel = new JLabel();

    public SetHeaderFirst(String hLabel){

        headerFirst.setBackground(new Color(238, 241, 244));
        headerFirst.setMinimumSize(new Dimension(242, 80));
        headerFirst.setPreferredSize(new Dimension(242, 80));

        headerFirstLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerFirstLabel.setFont(new Font("돋움", 1, 30));
        headerFirstLabel.setMinimumSize(new Dimension(199, 45));
        headerFirstLabel.setText(hLabel);


        GroupLayout headerFirstLayout = new GroupLayout(headerFirst);
        headerFirst.setLayout(headerFirstLayout);
        headerFirstLayout.setHorizontalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(headerFirstLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerFirstLayout.setVerticalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(headerFirstLabel, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addContainerGap())
        );

        headerLine.setMinimumSize(new Dimension(242, 10));
        headerLine.setPreferredSize(new Dimension(242, 10));
    }

}
