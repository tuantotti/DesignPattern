package pattern.creational.factory_method;

import static pattern.creational.factory_method.BankFactory.getBank;
import static pattern.creational.factory_method.BankType.TECHCOMBANK;

public class Client {
    public static void main(String[] args) {
        Bank bank = getBank(TECHCOMBANK);
        System.out.println(bank.getBankName());
    }
}
