package ch05_01;

import Date;

public class ch05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myDate = new Date(); 
		
		int month = myDate.getMonth();
		System.out.println(month);
		
	
		myDate.displayDate();
	}

}
