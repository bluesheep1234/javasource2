import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.printf("문자열을 입력하세요 ==> ");
		String str = s.nextLine();
		
		String str2 = str.replace(" ", "$");
		System.out.println(str2);
		
		String str3 = str.substring(3,8);
		System.out.println(str3);
		
		String [] str4 = str.split(" ");
		for (int i = 0; i < str4.length; i++)
			System.out.println(str4);
	}

}
