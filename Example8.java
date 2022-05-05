public class Example8 {

	public static void main(String[] args) {
		String[] cars = {"Audi", "BMW", "Toyota", "VW", "Fiat", "Ford"};
		cars[1] = "Nissan";
		int[] ages = {1999, 2003, 1987, 1981, 1992, 2001};
		ages[3] = 1988;
		int i;
		for(i = 5; i >= 0; i--) {
			System.out.print(cars[i] + " ");
		}
//		System.out.println();
//		for(String car: cars) {
//			System.out.print(car + " ");
//		}
		i = 0;
		while(i < ages.length) {
			System.out.print(ages[i] + " ");
			i++;
		}
		}	
	}
