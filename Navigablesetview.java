package Treemap2;
import java.util.*;

public class Navigablesetview {

	public static void main(String[] args) 
	{
		  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		  
		  tree_map1.put(10, "Red");
		  tree_map1.put(20, "Green");
		  tree_map1.put(40, "Black");
		  tree_map1.put(50, "White");
		  tree_map1.put(60, "Pink");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());

	}

}
