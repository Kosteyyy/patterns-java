package decorator.coffee_w_size;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		double cost = beverage.cost();
		if (null != beverage.getSize()) switch (beverage.getSize()) {
                case TALL:
                    cost += .15;
                    break;
                case GRANDE:
                    cost += .20;
                    break;
                case VENTI:
                    cost += .25;
                    break;
                default:
                    break;
            }
		return cost;
	}
}
