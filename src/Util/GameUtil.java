package Util;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.io.IOException;
/**
 * 游戏开发中常用的工具类，加载图片
 * @author Administrator
 *
 */
import java.net.URL;

import javax.imageio.ImageIO;

import java.awt.Image;

public class GameUtil {
	private GameUtil() {
		
	}
	//工具类一般会将构造方法私有
	public static Image getImage(String path) {//加载图片	
		return Toolkit.getDefaultToolkit().getImage(GameUtil.class.getClassLoader().getResource(path));

	}
}
