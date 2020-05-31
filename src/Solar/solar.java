package Solar;

import java.awt.Graphics;
import java.awt.Image;

import Util.Contant;
import Util.FatherMyGameFrame;
import Util.GameUtil;

/**
 * 太阳系主窗口
 * @author Administrator
 *
 */
public class solar  extends  FatherMyGameFrame{
	Image b=GameUtil.getImage("images/bg.jpg");
	star sun=new star("images/sun.jpg",Contant.GAME_WIDTH/2,Contant.GAME_HEIGTHT/2);
	planet me=new planet(sun,"images/Mercury.jpg",90,60,0.023,true);
	planet ve=new planet(sun,"images/Venus.jpg",120,80,0.024,true);
	planet earth=new planet(sun,"images/Earth.jpg",150,100,0.025,true);
	planet moon=new planet(earth,"images/moon.jpg",30,25,0.1,false);
	planet Mars=new planet(sun,"images/Mars.jpg",200,130,0.03,true);
	planet Jupiter=new planet(sun,"images/Jupiter.jpg",250,160,0.031,true);
	planet Saturn=new planet(sun,"images/Saturn.jpg",300,180,0.033,true);
	planet Uranus=new planet(sun,"images/Uranus.jpg",320,200,0.034,true);
	planet Neptune=new planet(sun,"images/Neptune.jpg",340,230,0.037,true);
	planet pt=new planet(sun,"images/Pluto.jpg",380,260,0.039,true);
	public void paint(Graphics g) {
		g.drawImage(b, 0, 0,800,800 ,null);
		me.draw(g);
		ve.draw(g);
		sun.draw(g);
		earth.draw(g);
		moon.draw(g);
		Mars.draw(g);
		Jupiter.draw(g);
		Saturn.draw(g);
		Uranus.draw(g);
		Neptune.draw(g);
		pt.draw(g);
	}
public static void main(String[] args) {
	new solar().launchFrame();
}
//利用双缓冲来消除闪烁
private  Image  offScreenImage=null;
public void update(Graphics g) {
	if(offScreenImage==null) 
		offScreenImage=this.createImage(Contant.GAME_WIDTH,Contant.GAME_HEIGTHT);
	Graphics gOff=offScreenImage.getGraphics();
	paint(gOff);
	g.drawImage(offScreenImage, 0, 0, null);
}
}
