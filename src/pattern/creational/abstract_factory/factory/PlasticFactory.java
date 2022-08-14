package pattern.creational.abstract_factory.factory;

import pattern.creational.abstract_factory.product.Chair;
import pattern.creational.abstract_factory.product.PlasticChair;
import pattern.creational.abstract_factory.product.PlasticTable;
import pattern.creational.abstract_factory.product.Table;

public class PlasticFactory extends AbstractFurnitureFactory {
    @Override
    public Table getTable() {
        return new PlasticTable();
    }

    @Override
    public Chair getChair() {
        return new PlasticChair();
    }
}
