/*Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.

Using replaceAll() method and Unary Operator interface write a java program which replaces evry word in the list with its upper case equivalent.

Specifications:

public class Assignment4Q6 {
    public static void main(String[] args) {}
    public List<String> convertToUpperCase(List<String> list) {}  
} */

package Lambda8Assignment;

import java.util.List;

public class AssignmentQ6 {
	public static void main(String[] args) {
		
	}
    public List<String> convertToUpperCase(List<String> list) {
    list.replaceAll(s->s.toUpperCase());
    return list;
    } 
}
