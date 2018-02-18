package oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class hashset {
	public static void main(String[] args)
	{
		m1();
	}
	public static void m1(){
		HashSet<String> lhs = new HashSet<String>();
		lhs.add("praveen");
		lhs.add("kumar");
		lhs.add("garigipati");
		lhs.add("praveenP");
		lhs.add("test");
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
