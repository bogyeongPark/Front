package seconLeftComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExploreMenu{
    public static JPanel exploreMenu = new JPanel();
    public static JButton  allBtn = new JButton();
    public static JButton devBtn = new JButton();
    public static JButton langBtn = new JButton();
    public static JButton designBtn = new JButton();

    public ExploreMenu(){

        exploreMenu.setBackground(new Color(238, 241, 244));
        exploreMenu.setPreferredSize(new Dimension(226, 180));
        exploreMenu.setVisible(true);

        // TODO 버튼 클래서 만들어서 오버로딩해서 코드 간결화시키기!
        allBtn.setBackground(new java.awt.Color(64, 80, 255));
        allBtn.setFont(new java.awt.Font("돋움", 1, 24)); // NOI18N
        allBtn.setIcon(new javax.swing.ImageIcon("../img/img/explore_simple.png")); // NOI18N
        allBtn.setText("ALL");
        allBtn.setAutoscrolls(true);
        allBtn.setBorder(null);
        allBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        allBtn.setIconTextGap(15);
        allBtn.setPreferredSize(new java.awt.Dimension(226, 40));
        allBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBtnActionPerformed(evt);
            }
        });



        devBtn.setBackground(new Color(238, 241, 244));
        devBtn.setFont(new Font("돋움", 1, 24)); // NOI18N
        devBtn.setIcon(new ImageIcon("../img/img/file.png")); // NOI18N
        devBtn.setText("개발");
        devBtn.setAutoscrolls(true);
        devBtn.setBorder(null);
        devBtn.setHorizontalAlignment(SwingConstants.LEFT);
        devBtn.setIconTextGap(15);
        devBtn.setPreferredSize(new Dimension(226, 40));
        devBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                devBtnActionPerformed(evt);
            }
        });

        langBtn.setBackground(new Color(238, 241, 244));
        langBtn.setFont(new Font("돋움", 1, 24)); // NOI18N
        langBtn.setIcon(new ImageIcon("../img/language.png")); // NOI18N
        langBtn.setText("외국어");
        langBtn.setToolTipText("");
        langBtn.setAutoscrolls(true);
        langBtn.setBorder(null);
        langBtn.setHorizontalAlignment(SwingConstants.LEFT);
        langBtn.setIconTextGap(15);
        langBtn.setPreferredSize(new Dimension(226, 40));
        langBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                langBtnActionPerformed(evt);
            }
        });

        designBtn.setBackground(new Color(238, 241, 244));
        designBtn.setFont(new Font("돋움", 1, 24)); // NOI18N
        designBtn.setIcon(new ImageIcon("../img/design.png")); // NOI18N
        designBtn.setText("디자인");
        designBtn.setAutoscrolls(true);
        designBtn.setBorder(null);
        designBtn.setHorizontalAlignment(SwingConstants.LEFT);
        designBtn.setIconTextGap(15);
        designBtn.setPreferredSize(new Dimension(226, 40));
        designBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                designBtnActionPerformed(evt);
            }
        });

        GroupLayout exploreMenuLayout = new GroupLayout(exploreMenu);
        exploreMenu.setLayout(exploreMenuLayout);
        exploreMenuLayout.setHorizontalGroup(
                exploreMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(allBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(devBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(langBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(designBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exploreMenuLayout.setVerticalGroup(
                exploreMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(exploreMenuLayout.createSequentialGroup()
                                .addComponent(allBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(devBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(langBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(designBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
    }

    private void allBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void devBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void langBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void designBtnActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
public static void main(String args[]) {
    new ExploreMenu();
}
}
