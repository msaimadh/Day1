package square;
import java.util.*;
public class marks {
	public static void main(String[] args)
	{
	int x,y,z;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the a marks");
	x = s.nextInt();
	System.out.println("Enter the b marks");
	y = s.nextInt();
	System.out.println("Enter the b marks");
	z = s.nextInt();
	if(x>=60 && y>=60 && z>=60)
	{
		System.out.println("passed");
	}
	else if((x>=60 && y>=60 && z<60)||(y>=60 && z>=60 && x<60)||(x>=60 && z>=60 && y<60))
	{
		System.out.println("promoted");
	}
	else if(x<60 && y<60 && z<60)
	{
		System.out.println("failed");
	}
	}}
	

