import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("문자열 입력 ==>");
		str = s.nextLine();
		
		System.out.printf("제일 처음 나오는 Java위치 ==>" );
		System.out.println(str.indexOf("Java"));
		
		System.out.printf("제일 마지막에 나오는 Java위치 ==>" );
		System.out.println(str.lastIndexOf("Java"));
		
		
	}

}
