package LambdaConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<String> func = x1 -> x1.toUpperCase();
		
		System.out.println(func.apply("test"));
		
		
		UnaryOperator<Integer> func1 = x1 -> x1*7;
		
		System.out.println(func1.apply(2));
		
		
		Function<Integer, Integer> func2 = x1 -> x1*10;
		
		System.out.println(func2.apply(3));
		
		List<String> langlist = new ArrayList<String>();
		langlist.add("Java");
		langlist.add("Ruby");
		langlist.add("Python");
		System.out.println(langlist);
		langlist.replaceAll(ele -> ele + " Jith");
		System.out.println(langlist);

	}

}
