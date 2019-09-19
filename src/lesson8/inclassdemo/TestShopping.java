package inclasslecturedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class TestShopping 
{	public static void main(String[] args) {
	List<Shopping> list = new ArrayList<>();
	list.add(new Shopping("Samsung Galaxy",459.67));
	list.add(new Shopping("Lenova Tab",125.66));
	list.add(new Shopping("MP3 Player",34.66));
	list.add(new Shopping("IPad",599.67));

	
	Shopping s1 = new Shopping("Samsung Galaxy",459.67);
	Shopping s2 = new Shopping("Samsung Galaxy",300.00);
	
	// Check both are same using equals()
	
	boolean res = s1.equals(s2); // false
	System.out.println("s1==s2 using equals: " + res);
	
	// Compare two objects using ItemSoryByName Comparator
	
	ItemSoryByName com = new ItemSoryByName();
	int re = com.compare(s1, s2);
	System.out.println("s1==s2 using comparator : " + re);
	
	ConsistEqaulCom ob = new ConsistEqaulCom();
	
	int re1 = ob.compare(s1, s2);
	System.out.println("s1==s2 using consist comparator : " + re1);
	
	
	// Morning we learned about Sorting based on individual fields like namewise, pricewise
	
	
	
	// Now we are going to learn about comparator must consist with equals()
	
}
}
