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

		System.out.println("Existe o componente Notebook? " + set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}
