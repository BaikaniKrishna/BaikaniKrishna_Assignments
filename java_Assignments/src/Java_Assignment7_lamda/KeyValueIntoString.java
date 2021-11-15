package Java_Assignment7_lamda;

import java.util.HashMap;
import java.util.Map.Entry;

public class KeyValueIntoString
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		hs.put(1, "Product");
		hs.put(2, "Type");
		hs.put(3, "payment");
		hs.put(4, "delivery");
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The elements in the hashmap are:");
		System.out.println(hs);
		System.out.println("-----------------------------------------------------------------");
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:hs.entrySet()) 
		{
			sb.append(m);
		}
		System.out.println(sb);
		System.out.println("-----------------------------------------------------------------");
	}

}
