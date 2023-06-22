package pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        House house = House.builder()
                .color("red")
                .numberOfWindows(12)
                .numberOfDoor(10)
                .isHaveGarden(true)
                .build();

        System.out.println(house);
    }
}
