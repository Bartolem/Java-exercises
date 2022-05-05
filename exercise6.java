import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number");
		int num1 = Integer.parseInt(scanner.nextLine());

		System.out.println("Second number");
		int num2 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		//addition
		int sum = num1 + num2;
		System.out.println(sum);
		//subtract
		int sub = num1 - num2;
		System.out.println(sub);
		//multiplication
		int mult = num1 * num2;
		System.out.println(mult);
		//divide
		int div = num1 / num2;
		System.out.println(div);
		//remainder
		int rem = num1 % num2;
		System.out.println(rem);

	}

}
