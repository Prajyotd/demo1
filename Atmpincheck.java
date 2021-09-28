package math1;
import java.util.Scanner;
public class Atmpincheck {

	public static void main(String[] args) {
		int password;
		
		Scanner s = new Scanner(System.in);
		for( int i=1;i<=3;i++)
		{
			System.out.println("enter password");
		password = s.nextInt();
		
		if(password==1234) {
			System.out.println("access allowed");
			break;
		}
		if(i==4)
		System.out.println("card blocked");	
	}

}
}