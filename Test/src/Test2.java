
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10, hap = 0;
		while (i > 1) { 
			i--;
			if (i % 3 ==1)
				hap +=i;
		}
		System.out.printf("%d\n", hap);
	}

}
