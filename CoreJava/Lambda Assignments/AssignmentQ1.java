package Lambda8Assignment;

/*1. Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. You need to define a functional interface first.

Description:-

Define Functional Interface and write a program to perform arithmetic operations like add, subtract, multiply and divide using functional interface.

Examples:

              Input:-          13       5

              Output:-

                                      18.0      //Addition of 13 and 5

                                       8.0        //Subtraction of 13 and 5

                                       65.0      // Multiplication of 13 and 5  

                                       2.6        //Division of 13 and 5 */
public class AssignmentQ1 
{
	public double addition(int num1,int num2)
	{
		Arithmetic add=(a,b)->{ return (a+b);};
		return add.operation(num1,num2);
	}
	public double subtraction(int num1,int num2)
	{
		Arithmetic sub=(a,b)->{ return (a-b);};	
		return sub.operation(num1, num2);
	}
	public double multiplication(int num1,int num2)
	{
		Arithmetic mul=(a,b)-> { return (a*b);};
		return mul.operation(num1, num2);
	}
	public double division(int num1,int num2)
	{
		Arithmetic div=(a,b)->{ double res = (double)a/(double)b; return res;};	
		return div.operation(num1, num2);
	}
	
	public static void main(String args[])
	{
		
	}
	
	
}

@FunctionalInterface
interface Arithmetic
{
	public double operation(int a,int b);
}
