package pattern.creational.abstract_factory.factory;

import pattern.creational.abstract_factory.product.Chair;
import pattern.creational.abstract_factory.product.Table;
import pattern.creational.abstract_factory.product.WoodChair;
import pattern.creational.abstract_factory.product.WoodTable;

public class WoodFactory extends AbstractFurnitureFactory {
    @Override
    public Table getTable() {
        return new WoodTable();
    }

    @Override
    public Chair getChair() {
        return new WoodChair();
    }
}
