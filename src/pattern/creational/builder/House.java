package pattern.creational.builder;

public class House {
    private String color;
    private boolean isHaveRoof;
    private boolean isHaveGarden;
    private int numberOfDoor;
    private int numberOfWindows;

    public House(String color, boolean isHaveRoof, boolean isHaveGarden, int numberOfDoor, int numberOfWindows) {
        this.color = color;
        this.isHaveRoof = isHaveRoof;
        this.isHaveGarden = isHaveGarden;
        this.numberOfDoor = numberOfDoor;
        this.numberOfWindows = numberOfWindows;
    }

    public static class HouseBuilder {
        private String color;
        private boolean isHaveRoof;
        private boolean isHaveGarden;
        private int numberOfDoor;
        private int numberOfWindows;

        public HouseBuilder color(String color) {
            this.color = color;
            return this;
        }

        public HouseBuilder isHaveRoof(boolean isHaveRoof) {
            this.isHaveRoof = isHaveRoof;
            return this;
        }

        public HouseBuilder isHaveGarden(boolean isHaveGarden) {
            this.isHaveGarden = isHaveGarden;
            return this;
        }

        public HouseBuilder numberOfDoor(int numberOfDoor) {
            this.numberOfDoor = numberOfDoor;
            return this;
        }

        public HouseBuilder numberOfWindows(int numberOfWindows) {
            this.numberOfWindows = numberOfWindows;
            return this;
        }

        public House build() {
            return new House(color, isHaveRoof, isHaveGarden, numberOfDoor, numberOfWindows);
        }
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", isHaveRoof=" + isHaveRoof +
                ", isHaveGarden=" + isHaveGarden +
                ", numberOfDoor=" + numberOfDoor +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }

    public String getColor() {
        return color;
    }

    public boolean isHaveRoof() {
        return isHaveRoof;
    }

    public boolean isHaveGarden() {
        return isHaveGarden;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
