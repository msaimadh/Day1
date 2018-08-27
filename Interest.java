package com.capgemini.day2;

public class Interest {

	public static double simpleInterest(double principle,double time,double rateofinterest) {
		// TODO Auto-generated method stub
		double simpleInterest;
		return simpleInterest=(principle*time*rateofinterest)/100;	
	}
	public static double compoundInterest(double principle,double  time, int rateofinterest) {
		// TODO Auto-generated method stub
		double compoundInterest;
		return compoundInterest=principle*Math.pow(1.0+rateofinterest/100.0,time)-principle;
	}

}
