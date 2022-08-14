package pattern.structural.decorator.decorator;

import pattern.structural.decorator.Size;
import pattern.structural.decorator.component.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Mocha ";
    }

    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.SMALL)
            cost += .10;
        if (beverage.getSize() == Size.MEDIUM)
            cost += .15;
        if (beverage.getSize() == Size.LARGE)
            cost += .20;

        return cost;
    }
}
