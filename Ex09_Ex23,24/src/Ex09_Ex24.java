import java.util.Scanner;

public class Ex09_Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String in, out = "";
		char ch;
		int count, i;
		int diff = 'a' - 'A';
		
		System.out.printf("���ڿ��� �Է��ϼ��� ==> ");
		in = s.nextLine();
		
		count = in.length();
		
		for (i = 0; i < count; i++) { 
			ch = in.charAt(i);
			if (('A' <= ch) && (ch <= 'Z'))
				out += (char) (ch + diff);
			else if (('a'))
		}
		
		System.out.print("��ȯ�� ���ڿ� ==> " + str.toUpperCase().toLowerCase());
	}

}
