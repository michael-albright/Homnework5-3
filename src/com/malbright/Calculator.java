package com.malbright;

public class Calculator {
	
	// variables
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private int g;
	
	// getters and setters
	public int getA()
	{
		return a;
	}
	
	public void setA(int a) 
	{
		this.a = a;
	}
	
	public int getB()
	{
		return b;
	}
	
	public void setB(int b) 
	{
		this.b = b;
	}
	
	public int getC()
	{
		return c;
	}
	
	public void setC(int c) 
	{
		this.c = c;
	}
	
	public int getD()
	{
		return d;
	}
	
	public void setD(int d) 
	{
		this.d = d;
	}
	
	public int getE()
	{
		return e;
	}
	
	public void setE(int e) 
	{
		this.e = e;
	}
	
	public int getF()
	{
		return f;
	}
	
	public void setF(int f) 
	{
		this.f = f;
	}
	
	public int getG()
	{
		return g;
	}
	
	public void setG(int g) 
	{
		this.g = g;
	}
	
	//Constructors
	public Calculator()
	{
		this(0, 0, 0, 0, 0, 0, 0); // why would i do this?
	};
	
	public Calculator(int a)
	{
		this(0, 0, 0, 0, 0, 0, 0); // why would i do this?
		this.a = a;
	};
	
	public Calculator(int a, int b)
	{
		this.a = a;
		this.b = b;
	};
	
	public Calculator(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	};
	
	public Calculator(int a, int b, int c, int d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	};
	
	public Calculator(int a, int b, int c, int d, int e)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	};
	
	public Calculator(int a, int b, int c, int d, int e, int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	};
	
	public Calculator(int a, int b, int c, int d, int e, int f, int g)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
	};
	
	//methods
	public void add(int a, int b)
	{
		System.out.println(a + b);
	}
	
	public void subtract(int a, int b)
	{
		System.out.println(a - b);
	}
	
	public void multiply(int a, int b)
	{
		System.out.println(a * b);
	}
	
	public void divide(int a, int b)
	{
		System.out.println(a / b);
	}
	
	public void square(int a)
	{
		System.out.println(a * a);
	}
	
}

