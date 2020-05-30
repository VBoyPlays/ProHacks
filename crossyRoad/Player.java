package crossyRoad;

import apcs.Window;
import apcs.Window.key;

public class Player {

	public int x, y; 
	public int radius; 
	public String color; 

	public Player(int x, int y, int radius, String color){
		this.x = x; 
		this.y = y; 
		this.radius = radius; 
		this.color = color; 
	}

	public void draw(){
		Window.out.color(color); 
		Window.out.circle(x, y, radius);

		Window.out.color("black");
		Window.out.circle(x-50, y-15, radius*2/5);
		Window.out.circle(x+50, y-15, radius*2/5);

		//Window.out.color("white");
		Window.out.circle(x-20, y+5, radius/4);
		Window.out.circle(x+20, y+5, radius/4);

		Window.out.color("white");
		Window.out.circle(x-15, y+8, radius/10);
		Window.out.circle(x+15, y+8, radius/10);

		Window.out.color("black");
		Window.out.circle(x, y+25, radius*1/5);		
	}

	public void move(){

		if(x<Window.width()*2/3 || x<Window.width()/3){
			if(key.pressed("right")){
				x += 200; 
				//Window.frame();
			}
		}
		if(x>Window.width()/3 || x>Window.width()*2/3){
			if(key.pressed("left")){
				x -= 200; 	
			}
		}
	}
}
