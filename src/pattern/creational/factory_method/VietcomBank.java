package pattern.creational.factory_method;

public class VietcomBank implements Bank {
    public VietcomBank() {
    }


    @Override
    public String getBankName() {
        return "VietcomBank";
    }
}
