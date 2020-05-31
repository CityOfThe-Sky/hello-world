package Solar;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import Util.GameUtil;
public class star {
 Image img;
 double x,y;
 int width,height;

 public star() {}
 public star(String imgpath,double x,double y)  {
	
	 this.img=GameUtil.getImage(imgpath);
	 this.x=x;
	 this.y=y;
	  //加载图片，记住获得宽度，高度的代码；
	 URL u = GameUtil.class.getClassLoader().getResource(imgpath);
	  BufferedImage img = null;
	  try{
	  img = ImageIO.read(u);
	  }catch(IOException e){
	  e.printStackTrace();
	  }
	 this.width=img.getWidth(null);
	 this.height=img.getHeight(null);
	
 }

 public void draw(Graphics g) {
	 g.drawImage(img,(int )x,(int )y, null);
 }
}
