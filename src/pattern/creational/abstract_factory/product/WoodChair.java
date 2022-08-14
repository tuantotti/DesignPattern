package pattern.creational.abstract_factory.product;

import java.time.LocalDateTime;

public class WoodChair implements Chair {
    @Override
    public String display() {
        return "Wood Chair: " + LocalDateTime.now();
    }
}
