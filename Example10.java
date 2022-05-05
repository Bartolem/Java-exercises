
public class Example10 {

	public static void main(String[] args) {
		String str = "java";
		//System.out.println(str.charAt(str.length() -1));
//		//StringBuffer string = new StringBuffer(str);
//		String firstChar = String.valueOf(string.charAt(0));
//		string.deleteCharAt(0);
//		string.insert(0, firstChar.toUpperCase());
		
		for(int i = 0; i < 3; i++) {
			System.out.print(str.substring(0, 3));
		}
	}

}
