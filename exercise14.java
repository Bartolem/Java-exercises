
public class exercise14 {

	public static void main(String[] args) {
		String var1 = "pizza";
		String var2 = "cola";
		String temp;
		
		temp = var1;
		var1 = var2;
		var2 = temp;
		
		System.out.println(var1);
		System.out.println(var2);
	}

}
