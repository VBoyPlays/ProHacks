package crossyRoad;

import apcs.Window;

public class Game {
	
	
	public static void lines(){
		Window.out.color("light yellow");
		Window.out.rectangle(Window.width()/3, 0, 10, Window.height()*2);
		Window.out.rectangle(Window.width()*2/3, 0, 10, Window.height()*2);
	}

	public static void main(String[] args) {
		
		Window.size(600, 800); 
		
		Player pig = new Player(Window.width()/2, Window.height()*7/8, 50, "pink"); 
		Car car = new Car(Window.width()/6, 0, Window.random(10, 20), Window.width()/6, Window.height()/4, "light green", Window.random(1,  3));
		
		//Car car2 = new Car(Window.width()/2, 0, Window.random(5, 12), Window.width()/6, Window.height()/4, "light green", Window.random(1, 3));
		//Car car3 = new Car(Window.width()*5/6, 0, Window.random(5, 12), Window.width()/6, Window.height()/4, "light green");
	
		boolean gameOver = false;
		int lives = 3; 
		int score = 0; 
		
		while(true){
			
			if(gameOver == true){
				Window.out.background("gray");
				Window.out.color("white");
				Window.out.font("Times Roman", 50);
				Window.out.print("Game Over", Window.width()/2 - 130, Window.height()/2);
				
				Window.out.font("Times Roman", 20);
				Window.out.print("score = " + score, Window.width()/2 + 15, Window.height()/2 + 40);
			}
			
			else{
			Window.out.background("gray");
			
			car.draw();
			pig.draw();
			
			lines();
			
			pig.move();
			car.move();
			
			Window.out.color("black");
			Window.out.font("Ariel", 20);
			Window.out.print("lives = " + lives, Window.width()/15-20, Window.height()/15);
			
			if(car.y + ((car.height)/2) > pig.y - pig.radius && car.x == pig.x){
				lives -= 1; 
				car.y = -150; 
				if(lives == 0){
					gameOver = true; 
				}
				
			}
			
			Window.out.print("score = " + score, Window.width()/15-20, Window.height()/10);
			score += 1; 
			
			//car2.draw();
			//car2.move();
			//car3.draw();
			}
			
			Window.frame(50);
		}

	}

}
