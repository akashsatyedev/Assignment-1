/* Write an application using lambda expressions to print Orders having 2 criteria implemented: 1) order price more than 10000 2) order status is ACCEPTED or COMPLETED.

Description:

Write a program in such a way that it has a method which returns the list of orders satisfying the 2 conditions mentioned in the question.

Specifications:

import java.util.ArrayList;

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {}
    public static void main(String[] args) {}
}

    */

package Lambda8Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AssignmentQ3 
{
	public static void main(String args[])
	{
		System.out.println("Using Functional Interface with Consumer Predicate Function and Supplier");
		int n=5;
		modifyValue(n,v->v+10);
		modifyValue(n,v->v*100);
		
		System.out.println("Using Consumer Interface");
		Consumer<Product> updatePrice=p->p.setPrice(10.2);
		Product p=new Product();
		updatePrice.accept(p);
		p.printPrice();
		
		System.out.println("Using Supplier Interface");
		int i=3;
		display(()-> i+10);
		display(()-> i+100);
		
		System.out.println("Using Predicate Interface");
		Predicate<String> isALongWord =t->t.length() >10;
		String s="Successfully";
		boolean result = isALongWord.test(s);
		System.out.println(result);
		
	}
	
	static void modifyValue(int v, Function<Integer,Integer> function)
	{
		int result=function.apply(v);
		System.out.println(result);
	}
	
	static class Product
	{
		private double price=0.0;
		public void setPrice(double price)
		{
			this.price=price;
		}
		public void printPrice()
		{
			System.out.println(price);
		}
	}
	
	static void display(Supplier<Integer> arg)
	
	{
	System.out.println(arg.get());	
	
	}
	
	
}
