class Car {
	private String color;
	private int speed = 0;
	
	public void UpSpeed(int value) {
		if (speed + value > 200)
			speed = 200;
		else
			speed += value;
		
		System.out.println("현재 속도 ==>" + getSpeed());
	}
	
	public void DownSpeed(int value) {
		if (speed - value < 0);
			speed = 0;
		else	
			speed -= 0;
		System.out.println("현재 속도 ==>" + getSpeed());
		
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSpeed() { 
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) { 
		this.speed = speed;
	}
}