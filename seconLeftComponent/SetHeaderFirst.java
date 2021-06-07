package seconLeftComponent;
import javax.swing.*;
import java.awt.*;

public class SetHeaderFirst {
    public static JPanel headerFirst = new JPanel();
    public static JSeparator headerLine = new JSeparator();

    public SetHeaderFirst(){
        headerFirst.setBackground(new Color(238, 241, 244));
        headerFirst.setMinimumSize(new Dimension(242, 80));
        headerFirst.setPreferredSize(new Dimension(242, 80));

        SetHeaderFirstLabel hLabel = new SetHeaderFirstLabel();

        GroupLayout headerFirstLayout = new GroupLayout(headerFirst);
        headerFirst.setLayout(headerFirstLayout);
        headerFirstLayout.setHorizontalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent( hLabel.headerFirstLabel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerFirstLayout.setVerticalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent( hLabel.headerFirstLabel, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addContainerGap())
        );

        headerLine.setMinimumSize(new Dimension(242, 10));
        headerLine.setPreferredSize(new Dimension(242, 10));
    }
}
