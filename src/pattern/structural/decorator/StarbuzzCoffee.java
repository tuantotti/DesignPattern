package pattern.structural.decorator;

import pattern.structural.decorator.component.Beverage;
import pattern.structural.decorator.concrete_decorator.Espresso;
import pattern.structural.decorator.decorator.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso.setSize(Size.MEDIUM);
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription() + "-- Cost: $" + espresso.cost());

//        Beverage darkRoast = new DarkRoast();
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Mocha(darkRoast);
//        darkRoast = new Whip(darkRoast);
//        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
//
//        Beverage houseBlend = new HouseBlend();
//        houseBlend = new Soy(houseBlend);
//        houseBlend = new Mocha(houseBlend);
//        houseBlend = new Whip(houseBlend);
//        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

    }
}
