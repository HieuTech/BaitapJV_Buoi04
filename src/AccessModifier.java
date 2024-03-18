public class AccessModifier {

    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getRadius(){

    }
    public void getAres(){

    }
}
