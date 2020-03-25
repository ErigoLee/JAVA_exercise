import java.util.Scanner;

public class Exerise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX_VALUE = 100;
		int num;
		int sum=0;
		
		while (true)
		{
			num = sc.nextInt();
			if (num>MAX_VALUE)
				break;
			sum +=num;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
