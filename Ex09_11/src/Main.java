import java.util.Scanner;

public class Main {

	
		static int CoffeeMachine(int button) {
			System.out.printf("\n# 1. (�ڵ�����) �߰ſ� ���� �غ��Ѵ�\n");
			System.out.printf("# 2. (�ڵ�����) �������� �غ��Ѵ�\n");
			switch (button) {
			case 1: 
				System.out.printf("# 3. (�ڵ�����) ���� Ŀ�Ǹ� ź��\n");
				break;
			case 2: 
				System.out.printf("# 3. (�ڵ�����) ���� Ŀ�Ǹ� ź��\n");
				break;
			case 3: 
				System.out.printf("# 3. (�ڵ�����) ���� Ŀ�Ǹ� ź��\n");
				break;
			default: 
				System.out.printf("# 3. (�ڵ�����) �ƹ��ų� ź��\n");
				break;
			}
			
				System.out.printf("# 4. (�ڵ�����) ���� �״´�\n");
				System.out.printf("# 5. (�ڵ�����) ��Ǭ���� ���� ���δ�\n\n");
				
				return 0;
		}
		
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		int coffee; 
		int ret; 
	
		System.out.printf("� Ŀ�� �帱���? (1. ����, 2.����, 3,����)");
		coffee = s.nextInt();
		
		ret = CoffeeMachine(coffee);
		
		System.out.printf("�մ�~ Ŀ�� ���� �ֽ��ϴ�.\n");
				}
		}
	

