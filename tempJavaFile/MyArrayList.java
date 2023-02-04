import java.util.ArrayList;
import java.util.Iterator;
public class MyArrayList 
{
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();

		list1.add("one");
		list1.add("two");
		
		list2.addAll(list1);
		list2.add("three");

		Iterator itr = list2.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
