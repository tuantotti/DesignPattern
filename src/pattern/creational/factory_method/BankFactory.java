package pattern.creational.factory_method;

public class BankFactory {
    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case TECHCOMBANK:
                return new TechcomBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
