import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj napis, który zostanie wyœwietlony: ");
		String str = scanner.nextLine();
				
		System.out.println("Podaj iloœæ razy jak¹ ma siê wyœwietliæ napis: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		int i = 0;
		while(i < num) {
			System.out.println(str);
			i++;
		}
	}
	

}
