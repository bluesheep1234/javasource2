class Pet { 
	String type; //애완동물 종류
	int age; // 애완동물 개월 수
	
	void move() {
		System.out.println(this.type + "가 움직입니다.");
	}
	
	int getAge() { 
		return this.age;
	}
}