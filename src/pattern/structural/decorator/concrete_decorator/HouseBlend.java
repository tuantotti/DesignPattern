package pattern.structural.decorator.concrete_decorator;

import pattern.structural.decorator.component.Beverage;

// House Blend: trà trộn
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
