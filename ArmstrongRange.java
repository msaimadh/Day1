package com.capgemini.day2;

public class ArmstrongRange {

	public static int[] findAllArmstrongNumber(int start, int end) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int number;
				int digit;
				int sum;
				int allArmstrongNumbers[] = new int[10];
				int index = 0;
				for(int i = start; i <= end; i++) {
					number = i;
					sum = 0;
					while(number != 0) {
						digit = number % 10;
						sum = sum + digit * digit * digit;
						number = number / 10;
					}
					if(sum == i)
						allArmstrongNumbers[index++] = i;
				}
				return allArmstrongNumbers;
			}
	}


