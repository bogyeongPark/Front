package rightComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetStudyResult {
    public static JPanel  studyResultPanel = new JPanel();
    public static JButton studyResultMoreBtn = new JButton();
    public static JLabel studyResultDate = new JLabel();
    public static JLabel studyResultTitle = new JLabel();

    public SetStudyResult(){
        //DB에 연동하면 변하는 값
        studyResultTitle.setText("김스터디 1주차 과제입니다. ");
        studyResultDate.setText("2021-05-05  22:55");

        studyResultPanel.setBackground(new Color(255, 255, 255));
        studyResultPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        studyResultTitle.setFont(new Font("돋움", 1, 18)); // NOI18N
        studyResultDate.setFont(new Font("돋움", 0, 10)); // NOI18N
        studyResultMoreBtn.setBackground(new Color(238, 241, 244));
        studyResultMoreBtn.setFont(new Font("돋움", 1, 11)); // NOI18N
        studyResultMoreBtn.setText("더보기");
        studyResultMoreBtn.setBorder(null);
        studyResultMoreBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                studyResultMoreBtnActionPerformed(evt);
            }
        });
        //여기바꿔주면됨 4
        GroupLayout studyResultPanelLayout = new GroupLayout(studyResultPanel);
        studyResultPanel.setLayout(studyResultPanelLayout);
        studyResultPanelLayout.setHorizontalGroup(
                studyResultPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyResultPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(studyResultPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        //여기 바꿔주면됨5
                                        .addComponent(studyResultTitle, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studyResultDate, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(studyResultMoreBtn, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
        );
        //여기 바꿔주면 됨 6
        studyResultPanelLayout.setVerticalGroup(
                studyResultPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(studyResultPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(studyResultTitle)
                                .addGap(17, 17, 17)
                                .addComponent(studyResultDate)
                                .addContainerGap(20, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, studyResultPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studyResultMoreBtn, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );
    }
    private void studyResultMoreBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}
