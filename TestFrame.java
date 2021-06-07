import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TestFrame implements ActionListener {
    private static JPanel rightPanel = new JPanel();
    //오른쪽 패널 변환화면.
    // 다른메소드에서 작업을 해 화면 내용을 바꾸기 때문에 멤버 공간에 선언

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setLocation(1030,600);
        frame.setPreferredSize(new Dimension(1030,600));
        Container test = frame.getContentPane();
        //test Frame = Root
        JPanel viewPanel = new JPanel();
        //view Panel = Body
        JPanel leftPanel = new JPanel();
        //leftPanel = Menu
        test.add(viewPanel);
        viewPanel.setLayout(new BorderLayout());
        viewPanel.add(leftPanel,BorderLayout.WEST);
        leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));
        ActionListener listener = new TestFrame();
        for(int i = 1 ; i<4; i++){
            JButton btn = new JButton(i+"번째 패널 호출");
            leftPanel.add(btn);
            btn.addActionListener(listener);
        }

        firstRight(); //초기화면
        viewPanel.add(rightPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    static void firstRight(){
        rightPanel.add(new JLabel("첫번째 패널"));
    }

    static void secondRight(){
        rightPanel.add(new JLabel("두번째 패널"));
    }

    static void thirdRight(){
        rightPanel.add(new JLabel("세번째 패널"));
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //액션 리스너 설정
        String btnVal = e.getActionCommand();
        //버튼값 받기
        rightPanel.removeAll();
        //오른쪽 패널 지우기
        if(btnVal.equals("1번째 패널 호출")){
            firstRight();
        }else if(btnVal.equals("2번째 패널 호출")){
            secondRight();
        }else{
            thirdRight();
        }
        rightPanel.updateUI(); //패널 화면 업데이트

    }
}
