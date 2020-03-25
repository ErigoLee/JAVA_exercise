import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 입력하시오 : ");
		int year = sc.nextInt();
		
		if (year%4==0 &&(year%100!=0 || year%400==0))
			System.out.println("윤년입니다.");
		else
			System.out.println("평년입니다.");
		
		sc.close();
	}

}
