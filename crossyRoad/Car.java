package crossyRoad;

import apcs.Window;

public class Car {

	public int x, y, dy; 
	public int width, height; 
	public String color; 
	public int lane; 
	
	public Car(int x, int y, int dy, int width, int height, String color, int lane){
		this.x = x; 
		this.y = y; 
		this.dy = dy; 
		this.width = width; 
		this.height = height; 
		this.color = color; 
		this.lane = lane; 
	}
	
	public void draw(){
		Window.out.color(color);
		
		if(lane == 1){
			x = Window.width()/6; 
			Window.out.rectangle(x, y, width, height);
		}
		else if(lane == 2){
			x = Window.width()/2; 
			Window.out.rectangle(x, y, width, height);
		}
		else if(lane ==3){
			x = Window.width()*5/6;
			Window.out.rectangle(x, y, width, height);
		}

	}
	
	public void move(){
		
		if(y - (height/2) < Window.height()){
		y += dy; 
		}
		else{
			lane = Window.random(1, 3); 
			y = -150; 
			dy += 5; 
			
		}
	}
	
}
