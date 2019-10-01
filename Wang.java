import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Wang {
    //表示思聪的照片
    private BufferedImage image;
    //思聪的横坐标
    private int x;
    //纵坐标
    private int y;
     public Wang(){
         this.x=100;
         this.y=120;
         try {
             this.image=ImageIO.read(Wang.class.getResource("/Sicong.png"));
         } catch (IOException e) {
             e.printStackTrace();
         }

     }
    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
