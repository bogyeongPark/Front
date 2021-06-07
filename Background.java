import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;

public class Background extends JFrame implements ActionListener {
    JPanel headerFirst;
    JButton myBtn, plusBtn, exploreBtn;
    JSeparator headerLine;
    GroupLayout groupPanelLayout,firstLeftPanelLayout,headerFirstLayout,secondLeftPanelLayout,rightPanelLayout,layout ;
    public static JPanel rightPanel = new JPanel();
    public static JPanel firstLeftPanel = new JPanel();
    public static JPanel secondLeftPanel = new JPanel();
    public static JPanel groupPanel = new JPanel();
    public static Label headerFirstLabel  = new Label();
    public static JButton group = new JButton();
    // 다른메소드에서 작업을 해 화면 내용을 바꾸기 때문에 멤버 공간에 선언

    public Background(String title){
        setTitle(title);
        myBtn = new JButton();
        plusBtn = new JButton();
        exploreBtn = new JButton();
        headerFirst = new JPanel();
        headerLine = new JSeparator();


        firstLeftPanel.setBackground(new Color(230, 235, 244));
        firstLeftPanel.setMinimumSize(new Dimension(72, 600));
        firstLeftPanel.setPreferredSize(new Dimension(72, 600));

        myBtn.setBackground(new Color(253, 253, 248));
        myBtn.setForeground(new Color(253, 253, 248));
//        myBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/img/my.png")));
        myBtn.setIcon(new ImageIcon("./img/my.png"));
        myBtn.setBorder(null);
        myBtn.setMargin(new Insets(2, 11, 2, 11));
        myBtn.setMinimumSize(new Dimension(50, 50));
        myBtn.setPreferredSize(new Dimension(50, 50));
        myBtn.addActionListener(this);



        initGroup();


        plusBtn.setBackground(new Color(253, 253, 248));
        plusBtn.setForeground(new Color(253, 253, 248));
        plusBtn.setIcon(new ImageIcon("./img/plus.png"));
        plusBtn.setBorder(null);
        plusBtn.setIconTextGap(0);
        plusBtn.setMargin(new Insets(2, 11, 2, 11));
        plusBtn.setMinimumSize(new Dimension(50, 50));
        plusBtn.setPreferredSize(new Dimension(50, 50));
        plusBtn.addActionListener(this);

        exploreBtn.setBackground(new Color(253, 253, 248));
        exploreBtn.setForeground(new Color(253, 253, 248));
        exploreBtn.setIcon(new ImageIcon("./img/explore_simple.png"));
        exploreBtn.setBorder(null);
        exploreBtn.setMargin(new Insets(2, 11, 2, 11));
        exploreBtn.setMinimumSize(new Dimension(50, 50));
        exploreBtn.setPreferredSize(new Dimension(50, 50));
        exploreBtn.addActionListener(this);

        //firstLeft Panel에 버튼들 붙이기
        firstLeftPanelLayout = new GroupLayout(firstLeftPanel);
        firstLeftPanel.setLayout(firstLeftPanelLayout);
        firstLeftPanelLayout.setHorizontalGroup(
                firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                .addGroup(firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(myBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(groupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(plusBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(exploreBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(11, Short.MAX_VALUE))
        );
        firstLeftPanelLayout.setVerticalGroup(
                firstLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstLeftPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(myBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(groupPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(plusBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(exploreBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        secondLeftPanel.setBackground(new Color(238, 241, 244));
        secondLeftPanel.setMinimumSize(new Dimension(242, 600));
        secondLeftPanel.setPreferredSize(new Dimension(242, 600));

        initHeader();

        secondLeftPanelLayout = new GroupLayout(secondLeftPanel);
        secondLeftPanel.setLayout(secondLeftPanelLayout);
        secondLeftPanelLayout.setHorizontalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, secondLeftPanelLayout.createSequentialGroup()
                                .addGroup(secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(headerFirst, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(headerLine, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        secondLeftPanelLayout.setVerticalGroup(
                secondLeftPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(secondLeftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(headerFirst, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(headerLine, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(505, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new Color(255, 255, 255));
        rightPanel.setMinimumSize(new Dimension(716, 600));
        rightPanel.setPreferredSize(new Dimension(716, 600));

        rightPanelLayout = new GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 716, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
                rightPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
        );

        //전체 프레임 레이아웃, first-second-right panel 붙임

        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(firstLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(firstLeftPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(secondLeftPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rightPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1030,600));
        setVisible(true);
    }
    void initGroup(){
        groupPanel.setBackground(new Color(230, 235, 244));
        groupPanel.setMinimumSize(new Dimension(50, 250));
        groupPanel.setPreferredSize(new Dimension(50, 250));

        group.setBackground(new Color(253, 253, 248));
        group.setFont(new Font("돋움", 1, 20)); // NOI18N
        //사용자 db 값에 따라 바껴야하는 값
        group.setText("JV");
        group.setBorder(null);
        group.setMargin(new Insets(2, 11, 2, 11));
        group.setMaximumSize(new Dimension(50, 50));
        group.setMinimumSize(new Dimension(50, 50));
        group.setPreferredSize(new Dimension(50, 50));
        group.addActionListener(this);

        groupPanelLayout = new GroupLayout(groupPanel);
        groupPanel.setLayout(groupPanelLayout);
        groupPanelLayout.setHorizontalGroup(
                groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(group,GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        groupPanelLayout.setVerticalGroup(
                groupPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupPanelLayout.createSequentialGroup()
                                .addComponent(group, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
        );

    }
    void initHeader(){
        headerFirst.setBackground(new Color(238, 241, 244));
        headerFirst.setMinimumSize(new Dimension(242, 80));
        headerFirst.setPreferredSize(new Dimension(242, 80));

        headerFirstLabel.setAlignment(Label.CENTER);
        headerFirstLabel.setFont(new Font("돋움", 1, 30)); // NOI18N
        headerFirstLabel.setMinimumSize(new Dimension(199, 45));
        headerFirstLabel.setText("Title Label");

        headerFirstLayout = new GroupLayout(headerFirst);
        headerFirst.setLayout(headerFirstLayout);
        headerFirstLayout.setHorizontalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(headerFirstLabel,GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerFirstLayout.setVerticalGroup(
                headerFirstLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerFirstLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(headerFirstLabel, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                .addContainerGap())
        );
        headerLine.setPreferredSize(new Dimension(242, 10));
    }
    void myBtnActionPerformed(){
        rightPanel.add(new JLabel("마이페이지"));
        JOptionPane.showMessageDialog(this, "마이페이지 버튼 눌렀네");

    }
    void groupActionPerformed(){
        rightPanel.add(new JLabel("스터디룸 그룹페이지"));
        JOptionPane.showMessageDialog(this, "스터디그룹 버튼 눌렀네");
    }
    void plusBtnActionPerformed(){
        rightPanel.add(new JLabel("스터디 그룹 생성 페이지"));
        JOptionPane.showMessageDialog(this, "스터디 그룹 생성 버튼 눌렀네");

    }
    void exploreBtnActionPerformed(){
        rightPanel.add(new JLabel("스터디 그룹 신청, 탐색 페이지"));
        JOptionPane.showMessageDialog(this, "스터디 그룹 탐색 버튼 눌렀네");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        rightPanel.removeAll();
        if(e.getSource().equals(group)){
            groupActionPerformed();
        }else if(e.getSource().equals(plusBtn)) {
            plusBtnActionPerformed();
        }else if(e.getSource().equals(exploreBtn)){
            exploreBtnActionPerformed();
        }
        else {
            myBtnActionPerformed();
        }
        rightPanel.updateUI();
    }

    public static void main(String[] args){
        new Background("테스트용");
    }
}
