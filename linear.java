package square;
import java.io.*;
public class linear
{
	public static void main(String [] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("enter the value to be searched");
		int n=Integer.parseInt(br.readLine());
	    for(int i=0;i<15;i++)
	    {
	    	if(n==arr[i])
	    	{
	    		System.out.println("number found at index = "+(i+1));
	    	System.exit(0);
	    	}
	    }
	    
	    	System.out.println("number not found");
	
	

}
}
