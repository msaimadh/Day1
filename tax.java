package square;
import java.util.Scanner;
public class tax 
{
	public static void main(String[] args)
	{
		double income,CTC;
		double tax=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the income: ");
		income = s.nextFloat();
		if(income>0 && income<180000)
		{
			System.out.println("amount of tax payable was nill");
		}
		if(income>180000 && income<=300000)
		{
			tax = (income*10)/100;
			System.out.println("tax: "+tax);
			
		}
		if(income>300000 && income<=500000)
		{
			tax = (income*20)/100;
			System.out.println("tax: "+tax);
		}
			
		if(income>500000 && income<=1000000)
		{
			tax = (income*30)/100;
			System.out.println("tax: "+tax);
		}
		
	}

}
