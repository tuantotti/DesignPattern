package pattern.structural.decorator.decorator;

import pattern.structural.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
}
