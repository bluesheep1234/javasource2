class Pet { 
	private String type; //�ֿϵ��� ����
	private int age; // �ֿϵ��� ���� ��
	
	public void move() {
		System.out.println(this.type + "�� �����Դϴ�.");
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