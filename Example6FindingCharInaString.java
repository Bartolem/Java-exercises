public class Example6FindingCharInaString {

	public static void main(String[] args) {
		String someString = "java";
		char someChar = 'a';
		int count = 0;
		
		if(someString.startsWith("ja", 1)) {
			System.out.println("It's true");
		}
		else {
			System.out.println("It's false");
		}
		
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		
		System.out.println(count);
	}

}
