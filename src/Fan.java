public class Fan {
    private final byte SLOW = 1;
    private final byte MEDIUM = 2;
    private final byte FAST = 3;
    private double radius = 5;

    public Fan(double radius, int speed, boolean on, String color) {
        this.radius = radius;
        this.speed = speed;
        this.on = on;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private int speed = SLOW;
    private boolean on = false;
    private String color = "blue";

    public Fan() {
    }


    public byte getSLOW() {
        return SLOW;
    }

    public byte getMEDIUM() {
        return MEDIUM;
    }

    public byte getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    ;

    @Override
    public String toString() {
        if(on == true){
            return
                    ", radius=" + radius +
                            ", speed=" + speed +
                            ", fan is on" +
                            ", color='" + color;
        }
       else{
            return
                    ", radius=" + radius +
                            ", speed=" + speed +
                            ", fan is off" +
                            ", color='" + color;
        }
    }
}
