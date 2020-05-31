import java.awt.*;
public class BallGame1 extends Frame {

	Image img = Toolkit.getDefaultToolkit().getImage("images/sun.jpg");// 这种写法的问题就是开始时静态图像不会显示，需要最小化或最大化后才能显示
	double x = 200;
	double y = 200;
	double degree = 0;
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(img, (int)x, (int)y, null);
		// 椭圆
		/*
		x = 250+200*Math.cos(degree);
		y = 250+100*Math.sin(degree);
		*/
		
		//正弦曲线
		x = x + 1;
		y = 200 +50*Math.sin(degree);
		
		degree = degree + 0.1;
		
	}
	
	void launchFrame() {
		setSize(500,500);
		setLocation(50,50);
		setTitle("曲线");
		setBackground(Color.black);
		setVisible(true);
		new PaintTread().start();
	}
	
	
	public static void main(String[] args) {
		new BallGame1().launchFrame();
	}
	class PaintTread extends Thread{
		public void run() {
			while (true) {
				repaint();//重画窗口！
			    try {
					Thread.sleep(40);// 40ms,1s = 1000ms,1s画了25次
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 		    
			}
		}
	}
}
