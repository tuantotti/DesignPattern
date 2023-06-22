package pattern.creational.prototype;

public class Robot implements Cloneable {
    private String name;
    private String manufacturer;
    private String description;

    public Robot(String name, String manufacturer, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    @Override
    protected Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
