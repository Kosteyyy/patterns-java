package factory.simpleFactory;


public class Factory {
 
	public static void main(String args[]) {
		
		System.out.println("Hello, i'm Factory creating program");

		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		store.orderPizza("cheese");
 
	}
}