/* Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.

Description:-

Write a java program which will print the list of number using Thread and interface Consumer.

Specifications:
public class Assignment4Q8 {}
*/
package Lambda8Assignment; 

import java.util.Arrays;
import java.util.List;


public class AssignmentQ8 
{
	public static void main(String args[])
	{
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	new Thread(()->list.forEach(n-> System.out.println(n))).start();
	}

}