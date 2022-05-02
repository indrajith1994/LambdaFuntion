package LambdaConcepts;

public class LambdaDeclaration {

	public static void main(String[] args) {

		WebPage w1 =  (name)-> {
				// TODO Auto-generated method stub
				System.out.println("hello " +name);
			};
		
		w1.header("world");
		
	}

}
