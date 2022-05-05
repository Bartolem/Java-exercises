import java.util.Scanner;



public class exercise5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number");
		int num1 = Integer.parseInt(scanner.nextLine());

		System.out.println("Second number");
		int num2 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		int mult = num1 * num2;
		System.out.println(String.valueOf(mult));
	}

}
