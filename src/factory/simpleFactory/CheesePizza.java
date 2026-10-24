package factory.simpleFactory;

public class CheesePizza extends Pizza{
    public CheesePizza() {
        this.name = "cheese";
        System.out.println("Создали пиццу Cheese 1, имя: " + this.name);
    }
}
