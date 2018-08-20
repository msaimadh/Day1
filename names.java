package square;
import java.util.Scanner;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		String[] names= {"Dave","Ann","George","sam","Ted","Gag","Saj","Agati",
				"Mary","Sam","Ayan","dev","Kity","Marry","Davis","Miller",
				"Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input names");
		String s=sc.nextLine();
		for(int i=0;i<22;i++)
		{
			String x=names[i];
			if(s.equals(x))
			{
				flag++;
			}
		}
		if(flag!=0)
		{
			System.out.println("yes matched"+flag+ "times");
		}
		else
		{
			System.out.println("not matched");
		}

	}

}
