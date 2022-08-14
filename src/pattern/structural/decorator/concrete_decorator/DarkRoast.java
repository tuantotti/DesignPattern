package pattern.structural.decorator.concrete_decorator;

import pattern.structural.decorator.component.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
