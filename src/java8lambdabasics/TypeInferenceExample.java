package java8lambdabasics;

public class TypeInferenceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
		//StringLengthLambda myLambda = (String s) -> s.length();
		//StringLengthLambda myLambda = (s) -> s.length();
		//StringLengthLambda myLambda = s -> s.length();
		//System.out.println(myLambda.getLength("Hello Lambda"));

	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello Lambda"));

	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
}
