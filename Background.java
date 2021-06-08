import firstLeftComponent.SetFirstLeftPanel;
import seconLeftComponent.SetHeaderFirst;
import javax.swing.*;
import java.awt.*;

public class Background extends JFrame {

    public Background() {
        initComponents();
    }
    public static JPanel secondLeftPanel = new JPanel();
    public static JPanel rightPanel = new JPanel();

    public void initComponents() {

        SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
        SetHeaderFirst hFirst = new SetHeaderFirst("헤더라벨적기");

        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(242, 600));


        GroupLayout secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(hFirst.headerFirst, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hFirst.headerLine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(hFirst.headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hFirst.headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(505, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setMinimumSize(new Dimension(716, 600));
        rightPanel.setPreferredSize(new Dimension(716, 600));

        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 716, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(firstLeft.firstLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(firstLeft.firstLeftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1030, 600));
        setVisible(true);
        pack();
    }

    public static void main(String args[]) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Background();
            }
        });
    }

}
