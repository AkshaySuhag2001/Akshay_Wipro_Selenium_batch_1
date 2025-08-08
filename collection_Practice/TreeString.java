package collection_Practice;

import java.util.TreeSet;

public class TreeString {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Akshay");
		treeSet.add("Rahul");
		treeSet.add("Pankaj");
		treeSet.add("Xavier");		
		
		for(String i : treeSet) {
			System.out.println(i);
		}

	}

}
