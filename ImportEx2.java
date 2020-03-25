import java.util.Scanner;

public class ImportEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str);
		
		String str2 = sc.next();
		
		System.out.println(str2);
		
		sc.close();
	}

}

/*
complier
sc.nextLine() -> A다음은 B이고, B다음은 C이다.
println()     -> A다음은 B이고, B다음은 C이다.
sc.next()     -> A다음은 B이고, B다음은 C이다.
println()     -> A다음은
*/
