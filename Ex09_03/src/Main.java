import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str; 
		
		System.out.printf("���ڿ� �Է� ==>");
		str = s.nextLine();
		
		System.out.printf("��� ���ڿ� ==>");
		
		if (!str.startsWith("("));
		
		for (int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));
		
		if (!str.endsWith(")"));
		
		
	}

}
