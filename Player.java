package oop_review;


public abstract class Player {
	
	protected String name;
	protected int positionX;
	protected int positionY;
	
	public Player(String name, int positionX, int positionY)
	{
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	
	
	public static  void passBall(Player player1, Player player2, Player player3, Ball ball){
		
		System.out.println("Ball is at position ("+ ball.getPositionX() + ","+ ball.getPositionY() + 
				") with "+ player1.getName());
		
		System.out.println(player1.getName() + " passes ball to "+ player2.getName());
		ball.setPositionX(player2.getPositionX());
		ball.setPositionY(player2.getPositionY());

		
		
		System.out.println("Ball is at position ("+ ball.getPositionX() + ","+ ball.getPositionY() + 
				") with "+ player2.getName());
			
		System.out.println(player2.getName() + " passes ball to "+ player3.getName());
		
		ball.setPositionX(player3.getPositionX());
		ball.setPositionY(player3.getPositionY());
		
	}
		
	
	public static void shoot(Player player3, Ball ball, int goalXposition, int goalYposition)
	{
		System.out.println(player3.getName() + " shoots");
		ball.setPositionX(goalXposition);
		ball.setPositionY(goalYposition);
		System.out.println("It's a goal. What a brilliant goal from "+player3.getName());
		
	}
	public void getPlayerPosition(Player player)
	{
		System.out.println(player.getName()+" is on position ("+ player.getPositionX()+","+ player.getPositionY()+")");
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

}

