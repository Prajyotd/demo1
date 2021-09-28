package assignment02;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n,c,a=0,b=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of n");
        n = sc.nextInt();
		System.out.print(a+ " " +b);
		
		for(int i=1; i<=10; i++) {
			
			c = a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}

	}

}
