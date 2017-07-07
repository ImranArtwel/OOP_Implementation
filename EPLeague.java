package oop_review;

public class EPLeague {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		try {
		
		//chelsea squad
		Chelsea chelsea1 = new Chelsea("Thibaut",15,40);
		Chelsea chelsea2 = new Chelsea("Hazard",40,70);
		Chelsea chelsea3 = new Chelsea("Costa",50,40);
		
		//mancity squad
		Mancity city1 = new Mancity("Bravo",85,40);
		Mancity city2 = new Mancity("Toure",70,10);
		Mancity city3 = new Mancity("Aguero",55,40);
		
		
		
		Ball ball = Ball.getBallInstance(15, 40); // ball starts with goalkeeper
		Field field = Field.getFieldInstance();
		field.startChelsea(chelsea1, chelsea2, chelsea3,ball);
		
		
		ball.setPositionX(85);
		ball.setPositionY(40);
		field.startMancity(city1, city2, city3,ball);
		
		
	 }
		catch(NullPointerException nptr){
			System.out.println("Ball and Field references cannot be null");
			
		}


	}

}
