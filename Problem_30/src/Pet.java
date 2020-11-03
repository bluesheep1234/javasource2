class Pet { 
	private String type; //애완동물 종류
	private int age; // 애완동물 개월 수
	
	public void move() {
		System.out.println(this.type + "가 움직입니다.");
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getAge() { 
		return this.age;
	}
}