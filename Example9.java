import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Podaj pierwsz� liczb�");
		int num1 = input.nextInt();
		System.out.println("Podaj drug� liczb�");
		int num2 = input.nextInt();
		
		System.out.println("Wybierz jakie dzia�anie chcesz wykona�\n1.Dodawanie\n2.Odejmowanie\n"
				+ "3.Mno�enie\n4.Dzielenie");
		int choose = input.nextInt();
		
		input.close();
		
		switch(choose) {
		case 1: {
			System.out.println(sum(num1, num2));
			break;
		}
		case 2:{
			System.out.println(sub(num1, num2));
			break;
		}
		case 3:{
			System.out.println(mult(num1, num2));
			break;
		}
		case 4:{
			System.out.println(div(num1, num2));
			break;
		}
		}
		
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int mult(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}

}
