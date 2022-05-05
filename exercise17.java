import java.util.Scanner;
public class exercise17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		String num1 = input.next();
		
		System.out.println("Enter second number: ");
		String num2 = input.next();
		input.close();
		
		int binNum1 = Integer.parseInt(num1, 2);
		int binNum2 = Integer.parseInt(num2, 2);
		
		int sumBin = binNum1 + binNum2;
		System.out.println("The sum of binary numbers is: " + Integer.toBinaryString(sumBin));
	}

}
