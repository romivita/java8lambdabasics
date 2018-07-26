package java8LambdaBasics;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		Greeting lambdaGreeting = () -> System.out.println("Hello World LF!");
		
		//Anonymous Inner Class
		Greeting innerClassGreeting = new Greeting() {
			public void perform () {
				System.out.println("Hello world AC!");
			}
		};
		
		helloWorldGreeting.perform();
		lambdaGreeting.perform();
		innerClassGreeting.perform();
		
		greeter.greet(helloWorldGreeting);
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
		//MyAdd addFunction = (int a, int b) -> a + b; 
	}
	
}

/*
interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int x, int y);
}
*/