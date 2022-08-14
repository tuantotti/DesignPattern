package pattern.structural.decorator.component;

import pattern.structural.decorator.Size;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected Size size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
