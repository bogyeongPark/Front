package rightComponent;

import javax.swing.*;
import java.awt.*;

public class SetBody {
    public static JPanel body = new JPanel();
    public static JScrollPane bodyPanel = new JScrollPane();

    public SetBody(){
        bodyPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        body.setBackground(new Color(255, 255, 255));

        //여기 바꿔주면됨!
        SetStudyResult resultPre = new SetStudyResult();

        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        //여기 바꿔주면됨
                                        .addComponent(resultPre.studyResultPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(42, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
                bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                //여기 바꿔주면됨
                                .addComponent(resultPre.studyResultPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addContainerGap(256, Short.MAX_VALUE))
        );

        bodyPanel.setViewportView(body);
    }
}
