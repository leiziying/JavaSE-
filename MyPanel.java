import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

//JPanel  面板类
public class MyPanel extends JPanel {
    private BufferedImage image;
    private Wang wang;
    /**
     * 目的：把思聪拍在面板上
     */
    public void paintWsc() {
        //先加载思聪的图片
        try {
            image= ImageIO.read(MyPanel.class.getResource("/Sicong.png"));
            wang=new Wang();
            //调用父类的方法
            //重绘的方法，给面板绘制内容
            //当调用重绘的方法的时候，面板类的绘图的方法自动就会执行
            super.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //重写父类的方法
//父类的绘图的方法

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("绘图的方法执行了");
        //Graphics g画笔对象，把内容画到面板上
        //把image图片画到面板上
       // g.drawImage(image,150,150,null);
        g.drawImage(wang.getImage(),wang.getX(),wang.getY(),null);
    }
}
