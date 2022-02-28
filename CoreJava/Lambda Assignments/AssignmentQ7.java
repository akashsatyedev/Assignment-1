/* Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.

Description:-

Write a java program using Map.entrySet() method & a StringBuilder which will return a string by appending all the key value pairs of a map into a single string ,in insertion order.

Specifications:

public class Assignment4Q7 {
    public static void main(String[] args) {}
    public String convertKeyValueToString(HashMap<String, Integer> map) {}
} */

package Lambda8Assignment;

import java.util.HashMap;

public class AssignmentQ7
{
	public static void main(String args[])
	{
		
	}
	
	public String ConvertKeyValueToString(HashMap<String,Integer>map)
	{
		StringBuilder mapAsString=new StringBuilder();
		for(HashMap.Entry<String,Integer> mp:map.entrySet())
		{
			mapAsString.append(mp.getKey()+mp.getValue());
		}
		return mapAsString.toString();
		
	}
}
