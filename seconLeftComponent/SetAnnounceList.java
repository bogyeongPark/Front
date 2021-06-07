package seconLeftComponent;

import javax.swing.*;
import java.awt.*;

public class SetAnnounceList {
    public static JList<String> announceList = new JList<>();

    public SetAnnounceList(){
        announceList.setBackground(new Color(238, 241, 244));
        announceList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        announceList.setFont(new Font("돋움", 0, 20)); // NOI18N
        announceList.setModel(new javax.swing.AbstractListModel<String>() {
            //strings 변수명 재설정 필요
            String[] strings = { "# 주간알림" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        announceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        announceList.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}
