package LambdaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> func = x -> x >5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> collect = list.stream().filter(func).collect(Collectors.toList());
		System.out.println(collect);
	}

}
