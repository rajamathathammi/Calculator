package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 class BasicCalc1
{
	int a,b,c,ch,res;
	
	public BasicCalc1()
        {
		a=0;
		b=0;
		c=0;
		res=0;
	}
	
	public int menu()
        {
		System.out.println("select option");
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.Divison");
		System.out.println("*******");
		System.out.println("Enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		return 0;
    	}
	
    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter 1st number");
    	a=s.nextInt();
    	System.out.println("enter 2nd number");
    	b=s.nextInt();
    
    	
    	
    	
    }

    public void performOperation()
{
    	switch(ch)
    	{
    	case 1:res=add();
    	System.out.println(res);
    	break;
    	case 2:res=subtract();
    	System.out.println(res);
    	break;
    	case 3:res=multiply();
    	System.out.println(res);
    	break;
    	case 4:res=divide();
    	System.out.println(res);
    	break;
    	
    	
    	
        }
       
    }
    
	int add()
	{
		c=a+b;
		return c;
		
	}
	
	int subtract()
	{
		c=a-b;
		return c;
		
		
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
	}
	
}
public class BasicCalc
{
	public static void main(String args[])
	{
		 BasicCalc1 c=new  BasicCalc1();
		c.menu();
		c.userInputs();
		c.performOperation();
	}
}
	