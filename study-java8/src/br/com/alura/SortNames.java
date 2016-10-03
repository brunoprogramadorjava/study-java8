package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortNames {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Bruno Rodrigues");
		names.add("Dayani");
		names.add("Gabriel");
		names.add("Filipe");
		
		Comparator<String> comparator = new ComparatorOfNamesByLength();
		names.sort(comparator);
		
		Consumer<String> consumer = new ConsumerOfNames();
		names.forEach(consumer);
	}
}

class ComparatorOfNamesByLength implements Comparator<String>{

	@Override
    public int compare(String name1, String name2) {
        if(name1.length() < name2.length()) 
            return -1;
        if(name1.length() > name2.length()) 
            return 1;
        return 0;
    }
}

class ConsumerOfNames implements Consumer<String>{

	@Override
	public void accept(String name) {
		System.out.println(name);	
	}	
}
