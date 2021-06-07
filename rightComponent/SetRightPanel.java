package rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetRightPanel {
    public static JPanel rightPanel = new JPanel();
    public SetRightPanel(){
        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setMinimumSize(new Dimension(716, 600));
        rightPanel.setPreferredSize(new Dimension(716, 600));

        //스터디룸은 body만 변경해주면 됨
        //Body Header관련
        SetBodyHeader hbody = new SetBodyHeader("테스트중");
        //Body Side 관련
        SetMemberPanel participants = new SetMemberPanel();
        //Body - Serfooter 파일에서 값 바꿔주면 됨
        SetFooter foot = new SetFooter();
        //Body 스터디룸에서 계속 본문 바뀌는 부분
        SetBody contentBody = new SetBody();

        GroupLayout rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(contentBody.bodyPanel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hbody.bodyHeader, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addComponent(foot.footer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(0, 0, 0)
                                                .addComponent(participants.memberPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(hbody.bodyHeader, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(participants.memberPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(rightPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contentBody.bodyPanel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(foot.footer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        );

    }
}
