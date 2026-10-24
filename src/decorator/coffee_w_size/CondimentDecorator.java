package decorator.coffee_w_size;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();

	public Size getSize() {
		return beverage.getSize();
	}
}
