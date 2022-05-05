public class Example5 {

	public static void main(String[] args) {
		int n = 5, i = 0, j, sum = 0;

		while (i < n)
		{
		    j = 0;
		    while (j < i)
		    {
		        sum += j * i;
		        j++;
		    }		    
		    i++;
		}
		System.out.println(sum);
	}

}
