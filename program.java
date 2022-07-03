import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImageReader {
private JFrame frame;

public static void main(String args[]){
    BufferedImage img = null;
    File f = null;
    try{
        f= new File("C:\\Users\\Lenovo\\Desktop\\Schedule.PNG");
        img = ImageIO.read(f);
    }catch(IOException e){
        System.out.println(e);
    }
}
}