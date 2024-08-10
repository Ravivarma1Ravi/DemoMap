package Demo;
import java.util.*;
public class DemoMap 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> l = new HashMap<String,Integer>();
		l.put("one",1);
		l.put("two",2);
		l.put("three",3);
		l.put("four",4);
		l.put("five",5);
		l.put("six",6);
		System.out.println(l);
		System.out.println(l.get("one"));
		System.out.println(l.get("seven"));
		System.out.println(l.containsKey("one"));
		System.out.println(l.containsValue(1));
		Set<String> m=l.keySet();
		Iterator<String> s=m.iterator();
		while(s.hasNext())
		{
			String s1=s.next();
			System.out.println(l.get(s1)+" ");
		}
	}
}
