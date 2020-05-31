import java.awt.*;

public class BallGame2 extends Frame {

	Image img = Toolkit.getDefaultToolkit().getImage("images/sun.jpg");
	
	double x = 100;
	double y = 100;
	double degree = 3.14/3;
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(img, (int)x, (int)y, null);
		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		if(y > 500 -30 | y < 30) {
			degree = -degree;
		}
		if(x > 500 -30 | x < 0) {
			degree = 3.14 - degree;
		}
	}
	
	
	void lauchFrame() {
		setSize(500, 500);
		setLocation(50, 50);
		setTitle("弹球");
		setBackground(Color.black);
		setVisible(true);
		new PaintThread().start();
		
	}
	
	public static void main(String[] args) {
		new BallGame2().lauchFrame();
		
	}
	class  PaintThread extends Thread {
		public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

}
