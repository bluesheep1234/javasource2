import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		
		System.out.printf("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.printf("출력 문자열 ==>");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o')
				System.out.printf("%c", '$');
			else 
				System.out.printf("%c", str.charAt(i));
		}
	}

}
