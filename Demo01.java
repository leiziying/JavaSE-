import javax.swing.*;

public class Demo01 {
    public static void main(String[] args) {
        //窗口类
        JFrame frame =new JFrame();
        //调用对象中提供的方法
        frame.setTitle("王思聪吃热狗");
        //设置窗口的大小
        frame.setSize(500,650);
        //创建面板
        MyPanel panel =new MyPanel();
        //把面板放到窗口上
        frame.add(panel);//把panel放在窗口上
        panel.paintWsc();
        //显示窗口
        frame.setVisible(true);
    }
}
