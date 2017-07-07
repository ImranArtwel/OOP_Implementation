package oop_review;

public class Chelsea extends Player {
	
	

	public Chelsea(String name, int positionX, int positionY)
	{
		super(name,positionX,positionY);
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getpositionX()
	{
		return this.positionX;
	}
	public int getpositionY()
	{
		return this.positionY;
	}
	
	
	public static void chelseaPlay(Chelsea a, Chelsea b, Chelsea c,Ball ball) throws InterruptedException
	{
		passBall(a,b,c, ball);
		shoot(c,ball,100,40);
	}


}
