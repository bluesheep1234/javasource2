
public class Problem_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet();
		pet1.type = "강아지";
		pet1.age = 8;
		
		Pet pet2 = new Pet();
		pet2.type = "고양이";
		pet2.age = 13;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.type + "는 " + pet1.age + "개월입니다.");
		System.out.println(pet2.type + "는 " + pet2.age + "개월입니다.");
	}

}
