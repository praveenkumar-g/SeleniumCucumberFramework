package oops;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class linkedhashset {
	public static void main(String[] args)
	{
		m1();
	}
	public static void m1(){
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("praveen");
		lhs.add("kumar");
		lhs.add("garigipati");
		lhs.add("praveenT");
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
