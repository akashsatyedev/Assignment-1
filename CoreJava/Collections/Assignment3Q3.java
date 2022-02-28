
package CollectionsAssignment;
import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {
    public static void main(String[] args) {
    	ArrayList<String> a = new ArrayList<String>();
    	a.add("One");
    	a.add("Two");
    	a.add("Three");
    	a.add("Four");
    	ListIterator<String> itr = a.listIterator();
    	System.out.println("Traversal of elements goes like -> ");
        while(itr.hasNext()){

        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }

    	System.out.println("Reverse Traversal (Descending Order");
        while(itr.hasPrevious()){

        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}
