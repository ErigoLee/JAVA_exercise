import java.util.Scanner;

public class ImportEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오(띄어쓰기 없이 영문으로) : ");
		String name = sc.next();//문자열을 입력 받을 때
		
		System.out.println("나이를 입력하시오 : ");
		int age = sc.nextInt();
		
		System.out.println(name+"의 나이는 "+age+"살 입니다.");
		
		sc.close();
	}

}
