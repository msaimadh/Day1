package square;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class duplicateLetters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String input = in.readLine();
		String output = new String();
		char z;
		for(int i=0;i<input.length();i++)
		{
			z = input.charAt(i);
			if(z!=' ')
			{
				output=output+z;
				input=input.replace(z, ' ');
			}
		}
		System.out.println(output);
		
		

	}

}
