import java.util.Scanner;

public class prime {
	void meth1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int count =0;
		for(int i= 1;i<=a;i++)
		{
			if(a % i == 0)
				count++;
		}
		if(count == 2)
		{
			System.out.println("the number is prime");
		}
		else
			System.out.println("the number is not prime");
	}
	public static void main(String[] args) {
		new prime().meth1();
		
	}
			
	}