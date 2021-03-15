package com.ssmae;

import com.malbright.Calculator;

public class MagicCalculator extends Calculator
{
	
	//private int factorial = 1;
//	public static double factorial = 1;
//	public double getFactorial()
//	{
//		return factorial;
//	}
//	
//	public void setFactorial(double a)
//	{
//		this.factorial = factorial;
//	}
	
	public void sqrt(double a)
	{
		double x = Math.sqrt(a);
		System.out.println(x);
	}
	
	public double sqrtOf(double a)
	{
		return Math.sqrt(a);
	}
	
	
	public double sinOf(double a) 
	{
		return Math.sin(a);
	}
	
	public void sin(double a)
	{
		double x = Math.sin(a);
		System.out.println(x);
	}
	
	public double cosOf(double a)
	{
		return Math.cos(a);
	}
	
	public void cos(double a)
	{
		double x = Math.cos(a);
		System.out.println(x);
	}
	
	public double tanOf(double a)
	{
		return Math.tan(a);
	}
	
	public void tan(double a) 
	{
		double x = Math.tan(a);
		System.out.println(x);
	}
	
	public long factorialOf(int n) 
	{
	    long fact = 1;
	    for (int i = 2; i <= n; i++)
	    {
	        fact = fact * i;
	    }
	    return fact;
	}
	
	public void factorial(long n) 
	{
		long fact = 1;
		for(long i = 2; i <= n; i++) 
		{
			fact = fact * i;
			System.out.println(fact);
		}
	}

//	public void factorial(double a) 
//	{
//		for(int i = 1; i <= a; i++)
//		{
//			factorial = factorial * i;
//			System.out.println(factorial);
//		}
	
//	}
	
}


//	public int factorialOf(int a)
//	{
//		for(int i = 1; i <= a; i++)
//		{
//			factorial = factorial * i;
//			return factorial;
//		}
//	}
//	private double sqrt(double a) {
//		return Math.sqrt(a);
//	}
