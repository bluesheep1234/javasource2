class Pet { 
	private String type; //�ֿϵ��� ����
	private int age; // �ֿϵ��� ���� ��
	static int count = 0; //�ֿϵ��� ��
	
	Pet(String type, int age) { 
		this.type = type; 
		this.age = age;
	}
	
	static int getCount() { 
		return count;
	}
	
	public void move() { 
		System.out.println(this.type + "�� �����Դϴ�");
	}
	
	public String getType() { 
		return this.type;
	}
	
	public int getAge() { 
		return this.age;
	}
}