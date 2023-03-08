
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 150;
		int [] a = new int[max];
		
		for (int i = 0; i < max; i++) 
			a[i] = 0;
		
		for (int i = 2; i < max; i++) {
			if (a[i-1] == 0) {
				for (int j = 2; i*j <= max; j++)
					a[i*j-1] = 1;
			}
			else
				continue;
		}
		
		for (int i = 1; i < max; i++) {
			if (a[i] == 0)
				System.out.print((i+1) + " ");
		}
	}

}
