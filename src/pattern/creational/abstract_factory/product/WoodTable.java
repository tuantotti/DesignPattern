package pattern.creational.abstract_factory.product;

import java.time.LocalDateTime;

public class WoodTable implements Table {
    @Override
    public String display() {
        return "Wood Table: " + LocalDateTime.now();
    }
}
