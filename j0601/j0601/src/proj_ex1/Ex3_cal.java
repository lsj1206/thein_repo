package proj_ex1;

public class Ex3_cal {

	public static void main(String[] args) {
		
		MyCal mycal1 = new MyCal(1000, '+', 500);
		System.out.println(mycal1.result);
		
		MyCal mycal2 = new MyCal(1000, '-', 500);
		System.out.println(mycal2.result);
		
		MyCal mycal3 = new MyCal(1000, '*', 500);
		System.out.println(mycal3.result);
		
		MyCal mycal4 = new MyCal(1000 , '/', 500);
		System.out.println(mycal4.result);
		
		MyCal mycal5 = new MyCal(1000, '%', 500);
		System.out.println(mycal5.result);
		
		MyCal mycal6 = new MyCal(1000, '&', 500);
		System.out.println(mycal6.result);
	}

}
