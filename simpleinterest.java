package square;
import java.util.*;
public class simpleinterest
{
	public static void main(String[] args) 
	{
		float p,t,r,si;
		double ci;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principle: ");
		p = s.nextFloat();
		System.out.println("Enter the time: ");
		t = s.nextFloat();
		System.out.println("Enter the rate: ");
		r = s.nextFloat();
		si = (p*t*r)/100;
		ci = p* Math.pow((1+r/100),t);
		System.out.println("value of si: " +si+ "and" + "value of ci: "+ci);
	}

}
