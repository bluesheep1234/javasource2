public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date joinDate = new Date(2020, 1, 1);
		RegularEmployee re = new RegularEmployee("����", "�����", "123-4567", joinDate, 3000000);
		re.displayEmployee();
		double salary = re.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);

		Employee e = new RegularEmployee("����", "�λ��", "234-5678", joinDate, 4000000);
		e.displayEmployee();
		
		TemporaryEmployee te = new TemporaryEmployee("���", "������", "345-6789", joinDate, 100000);
		te.displayEmployee();
		te.setWorkHours(240);
		salary = te.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		SalesEmployee se = new SalesEmployee("���", "��õ��", "456-7890", joinDate, 1000000, 0.01);
		se.displayEmployee();
		se.setSales(150000000);
		salary = se.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		RegularEmployee re2 = se;
		salary = re2.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		RegularEmployee re3 = (RegularEmployee)e;
		salary = re3.payCheck();
		System.out.printf("�޿��� : %.0f ��\n", salary);
		
		
		Department dept = new Department();
		dept.addEmployee(re);
		dept.addEmployee(e);
		dept.addEmployee(te);
		dept.addEmployee(se);
		dept.display();
		
		
		String str1 = "I love you.";
		String str2 = new String("I love you.");
		if(str1 == str2)
			System.out.println("==");
		else
			System.out.println("!=");
		if(str1.equals(str2))
			System.out.println("==");
		else
			System.out.println("!=");

		
		RegularEmployee re4 = new RegularEmployee("����", "�����", "123-4567", joinDate, 3000000);
		re.displayEmployee();
		re4.displayEmployee();
		if(re == re4)
			System.out.println("==");
		else
			System.out.println("!=");
		if(re.equals(re4))
			System.out.println("==");
		else
			System.out.println("!=");
	}

}
