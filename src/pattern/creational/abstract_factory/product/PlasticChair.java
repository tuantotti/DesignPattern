package pattern.creational.abstract_factory.product;

import java.time.LocalDateTime;

public class PlasticChair implements Chair {
    @Override
    public String display() {
        return "Plastic Chair: " + LocalDateTime.now();
    }
}
