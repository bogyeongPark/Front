package firstLeftComponent;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetGroup {
    //Group 버튼 레이아웃. 버튼 이벤트 코드 작성 필요.
    public static JButton group = new JButton();
    public SetGroup(){
        group.setBackground(new Color(253, 253, 248));
        group.setFont(new Font("돋움", 1, 20)); // NOI18N
        group.setText("JV");
        //TODO  public SetGroup(variable){ .. setText(variable); ..};로 데이터에 따라 추가필요.
        group.setBorder(null);
        group.setMargin(new Insets(2, 11, 2, 11));
        group.setMaximumSize(new Dimension(50, 50));
        group.setMinimumSize(new Dimension(50, 50));
        group.setPreferredSize(new Dimension(50, 50));
        group.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                groupActionPerformed(evt);
            }
        });
    }
    private void groupActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
    public static void main(String[] args){
        new SetGroup();
    }
}
