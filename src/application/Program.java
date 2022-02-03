package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//Tree (manter a ordem do elementos)
		Set<String> set = new LinkedHashSet<>();

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Notebook");		
		System.out.println("O componete Notebook foi removido!");

		for (String p : set) {
			System.out.println(p);
		}
	}
}
