import java.awt.*;
public class BallGame1 extends Frame {

	Image img = Toolkit.getDefaultToolkit().getImage("images/sun.jpg");// ����д����������ǿ�ʼʱ��̬ͼ�񲻻���ʾ����Ҫ��С������󻯺������ʾ
	double x = 200;
	double y = 200;
	double degree = 0;
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(img, (int)x, (int)y, null);
		// ��Բ
		/*
		x = 250+200*Math.cos(degree);
		y = 250+100*Math.sin(degree);
		*/
		
		//��������
		x = x + 1;
		y = 200 +50*Math.sin(degree);
		
		degree = degree + 0.1;
		
	}
	
	void launchFrame() {
		setSize(500,500);
		setLocation(50,50);
		setTitle("����");
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
				repaint();//�ػ����ڣ�
			    try {
					Thread.sleep(40);// 40ms,1s = 1000ms,1s����25��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 		    
			}
		}
	}
}
