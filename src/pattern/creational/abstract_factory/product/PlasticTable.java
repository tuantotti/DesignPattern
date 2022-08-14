package pattern.creational.abstract_factory.product;

import java.time.LocalDateTime;

public class PlasticTable implements Table {
    @Override
    public String display() {
        return "Plastic Table: " + LocalDateTime.now();
    }
}
