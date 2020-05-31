package Util;


import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * 
 * 游戏父类
 * @author Administrator
 *
 */
public class FatherMyGameFrame  extends Frame{
 
	
public void  launchFrame() {
		
		setSize(Contant.GAME_WIDTH, Contant.GAME_HEIGTHT);
		setLocation(100, 100);
		setTitle("连宗胜所有");
		setVisible(true);
	new PaintThread().start(); //启动重画线程
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			//设置可关闭窗口
			
		});
		
	}
/**
 * 重画窗口的线程类，是一个内部类
 * @author Administrator
 *
 */
class PaintThread extends Thread{
	
	public void run() {
		while(true) {//c使用程序时需要反复运行，所以需要死循环
			update(getGraphics());//重画窗口
			//repaint();//repaint会使窗口闪烁。。重画窗口
			try {
				Thread.sleep(100);//延迟0.05秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
}
