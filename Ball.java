package oop_review;

public class Ball {
	
	private static Ball ball;
	private static int positionX;
	private static int positionY;
	
	
	
	private Ball(int x, int y){
	positionX = x;
	positionY =y;
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
		if(ball == null)
			ball = new Ball(x,y);
	 	return ball;
	}
	public String getBallPosition(){
		return "("+ball.getPositionX() + ","+ball.getPositionY()+")";
	}
	

}
