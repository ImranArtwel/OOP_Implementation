package oop_review;

public class Mancity extends Player {
	
	public Mancity(String name, int positionX, int positionY)
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
	
	
	public static void mancityPlay(Mancity a, Mancity b, Mancity c,Ball ball) throws InterruptedException
	{
		
    		passBall(a,b,c, ball);
			shoot(c,ball,0,40);
		
	}
	

}
