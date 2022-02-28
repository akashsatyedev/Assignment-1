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
}        */



package Lambda8Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AssignmentQ5 {

		List<String> list= Arrays.asList("alpha","bravo","charlie","delta","echo","foxrot");
	 public static String processWords(List<String> list)
	 {
		 StringBuilder firstletters= new StringBuilder();
		 Consumer<List<String>> c= lis ->
		 {
		for(int i=0;i<lis.size();i++)
		{
			String word=list.get(i);
			firstletters.append(word.charAt(0));
		}
		 };
		 c.accept(list);
		 return firstletters.toString();
	 }
	 
	 public static void main(String[] args)
	 {
		 
	}
	
}
