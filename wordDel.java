package square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordDel {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		int i,j;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("give the input");
		String s=br.readLine();
		String word[]=s.split(" ");
		int x=word.length;
		for(i=0;i<x;i++)
		{
			if(word[i]!=null)
			{
				for(j=i+1;j<x;j++)
				{
					if(word[i].equals(word[j]))
					{
						word[j]=null;
					}
				}
			}
		}
		for(int k=0;k<x;k++)
		{
			if(word[k]!=null)
			{
				System.out.print(word[k]+' ');
			}
		}
	}
}
