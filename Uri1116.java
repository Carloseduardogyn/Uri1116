package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1116 {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i =0; i <n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			
			if (b == 0) {
				System.out.println("divisao impossivel");
			}else {
				double div = a / b;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();

	}

}
