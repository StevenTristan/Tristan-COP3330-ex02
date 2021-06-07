import java.util.Scanner;

public class example2
{
	public static void main(){
		ex2();
}
	private static void ex2()
	{
		System.out.println("What is the input string?");
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int count = (char)input.length();
		System.out.println(input + " has " + count + " characters");
	}

}
