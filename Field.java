package oop_review;

public class Field {
	
	static Field field;
	
	private Field(){}
	
	public static Field getFieldInstance()
	{
		if(field == null)
			field = new Field();
		
		return field;
	}
	
	public void startChelsea(Chelsea a, Chelsea b, Chelsea c,Ball ball) throws InterruptedException
	{
		Chelsea.chelseaPlay(a,b,c,ball);
		
	}
	public void startMancity(Mancity a, Mancity b, Mancity c,Ball ball) throws InterruptedException
	{
		Mancity.mancityPlay(a,b,c,ball);
		
	}

}
