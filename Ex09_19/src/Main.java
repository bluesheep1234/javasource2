class myChar { 
	char x;
	char y;
}

public class Main {

	static void func1(char x, char y) { 
		char imsi = 0; 
		imsi = x;
		x = y;
		y = imsi;
	}
	
	static void func2(myChar ch) { 
		char imsi = 0; 
		ch.x = ch.y;
		ch.y = imsi;
	}
	
	public static void main(String[] args) { 
		
		char x = 'A', y = 'Z';
		System.out.printf("원래 값   : x=%c, y=%c\n", x, y);
		func1(x, y);
		System.out.printf("값을 전달한 후 : x=%c, y=%c\n\n", x, y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값   : x=%c, y=%c\n", ch.x, ch.y);
	
		func2(ch);
		System.out.printf("주소를 전달한 후 : x=%c, y=%c\n", ch.x, ch.y);
	}
}