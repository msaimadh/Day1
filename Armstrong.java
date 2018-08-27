package com.capgemini.day2;

public class Armstrong {

	public static boolean checkArmstrongNumber(int num) 
	{
		// TODO Auto-generated method stub
		int number=num;
		int digit;
		int sum=0;
		while(num!=0)
		{
			digit=num%10;
			sum = sum+digit*digit*digit;
			num = num/10;
		}
		if(sum==number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
