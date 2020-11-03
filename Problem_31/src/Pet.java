class Pet { 
	private String type; //애완동물 종류
	private int age; // 애완동물 개월 수
	static int count = 0; //애완동물 수
	
	Pet(String type, int age) { 
		this.type = type; 
		this.age = age;
	}
	
	static int getCount() { 
		return count;
	}
	
	public void move() { 
		System.out.println(this.type + "가 움직입니다");
	}
	
	public String getType() { 
		return this.type;
	}
	
	public int getAge() { 
		return this.age;
	}
}