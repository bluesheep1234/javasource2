
public class Problem_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet();
		pet1.type = "������";
		pet1.age = 8;
		
		Pet pet2 = new Pet();
		pet2.type = "�����";
		pet2.age = 13;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.type + "�� " + pet1.age + "�����Դϴ�.");
		System.out.println(pet2.type + "�� " + pet2.age + "�����Դϴ�.");
	}

}
