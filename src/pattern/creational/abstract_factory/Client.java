package pattern.creational.abstract_factory;

import pattern.creational.abstract_factory.factory.AbstractFurnitureFactory;
import pattern.creational.abstract_factory.product.Table;

import static pattern.creational.abstract_factory.factory.FurnitureFactory.getFurniture;
import static pattern.creational.abstract_factory.factory.MaterialType.PLASTIC;

public class Client {
    public static void main(String[] args) {
        /*Eg. Get a plastic table*/
        AbstractFurnitureFactory abstractFurnitureFactory = getFurniture(PLASTIC);
        Table table = abstractFurnitureFactory.getTable();
        System.out.println(table.display());
    }
}
