import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("���ڿ� �Է� ==>");
		str = s.nextLine();
		
		System.out.printf("���� ó�� ������ Java��ġ ==>" );
		System.out.println(str.indexOf("Java"));
		
		System.out.printf("���� �������� ������ Java��ġ ==>" );
		System.out.println(str.lastIndexOf("Java"));
		
		
	}

}
