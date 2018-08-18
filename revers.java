package square;
import java.io.*;
public class revers 
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a sentense: ");
		String str= br.readLine();
		String words[] = str.split(" ");
		String ans="";
		for(int i=0; i< words.length ; i++)
		{
			String rev="";
			for(int j=words[i].length()-1; j>=0; j--)
			{
				rev = rev + words[i].charAt(j);
			}
			ans = ans + rev + " ";
		}
		System.out.println("The reversed string is " + ans);
	}

}
