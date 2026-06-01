package proj_ex1;

public class MyCal {
	int num1;
	char formula;
	int num2;
	int result;
	
	public MyCal(int n, char f, int m) {
		num1 = n;
		num2 = m;
		formula = f;
		
		switch (f) {
			case '+':
				result = n + m;
				break;
			case '-':
				result = n - m;
				break;
			case '*':
				result = n * m;
				break;
			case '/':
				result = n / m;
				break;
			case '%':
				result = n % m;
				break;
			default:
				System.out.println("처리가능한 입력값이 아닙니다.");
				break;
		}
	}
}
