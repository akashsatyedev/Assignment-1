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
import java.util.ArrayList;
import java.util.function.Predicate;

public class AssignmentQ2
{
	private int totalPrice;
	private String status;
	
	public AssignmentQ2(int totalPrice,String status)
	{
		super();
		this.totalPrice=totalPrice;
		this.status=status;
	}
	
	public static void main(String args[])
	{

		ArrayList<AssignmentQ2> price=new ArrayList<AssignmentQ2>();
		price.add(new AssignmentQ2(18000,"Accepted"));price.add(new AssignmentQ2(20000,"Completed"));price.add(new AssignmentQ2(15000,"Completed"));
		price.add(new AssignmentQ2(7000,"Rejected"));
		price.add(new AssignmentQ2(25000,"Completed"));
		
		Predicate<AssignmentQ2> pr=e->(e.totalPrice>10000 && (e.status.contentEquals("Accepted") || e.status.contentEquals("Completed")));
		for (AssignmentQ2 i:price)
		{
			if(pr.test(i))
			{
				System.out.println("price:"+i.totalPrice+ " Status:"+i.status);
			}
		}
	}
}
