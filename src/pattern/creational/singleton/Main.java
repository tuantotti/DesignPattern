package pattern.creational.singleton;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Government government = Government.getInstance();
        government.setName("Nguyen Van Tuan");
        government.setBirthday(new Date(2001 - 1900, 02, 14));

        System.out.println(government);

        Government government1 = Government.getInstance();

        boolean isEqual = government.equals(government1);
        System.out.println(isEqual);
    }
}
