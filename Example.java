import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj napis, kt�ry zostanie wy�wietlony: ");
		String str = scanner.nextLine();
				
		System.out.println("Podaj ilo�� razy jak� ma si� wy�wietli� napis: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		int i = 0;
		while(i < num) {
			System.out.println(str);
			i++;
		}
	}
	

}
