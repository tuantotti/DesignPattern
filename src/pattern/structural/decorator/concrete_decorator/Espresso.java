package pattern.structural.decorator.concrete_decorator;

import pattern.structural.decorator.component.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description + " -- Size: " + this.getSize() + "-- Topping: ";
    }
}
