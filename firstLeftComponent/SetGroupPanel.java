package firstLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetGroupPanel {
    public static JPanel groupPanel = new JPanel();
    public SetGroupPanel(){
        groupPanel.setBackground(new Color(230, 235, 244));
        groupPanel.setMinimumSize(new Dimension(50, 250));
        groupPanel.setPreferredSize(new Dimension(50, 250));
        SetGroup groups = new SetGroup();

        GroupLayout groupPanelLayout = new GroupLayout(groupPanel);
        groupPanel.setLayout(groupPanelLayout);
        groupPanelLayout.setHorizontalGroup(
                groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(groups.group, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        groupPanelLayout.setVerticalGroup(
                groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupPanelLayout.createSequentialGroup()
                                .addComponent(groups.group, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
        );
    }
}
