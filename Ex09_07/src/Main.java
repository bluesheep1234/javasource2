
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "  ÇÑ±Û  ABCD efgh  ";
		String result = "";
		
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') 
				result += str.substring(i, i + 1); 
		}
	}

}
