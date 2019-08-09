package tank;

import java.awt.Graphics;

import javax.swing.JPanel;

import tank.Map;

/**
 * boss,动画的效果
 * @author Administrator
 *
 */
public class Boss extends Character implements Runnable{
	
	
	public Boss() {
		super(Map.boss, 14, 23, 0, 0, 41, 34);
		//boss步伐发生变化的线程启动
		new Thread(this).start();
	}

	@Override
	public void move() {

	}
	
	@Override
		public void draw(Graphics g, JPanel j) {
			int x=getX();
			int y=getY();
			g.drawImage(Map.boss, x<<5, y<<5, (x+2)<<5, (y+2)<<5, 0, getDirection()*34, 41, (getDirection()+1)*34, j);
		}

	@Override
	public void changeStep() {

		int dir=getDirection();
		
		setDirection(++dir);
		
		if(dir>11) {
			setDirection(0);
		}
		
	}

	@Override
	public void run() {
		while(true) {
			changeStep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}

}