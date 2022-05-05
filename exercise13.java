import java.util.Scanner;
public class exercise13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First number");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Second number");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Third number");
		int num3 = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		int avg = (num1 + num2 + num3) / 3;
		System.out.println(avg);
	}

}
