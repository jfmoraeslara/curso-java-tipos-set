package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		// remove os elementos que atende a alguma característica
		set.removeIf(x -> x.length() >= 3);
		System.out.println("Removendo todos que tenham pelo menos três caracteres.");
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("------------------------------------------------------");
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
				
		set.removeIf(x -> x.charAt(0) == 'T');
		System.out.println("Removendo todos com o caractere inicial T.");
		for (String p : set) {
			System.out.println(p);
		}
	}
}
