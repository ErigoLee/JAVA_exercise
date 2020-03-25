import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("밑변의 길이를 입력하세요 :");
		double length = sc.nextDouble();
		
		System.out.println("삼각형의 높이를 입력하세요 :");
		double height = sc.nextDouble();
		
		System.out.println("삼각형의 넓이 : "+(length*height*0.5));
		
		sc.close();
	}

}
