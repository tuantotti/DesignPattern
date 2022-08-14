package pattern.creational.abstract_factory.factory;

public class FurnitureFactory {
    public static AbstractFurnitureFactory getFurniture(MaterialType materialType) {
        switch (materialType) {
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new IllegalArgumentException("This material type is unsupported");
        }
    }
}
