import java.util.Scanner;

class Calc{
	
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

public class Example11 {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);		
		System.out.println("Podaj pierwsz¹ liczbê");
		int num1 = input.nextInt();
		System.out.println("Podaj drug¹ liczbê");
		int num2 = input.nextInt();
		
		System.out.println("Wybierz jakie dzia³anie chcesz wykonaæ\n1.Dodawanie\n2.Odejmowanie\n"
				+ "3.Mno¿enie\n4.Dzielenie");
		int choose = input.nextInt();
		
		input.close();
		
		int result1 = Calc.sum(num1, num2);
		int result2 = Calc.sub(num1, num2);
		int result3 = Calc.mult(num1, num2);
		int result4 = Calc.div(num1, num2);
		
		switch(choose) {
		case 1: {
			System.out.println(result1);
			break;
		}
		case 2:{
			System.out.println(result2);
			break;
		}
		case 3:{
			System.out.println(result3);
			break;
		}
		case 4:{
			System.out.println(result4);
			break;
		}
		}
		
	}

}
