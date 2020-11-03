package exception;


/*Exception 과 Error (에러-> 해결 못함-컴퓨터 다운돼)
 * 
 * Exception(예외)
 * 컴파일 예외 - 코딩할 때 나타남. 이클립스에서 바로 알려줌 
 * 런타임 예외 - 실행 할 때 나타는 예외사항
 * 
 */




public class ExceptionTest {

	public static void main(String[] args) {
		
		
		//↓컴파일 예외↓
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
		
			//e.printStackTrace();
			//↑오류가 어디서 발생했는지 알려줌↑
			System.out.println("입력 값을 확인해주세요");
			
		}
	}

}
