package ch05_01_this;

public class Date {
	private int year = 1990;
	private int month = 1;
	private int day = 1;
	
	public Date(int year, int month, int day) { 
		setDate(year, month, day);
	}
	public int getMonth() { 
		return this.month;
	}
	
	public void setMonth(int moth) { 
		this.month = max(1, month);
		this.month = min(this.month, 12);
	}
	
	public void displayDate() { 
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}
	
	private int max(int x, int y) { 
		if(x > y)
				return x;
			return y;	
	}
	
	private int min(int x, int y) { 
		if(x < y)	
				return x;
			return y;
			
			
	}
}
