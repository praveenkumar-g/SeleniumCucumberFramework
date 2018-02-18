package oops;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class hashmap {

	public static void main(String[] args)
	{
	  LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
	  hm.put(4, "a");
	  hm.put(2, "b");
	  hm.put(3, "c");
	  hm.put(1, "d");
	  for(Map.Entry<Integer,String> m: hm.entrySet())
	  {
		  System.out.println(m.getKey()+"----"+m.getValue());		  
	  }
	  
	}
	
}
