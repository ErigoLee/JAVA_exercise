import java.util.Scanner;

public class ImportEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("두 정수의 합은 "+c+"입니다.");
		
		sc.close();
	}

}
