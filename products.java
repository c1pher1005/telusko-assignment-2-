public class Product {
    private String name;
    private String type;
    private String place;
    private String color;
    private boolean isOutOfWarranty;

    public Product(String name, String type, String place, String color, boolean isOutOfWarranty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.color = color;
        this.isOutOfWarranty = isOutOfWarranty;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOutOfWarranty() {
        return isOutOfWarranty;
    }

    public void setOutOfWarranty(boolean outOfWarranty) {
        isOutOfWarranty = outOfWarranty;
    }
}
