package Solar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.security.GeneralSecurityException;
import Util.GameUtil;
public class planet  extends star{
	//除了图片，坐标，星星沿着某个椭圆运行：长轴，短轴，速度，角度绕某个Star飞
	double longAxis;
	double shortAxis;
	double speed;
	double degree;
	 star center;
	 boolean statellite;
	public planet(star center,String imgpath,  double longAxis, double shortAxis,
			double speed,boolean statellite) {	
		this.img=GameUtil.getImage(imgpath);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;
		this.x=center.x+longAxis;
		this.y=center.y+shortAxis;
		this.statellite=statellite;
	}
 public void draw(Graphics g) {
	super.draw(g);
	move();
	if(statellite==true) {//卫星的话就不用画椭圆
	drawTrace(g);
	}
 }
 //画椭圆
 public void drawTrace(Graphics g) {
	 double ovalx,ovaly,ovalwidth,ovalheight;
	 ovalwidth=longAxis*2;
	 ovalheight=shortAxis*2;
	 ovalx=center.x-longAxis+center.width/2;
	 ovaly=center.y-shortAxis+center.height/2;
	g.setColor(Color.BLUE);
	g.drawOval((int )ovalx, (int )ovaly, (int )ovalwidth, (int )ovalheight);
 }
 public void move() {
	 //椭圆飞行
	 x=center.x+center.width/2+longAxis*Math.cos(degree);
	 y=center.y+center.height/2+shortAxis*Math.sin(degree);
	 degree+=speed;
 }
}
