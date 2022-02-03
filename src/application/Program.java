package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//Hash (implementa��o mais r�pida, mas que n�o garante a ordem de impress�o)
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println("Existe o componente Notebook? " + set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}
