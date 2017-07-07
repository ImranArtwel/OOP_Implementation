package oop_review;

public class Ball {
	
	private static Ball ball;
	private static int positionX;
	private static int positionY;
	
	
	
	private Ball(){
	
	}
	static {
		ball = new Ball();
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public  void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	public static Ball getBallInstance(int x, int y)
	{
	 	return ball;
	}
	

}
