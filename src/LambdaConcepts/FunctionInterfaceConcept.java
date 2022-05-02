package LambdaConcepts;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> func = x -> x.length();
		
		int Len = func.apply("this is java 8");
		System.out.println(Len);
		
//		Chaining Function
		
		Function<Integer, Integer> func2 = x -> x * 2;
		
		int result = func.andThen(func2).apply("This is Java 1.8");
		System.out.println(result);
	}

}
