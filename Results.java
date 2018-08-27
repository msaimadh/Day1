package com.capgemini.day2;

public class Results {

	public static String grade(int x, int y, int z) 
	{
		// TODO Auto-generated method stub
		if(x>=60 && y>=60 && z>=60)
		{
			return "passed";
		}
		else if((x>=60 && y>=60 && z<60)||(y>=60 && z>=60 && x<60)||(x>=60 && z>=60 && y<60))
		{
			return "promoted";
		}
		else if(x<60 && y<60 && z<60)
		{
			return "failed";
		}
		
		return null;
}
}
