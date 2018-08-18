package square;
import java.util.Scanner;
public class cui
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String un="madhuri";
		String pass="madhu@1996";
		int count=0;
		while(count<3)
		{
			System.out.println("Enter username");
			String username=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			if(un.equals(username)&&pass.equals(password))
			{
			  System.out.println("welcome "+username);
			  return;
			}
			else {
				count++;
				if(count!=3)
					System.out.println("wrong username or password. Enter again");
			}
		}
		if(count==3)
		{
			System.out.println("contact Admin");
		}
	}
}
