import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i < 11; i++) {
			System.out.println(num * i);
			
		}
	}

}
