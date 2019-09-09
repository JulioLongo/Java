package application;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Júlio");
		list.add("Júlio");
		list.add("Júlio");
		list.add(2, "ze");
		
		System.out.println(list.size());
		
		list.remove("ze");
		
		System.out.println(list.indexOf("Júlio"));
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
	}
	
}
