import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.141592;
		
		double radius;
		
		while(true) {
			System.out.println("원의 반지름? ");
			radius = sc.nextDouble();
			if(radius<=0)	//입력한 반지름이 0보다 작거나 같으면 반복문 탈출
				break;
			// 유효한 반지름인 경우 넓이를 계산 출력
			System.out.println("원의 넓이: "+(radius*radius*PI));
		}
		
		sc.close();
	}

}
