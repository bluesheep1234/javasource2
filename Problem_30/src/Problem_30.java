
public class Problem_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet1 = new Pet();
		pet1.setType("강아지");
		pet1.setAge(8);
		
		Pet pet2 = new Pet();
		pet2.setType("고양이");
		pet2.setAge(13);
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.getType() + "는 " + pet1.getAge() + "개월입니다.");
		System.out.println(pet2.getType() + "는 " + pet2.getAge() + "개월입니다.");
	}

}
