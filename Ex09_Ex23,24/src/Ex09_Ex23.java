import java.util.Scanner;

public class Ex09_Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String str;
		String reverse = "";
		
		System.out.printf("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		int count = str.length();
		
		for (int i = 0; i < str.length(); i++) {
			reverse += str.charAt(count - (i+1));
		}
		
		System.out.printf("������ �Ųٷ� ��� : %s \n", reverse);
		
		
		
	}

}
