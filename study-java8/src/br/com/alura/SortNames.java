package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNames {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Bruno Rodrigues");
		names.add("Dayani");
		names.add("Gabriel");
		names.add("Filipe");
		
		Collections.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
