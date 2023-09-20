public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn() {
        this.on = true;
    }

    public void setOff() {
        this.on = false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
