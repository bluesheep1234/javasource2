

public class Employee {
	private String name;  	// �̸�
	private String address;	// �ּ�
	private String telno;	// ��ȭ��ȣ
	private Date joinDate;	// �Ի�����
	
	public Employee(String name, String address, String telno, Date joinDate) {
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.joinDate = joinDate;
	}
	
	public void displayEmployee() { // ������� ǥ��
		System.out.printf("�̸� : %s, �ּ� : %s, ��ȭ��ȣ : %s, �Ի����� : %s\n",  
						  name, address, telno, joinDate);
	}
	
	public double payCheck() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj;
		return (this.name == e.name && 
				this.address == e.address && 
				this.telno == e.telno);
	}
	
	
}
