package pattern.structural.decorator.concrete_decorator;

import pattern.structural.decorator.component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
