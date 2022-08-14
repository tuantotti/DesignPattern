package pattern.creational.abstract_factory.factory;

import pattern.creational.abstract_factory.product.Chair;
import pattern.creational.abstract_factory.product.Table;

public abstract class AbstractFurnitureFactory {
    public abstract Table getTable();

    public abstract Chair getChair();
}
