import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout;
import firstLeftComponent.*;
import rightComponent.SetRightPanel;
import seconLeftComponent.*;

public class StScript extends JFrame {

    public StScript() {
        initComponents();
    }

    private void initComponents() {
// setRightPanel 위치 제대로 정리하기 !
// setRightPanel - body 변경해서 다른 화면도 만들기
        SetFirstLeftPanel firstLeft = new SetFirstLeftPanel();
        SetSecondLeftPanel secondLeft = new SetSecondLeftPanel();
        SetRightPanel right = new SetRightPanel();

        // 전체  레이아웃 - firstLeft, secondLeft, rightPanel
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(firstLeft.firstLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(secondLeft.secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(right.rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(firstLeft.firstLeftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(secondLeft.secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(right.rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1030, 600));
        setVisible(true);
        pack();
    }


    public static void main(String args[]) {
        new StScript();
    }

}
