package LambdaConcepts;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Integer> func = (x1,x2) -> x1+x2;
		
		int result = func.apply(10, 20);
		System.out.println(result);
		
		BinaryOperator<Double> func3 = (x1,x2) -> x1+x2;
		
		double res1 = func3.apply(1.2, 3.4);
		System.out.println(res1);
		
		//BiFunction interface
		BiFunction<Integer,Integer,Integer> func1 = (x1,x2) -> x1+x2;
		
		int res = func1.apply(12, 13);
		System.out.println(res);

	}

}
