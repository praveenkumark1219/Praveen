import java.util.Scanner;

public class even {
	public static void main(String[] args) {
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		x=s.nextInt();
		if(x%2==0)
		{
			System.out.println("Number is Even");
        }
		else
		{
			System.out.println("Number is Odd");
		}
		
		
	}

}
